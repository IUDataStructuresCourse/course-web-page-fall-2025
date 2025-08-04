# Deduce Proof Exercise 1

## Overview

For this assignment, you will get started writing your own proofs of theorems
in Deduce.

As a reminder, you can refer to the [Deduce Reference Manual](https://jsiek.github.io/deduce/pages/reference.html),
as well as to [introduction to proofs in deduce](https://jsiek.github.io/deduce/pages/deduce-proofs.html#)
for reminders on proof strategies and keywords.

## Learning Goals

These exercises are meant for you to practice the following logical concepts in Deduce:
* `all` formulas, `arbitrary`, and instantiation.
* `if`-`then` formulas, `assume`, `apply`
* `and` formulas, `conjunct`, combining proofs with comma.
* `expand` a definition
* `replace` equals for equals


## Problems

(1) Complete the following proof.

```{.deduce^#append_xy}
theorem append_xy: all T:type. all x:T, y:T.
  node(x, empty) ++ node(y, empty) = node(x, node(y, empty))
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

(3) Prove that if `xs = []`, then `length(xs) = 0`.

```{.deduce^#equal_empty_length_zero}
theorem equal_empty_length_zero: all T:type, xs:List<T>.
  if xs = []
  then length(xs) = 0
proof
  ?
end
```

(4) Prove that if `P`, then `P and P`.

```{.deduce^#ex_all_if_and}
theorem ex_all_if_and: all P:bool. if P then P and P
proof
  arbitrary P:bool
  assume p: P
  p, p
end
```

(5) Prove that if `if P  then Q` and `if Q then R`, then `if P then R`.

``````{.deduce^#ex_if3}
theorem ex_if3: all P:bool, Q:bool, R:bool.
  if (if P then Q) and (if Q then R)
  then (if P then R)
proof
  ?
end
```

(6) Prove that if `if P then (if Q then R)` and `if P then Q` and also `P`, then `R`.

```{.deduce^#ex_if_if}
theorem ex_if_if: all P:bool, Q:bool, R:bool. if (if P then (if Q then R)) and (if P then Q) and P then R
proof
  ?
end
```
