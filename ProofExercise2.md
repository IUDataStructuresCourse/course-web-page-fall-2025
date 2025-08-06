# Deduce Proof Exercise 2


## Learning Goals

* `induction` proof method
* logical `or` and the `cases` proof method
* logical `not` and the `contradict` proof method
* `equations`
* the `some` quantifier, `obtain`, and `choose`
* resolve `if` terms using `ex_mid`, `eq_true`, and `eq_false` from `Base.thm`

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

(5) Prove that `remove_all(xs, y)` function really removes the specified
element `y` from the list `xs`. Hint: in the case for `xs = node(x,xs')`,
use `ex_mid` from `Base.thm` to consider the two cases, `x = y` or `not (x = y)`.
Also use `eq_true`, and `eq_false` from `Base.thm` to resolve the `if` term
inside `remove_all`.

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