# Deduce Big-O proofs

## Deduce Big-O library

The Deduce Big-O library defines a few functions for some different common Big-O asymptotic bounds.

For example, `O(1)` in deduce is defined as a function that takes in a `UInt` and returns `1`. 
`O(n)` is a function that takes in a `UInt`, `n`, and returns `n`. etc.

```
fun O_1(n:UInt) {
  1
}

fun O_log(n:UInt) {
  log(n)
}

fun O_n(n:UInt) {
  n
}

fun O_n2(n:UInt) {
  n * n
}
```

The Deduce Big-O library also provides a couple operators that you can use on functions, but the most 
important one is the asymptotic less-or-equal operator `≲`. This is the "Big-O" operator that you use
to say that a function `f` is Big-O `g`.

In Deduce, it is defined as:

```
fun operator ≲(f:(fn UInt -> UInt), g:(fn UInt -> UInt)) {
  some n0:UInt,c:UInt. (all n:UInt. (if n0 ≤ n then f(n) ≤ c * g(n)))
}
```

Which is the same definition as what you learned in class:

```
∃ k c. ∀ n ≥ k. f(n) ≤ c g(n).
```

## UInt induction

There is something else you need to know before we can actually get into Big-O proofs. `UInt` in Deduce
is defined in a way that makes induction not so straight forward. Instead of just saying `induction UInt`
in a proof, we need to use a special theorem instead.

There are two theorems which we can use to perform induction on `UInt`: `uint_induction` and `uint_k_induction`.
Both of these theorems state very similar facts. 

```
theorem uint_induction: all P:fn UInt -> bool.
  if P(0) and (all m:UInt. if P(m) then P(1 + m))
  then all n : UInt. P(n)
```

This theorem states that for any proposition on `UInt`, if that proposition is true for `0` and when the proposition
is true for some number `m` it is true for `m+1`, then that proposition is true for all numbers. If you recall
the definition of induction you will notice that this is exactly that. 

`uint_k_induction` is very similar except that we don't start at `0`. You can start your induction at any number
`k` and the logic is exactly the same:

```
theorem uint_k_induction: all P: fn UInt -> bool, k:UInt.
  if (P(k) and (all m:UInt. (if P(m) then P(1 + m))))
  then all n:UInt. if k ≤ n then P(n)
```

Here is an example proof using `uint_induction`

```
theorem uint_comm_ex: all x:UInt. x + 1 = 1 + x
proof
  // Define your proposition to be the same as your proof statement
  define P = fun x:UInt { x + 1 = 1 + x }

  // Prove the base case. Here 0 since I'm using uint_induction
  // I could use some other number but I would have to use uint_k_induction
  have base: P(0) by {
    expand P.
  }

  // Prove the inductive case. This is just like regular deduce induction,
  // you just have to explicitly assume your IH and everything.
  have ind: all m:UInt. (if P(m) then P(1 + m)) by {
    arbitrary m:UInt
    expand P
    assume IH
    replace IH.
  }

  // Finally apply uint_induction and expand out P to match your theorem statement.
  expand P in apply uint_induction[P] to base, ind
end
```

## Deduce Big-O Proofs

Suppose I had the following function `f` that I wanted to prove was `O(n)`.
```
fun f(x:UInt) {
	x + 10
}
```

Here is what I would do:
```
theorem easy_bigo: f ≲ O_n
proof
  expand operator ≲
  
  // choose my k and n0. This is did on paper using this formula
  // to make sure it was correct:
  // ∃ k c. ∀ n ≥ k. f(n) ≤ c g(n).
  choose 10, 2

  // define my proposition to prove using uint_induction
  define P = fun x:UInt { f(x) <= 2 * O_n(x)  }

  // prove base case
  have base: P(10) by {
    expand P | f | O_n.
  }

  // prove induction case
  // I highly recommend taking a look at some of the
  // UInt theorems I used as they are very useful in 
  // these big-o proofs.
  have ind: (all m:UInt. (if P(m) then P(1 + m))) by {
    arbitrary m:UInt
    expand P | f | O_n
    assume G
    replace uint_dist_mult_add

    have: 1 <= 2 by expand operator <=.
    apply uint_add_mono_less_equal[1, m + 10, 2, 2 * m] to (recall 1 <= 2), G
  }

  // finish by applying uint_induction
  expand P in apply uint_k_induction[P, 10] to base, ind
end
```
