# Deduce Proof Exercise 2


## Learning Goals

* `induction` proof method
* logical `or` and the `cases` proof method


## Problems


Complete the following proof about `contains` and the append function `++`.
Hint: use `induction`.

```
theorem append_contains: <T> all xs:List<T>, ys:List<T>, z:T.
  if contains(ys, z)
  then contains(xs ++ ys, z)
proof
  ?
end
```

```
theorem ex_or_commute: all P:bool, Q:bool. if P or Q then Q or P
proof
  ?
end
```


Prove that adding two odd numbers yields an even number.  The
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
