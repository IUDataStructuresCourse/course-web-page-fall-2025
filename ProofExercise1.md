# Deduce Proof Exercise 1

## Overview

For this assignment, you will get started writing your own proofs of theorems
in Deduce.

As a reminder, you can refer to the following
* [Deduce Reference Manual](https://jsiek.github.io/deduce/pages/reference.html),
* [Introduction to proofs in Deduce](https://jsiek.github.io/deduce/pages/deduce-proofs.html)
* [Cheat Sheet for Proofs](https://jsiek.github.io/deduce/pages/cheat-sheet.html)

## Learning Goals

These exercises are meant for you to practice the following logical concepts in Deduce:
* [`all` formulas](https://jsiek.github.io/deduce/pages/reference.html#all-universal-quantifier), [`arbitrary`](https://jsiek.github.io/deduce/pages/reference.html#arbitrary-forall-introduction), and [proof instantiation](https://jsiek.github.io/deduce/pages/reference.html#instantiation-proof).
* [`if`-`then` formulas](https://jsiek.github.io/deduce/pages/reference.html#if-then-conditional-formula), [`assume`](https://jsiek.github.io/deduce/pages/reference.html#assume), [`apply`-`to`](https://jsiek.github.io/deduce/pages/reference.html#apply-to-proof-modus-ponens)
* [`and` formulas](https://jsiek.github.io/deduce/pages/reference.html#and-logical-conjunction), [`conjunct`](https://jsiek.github.io/deduce/pages/reference.html#conjunct), combining proofs with [comma](https://jsiek.github.io/deduce/pages/reference.html#comma-logical-and-introduction).
* [`expand`](https://jsiek.github.io/deduce/pages/reference.html#expand-proof) a definition
* [`replace`](https://jsiek.github.io/deduce/pages/reference.html#replace-proof) equals for equals
* forward reasoning using [`have`](https://jsiek.github.io/deduce/pages/reference.html#have-proof-statement)

## Problems

(1) Complete the following proof. The append function `++` is defined in `lib/List.pf`.

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

(4) Prove that `if P and Q then R` implies `if Q then if P then R`.

```{.deduce^#ex_all_if_and}
theorem ex_all_if_and: all P:bool, Q:bool, R:bool.
  if (if P and Q then R) then (if Q then if P then R)
proof
  ?
end
```

(5) Prove that `if P  then Q` and `if Q then R` implies `if P then R`.

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
