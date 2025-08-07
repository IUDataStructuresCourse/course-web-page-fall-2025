# Deduce Proof Exercise 2


## Learning Goals

* [`induction`](https://jsiek.github.io/deduce/pages/reference.html#induction) proof method
* [logical `or`](https://jsiek.github.io/deduce/pages/reference.html#or-logical-disjunction) and the [`cases`](https://jsiek.github.io/deduce/pages/reference.html#cases-disjunction-elimination) proof method
* [logical `not`](https://jsiek.github.io/deduce/pages/reference.html#not) and the [`contradict`](https://jsiek.github.io/deduce/pages/reference.html#contradict-proof) proof method
* [`equations`](https://jsiek.github.io/deduce/pages/reference.html#equations)
* [the `some` quantifier](https://jsiek.github.io/deduce/pages/reference.html#some-formula), [`obtain`](https://jsiek.github.io/deduce/pages/reference.html#obtain-proof), and [`choose`](https://jsiek.github.io/deduce/pages/reference.html#choose-proof)
* resolve [`if`-`then`-`else` terms](https://jsiek.github.io/deduce/pages/reference.html#if-then-else-term) using `ex_mid` and `eq_false` from `Base.thm`
* [`define` in terms](https://jsiek.github.io/deduce/pages/reference.html#define-term) and [`define` in proofs](https://jsiek.github.io/deduce/pages/reference.html#define-proof), theorems `first_pair`, `second_pair`, and `pair_first_second` in `Pair.thm`.

## Problems


(1) Complete the following proof about `contains` and the append function `++`.
Hint: use `induction`.

```
theorem append_contains: <T> all xs:List<T>, ys:List<T>, z:T.
  if contains(ys, z)
  then contains(xs ++ ys, z)
proof
  ?
end
```

(2) Prove that `or` is commutative.  Hint: use `cases`.

```
theorem ex_or_commute: all P:bool, Q:bool. if P or Q then Q or P
proof
  ?
end
```

(3) Prove that `if (not not Q) then P` and `not P` implies `not Q`.
(This is good practice for reasoning about `not`.)

```
theorem not2_if_not_not: all P:bool, Q:bool.
  if (if (not not Q) then P) and not P then not Q
proof
  ?
end
```

(4) Prove that adding two odd numbers yields an even number.  The
definition of `Odd` and `Even` are in `UInt.thm`.  Hint: use the
`obtain`, `choose`, and `equations` proof statements. Hint: [this similar 
proof](https://jsiek.github.io/deduce/pages/deduce-proofs.html#reasoning-about-some-exists-and-asking-for-help) could be a helpful resource to get started.

```{.deduce^#addition_of_odds}
theorem addition_of_odds: all x:UInt, y:UInt. 
  if Odd(x) and Odd(y) then Even(x + y)
proof
  ?
end
```

(5) Prove that `remove_all(xs, y)` function really removes the
specified element `y` from the list `xs`. Hint: in the case for `xs =
node(x,xs')`, use `ex_mid` from `Base.thm` to consider the two cases,
`x = y` or `not (x = y)`.  In the case for `x = y`, use `replace` to
resolve the `if` term inside `remove_all`. In the later case, use
`eq_false` from `Base.thm` and `replace` to resolve the `if` term.

```
theorem remove_all_correct: <T> all y:T, xs:List<T>.
  not contains(remove_all(xs, y), y)
proof
  ?
end
```

Write down an alternative definition of `remove_all` that satisfies
the above theorem but behaves differently from the `remove_all` in `List.thm`
for some input.

Come up with a formula that would be false for your alternative version of
`remove_all` but that would be true for the version of `remove_all` in
`List.thm`.


(6) Prove that `unzip` followed by `zip` is produces the original list of pairs.
Hint: use the theorems `first_pair`, `second_pair`, and `pair_first_second`
from `Pair.thm`. It may be helpful to use
[`define`](https://jsiek.github.io/deduce/pages/reference.html#define-proof) in the proof.

```
theorem ex_unzip_zip: <T, U> all xys:List< Pair<T, U> >.
  define xs = first(unzip(xys));
  define ys = second(unzip(xys));
  zip(xs, ys) = xys
proof
  ?
end  
```