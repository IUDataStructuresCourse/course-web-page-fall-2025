# Proof Exercises

## Overview

For this assignment, you will get started writing your own proofs of theorems
in Deduce.

As a reminder, you can refer to the [Deduce Reference Manual](https://jsiek.github.io/deduce/pages/reference.html),
as well as to [introduction to proofs in deduce](https://jsiek.github.io/deduce/pages/deduce-proofs.html#)
for reminders on proof strategies and keywords.

## Problems

(1) Complete the following proof.

```{.deduce^#append_xy}
theorem append_xy:
  all T:type. all x:T, y:T. [x] ++ [y] = [x, y]
proof
  ?
end
```

(2) Prove that `[1] ++ [2] = [1, 2]` by using the `append_xy` theorem.

```{.deduce^#append_1_2}
theorem append_1_2:
  [1] ++ [2] = [1, 2]
proof
  ?
end
```

(3) Prove the following theorem using the `add_zero` and `mult_one`
theorems from `lib/UInt.pf`.

```{.deduce^#uint_equation_ex}
theorem uint_equation_ex: 
  all x:UInt, y:UInt, z:UInt. x * z + y + x * z = (x + x) * z + y
proof
  ?
end
```


(4) Prove of the following theorem about `length` and `take`.
Hint: you will need to use the `induction` and `switch` proof statements.

```{.deduce^#length_take}
theorem length_take: all T:type. all n:UInt, xs:List<T>.
  if n ≤ length(xs)
  then length(take(xs, n)) = n
proof
  ?
end
```

(5) Using the `replace`-`in` statement, prove the following variation
on the transitivity theorem for `≤`. Prove that if `y = x` and 
`y ≤ z`, then `x ≤ z`.

```{.deduce^#equal_less_trans}
theorem equal_less_trans: all x:UInt, y:UInt, z:UInt.
  if y = x and y ≤ z then x ≤ z
proof
  ?
end
```

(6) Prove that adding two odd numbers yields an even number.  The
definition of `Odd` and `Even` are in `lib/UInt.pf`.  Hint: use the
`obtain`, `choose`, and `equations` proof statements. Hint: [this similar 
proof](https://jsiek.github.io/deduce/pages/deduce-proofs.html#reasoning-about-some-exists-and-asking-for-help) could be a helpful resource to get started.

```{.deduce^#addition_of_odds}
theorem addition_of_odds: all x:UInt, y:UInt. 
  if Odd(x) and Odd(y) then Even(x + y)
proof
  ?
end
```
