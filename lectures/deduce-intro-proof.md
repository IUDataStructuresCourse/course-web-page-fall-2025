# Writing Proofs in Deduce

In this lecture we begin to learn how to write proofs in Deduce.

The proofs will use the definitions from the [previous lecture](./DeduceProgramming.pf).

Concepts:
* [`theorem`](https://jsiek.github.io/deduce/pages/reference.html#theorem-statement) statement
* [`true`](https://jsiek.github.io/deduce/pages/reference.html#true-formula) formula
* [period](https://jsiek.github.io/deduce/pages/reference.html#period-proof-of-true)

Example:
```{.deduce^#prove_true}
theorem prove_true: true
proof
  .
end
```


Concepts:
* [`expand`](https://jsiek.github.io/deduce/pages/reference.html#expand-proof) proof
* [`show`](https://jsiek.github.io/deduce/pages/reference.html#show-proof) 

Examples:
```{.deduce^#len_empty}
theorem len_empty: 0 = len(Empty)
proof
  expand len.     // len(Empty) = 0
end
```

```{.deduce^#ex_expand}
theorem ex_expand: search([4, 3, 8], 8) = 2
proof
  expand search
  show 1 + search([3, 8], 8) = 2
  expand search
  show 2 + search([8], 8) = 2
  expand search
  .
end
```

Concepts:
* [`all`](https://jsiek.github.io/deduce/pages/reference.html#all-universal-quantifier) formula,
* [`arbitrary`](https://jsiek.github.io/deduce/pages/reference.html#arbitrary-forall-introduction) proof,

Example:
```{.deduce^#len_one}
theorem len_one: all x:UInt. len(Node(x, Empty)) = 1
proof
  arbitrary x:UInt
  expand len | len.
end
```

Concepts:
* [proof instantiation](https://jsiek.github.io/deduce/pages/reference.html#instantiation-proof)
* [`replace`](https://jsiek.github.io/deduce/pages/reference.html#replace-proof)

Examples:
```{.deduce^#len_42}
theorem len_42:  1 = len(Node(42, Empty))
proof
  replace len_one[42].
end
```

```{.deduce^#first_pair_123}
theorem first_pair_123: first(second(pair(1,pair(2,3)))) = 2
proof
  replace second_pair
  show first(pair(2, 3)) = 2
  replace first_pair.
end
```

Concepts:
* [`if`-`then`](https://jsiek.github.io/deduce/pages/reference.html#if-then-conditional-formula) formula
* [`assume`](https://jsiek.github.io/deduce/pages/reference.html#assume) proof
* [`apply`-`to`](https://jsiek.github.io/deduce/pages/reference.html#apply-to-proof-modus-ponens) proof
* [`have`](https://jsiek.github.io/deduce/pages/reference.html#have-proof-statement)
* [`recall`](https://jsiek.github.io/deduce/pages/reference.html#recall-proof) proof

Example:
```{.deduce^#if_commute}
theorem if_commute: all P:bool, Q:bool, R:bool.
  if (if P then if Q then R) then (if Q then if P then R)
proof
  arbitrary P:bool, Q:bool, R:bool
  assume pqr: if P then if Q then R
  assume: Q
  assume: P
  have qr: if Q then R  by apply pqr to (recall P)
  apply qr to (recall Q)
end  
```


Concepts:
* [`and`](https://jsiek.github.io/deduce/pages/reference.html#and-logical-conjunction)
* [`conjunct`](https://jsiek.github.io/deduce/pages/reference.html#conjunct)
* [comma](https://jsiek.github.io/deduce/pages/reference.html#comma-logical-and-introduction)

Example:
```{.deduce^#ex_and}
theorem ex_and: all P:bool, Q:bool, R:bool. if P and Q and R then R and P
proof
  arbitrary P:bool, Q:bool, R:bool
  assume pqr
  have r: R by conjunct 2 of pqr
  have p: P by conjunct 0 of pqr
  r, p
end
```


<!--
```{.deduce^file=DeduceIntroProof.pf}
import UInt
import DeduceProgramming
import List
import Pair

<<prove_true>>
<<len_empty>>
<<ex_expand>>
<<len_one>>
<<len_42>>
<<first_pair_123>>
<<if_commute>>
<<ex_and>>
```
-->




<!--
Defer to later:

* [`suffices`](https://jsiek.github.io/deduce/pages/reference.html#suffices-proof-statement) proof
* [`evaluate`](https://jsiek.github.io/deduce/pages/reference.html#evaluate-proof) proof.

-->