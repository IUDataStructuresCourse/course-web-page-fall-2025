# Writing Proofs in Deduce

Concepts:
* [`theorem`](https://jsiek.github.io/deduce/pages/reference.html#theorem-statement) statement
* [`expand`](https://jsiek.github.io/deduce/pages/reference.html#expand-proof) proof

Example:
```{.deduce^#len_empty}
theorem len_empty: 0 = len(Empty)
proof
  expand len.
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

Example:
```{.deduce^#len_42}
theorem len_42:  1 = len(Node(42, Empty))
proof
  replace len_one[42].
end
```



<!--
```{.deduce^file=DeduceIntroProof.pf}
import UInt
import DeduceProgramming1
import Set

<<len_empty>>
<<len_one>>
<<len_42>>
```
-->




<!--
Defer to later:

* [`suffices`](https://jsiek.github.io/deduce/pages/reference.html#suffices-proof-statement) proof
* [`evaluate`](https://jsiek.github.io/deduce/pages/reference.html#evaluate-proof) proof.

-->