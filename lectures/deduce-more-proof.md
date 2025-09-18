Concepts:
* `or` formulas
* `cases`
* implicit `or` introduction

```{.deduce^#ex_or_commute}
theorem ex_or_commute: all P:bool, Q:bool. if (P or Q) then (Q or P)
proof
  arbitrary P:bool, Q:bool
  assume pq: P or Q
  cases pq
  case p {
    conclude Q or P by p
  }
  case q {
    conclude Q or P by q
  }
end
```

Concepts:
* [`false`](https://jsiek.github.io/deduce/pages/reference.html#false) formula
* [`conclude`](https://jsiek.github.io/deduce/pages/reference.html#conclude-proof) proof

Example:
```{.deduce^#false_explosion}
theorem false_explosion: if false then 0 = 1
proof
  assume: false
  conclude 0 = 1 by recall false
end
```

Concepts:
* [`not`](https://jsiek.github.io/deduce/pages/reference.html#not) formula: `not P` is short for `if P then false`.
* To prove `not P`, `assume P` then prove `false`.
* [`contradict`](https://jsiek.github.io/deduce/pages/reference.html#contradict-proof) proof

```{.deduce^#de_morgan_variant}
theorem de_morgan_variant: all P:bool, Q:bool. if not (P or Q) then (not P) and (not Q)
proof
  arbitrary P:bool, Q:bool
  assume not_pq: not (P or Q)

  have: not P
  proof
    assume: P
    have pq: P or Q   by recall P
    contradict pq, not_pq    
  end

  have: not Q
  proof
    assume: Q
    have pq: P or Q   by recall Q
    contradict pq, not_pq    
  end
    
  conclude (not P) and (not Q) by  (recall not P), (recall not Q)
end
```

Concepts:
* Library of theorems about unsigned integers (`lib/UInt.thm`)
* [`equations`](https://jsiek.github.io/deduce/pages/reference.html#equations)
* Marking with `#` symbols to control `replace` and target right-hand side.

Example:
```{.deduce^#algebra_example}
theorem algebra_example: all x:UInt. (1 + x)*(2 + x) = x^2 + 3*x + 2
proof
  arbitrary x:UInt
  equations
        (1 + x)*(2 + x)
      = (1 + x)*2 + (1 + x)*x  by replace uint_dist_mult_add.
  ... = 2 + x*2 + x + x^2      by replace uint_dist_mult_add_right.
  ... = 2 + 2*x + x + x^2      by replace uint_mult_commute[x,2].
  ... = 2 + #(2 + 1)*x# + x^2  by replace uint_dist_mult_add_right[2,1,x].
  ... = 3*x + 2 + x^2          by replace uint_add_commute[2,3*x].
  ... = x^2 + 3*x + 2          by replace uint_add_commute[3*x + 2, x^2].
end
```

Concepts:
* `induction` on lists

Example:
```{.deduce^#list_append_empty}
theorem list_append_empty: <U> all xs :List<U>.
  xs ++ [] = xs
proof
  arbitrary U:type
  induction List<U>
  case [] {
    conclude @[]<U> ++ [] = []  by expand operator++.
  }
  case node(n, xs') assume IH: xs' ++ [] = xs' {
    equations
          node(n, xs') ++ []
        = node(n, xs' ++ [])    by expand operator++.
    ... = node(n, xs')          by replace IH.
  }
end
```

Concepts:
* [`switch`](https://jsiek.github.io/deduce/pages/reference.html#switch-proof) proof
* [`replace`-`in`](https://jsiek.github.io/deduce/pages/reference.html#replace-in-proof)
* [`expand`-`in`](https://jsiek.github.io/deduce/pages/reference.html#expand-in-proof)

Example:
```{.deduce^#switch_example}
theorem switch_example: all xs:UIntList. if len(xs) = 0 then xs = Empty
proof
  arbitrary xs:UIntList
  assume premise: len(xs) = 0
  switch xs {
    case Empty {
      .
    }
    case Node(x, xs') assume xs_node: xs = Node(x, xs') {
      have len_zero: len(Node(x, xs')) = 0 by replace xs_node in premise
      conclude false by expand len in len_zero
    }
  }
end
```

Concepts:
* Practice with `or` and `cases`.

```{.deduce^#contains_append}
theorem contains_append: <T> all xs:List<T>, ys:List<T>, z:T.
  if contains(xs ++ ys, z)
  then contains(xs, z) or contains(ys, z)
proof
  arbitrary T:type
  induction List<T>
  case [] {
    arbitrary ys:List<T>, z:T
    expand operator++
    assume z_in_ys
    z_in_ys
  }
  case node(x, xs') assume IH {
    arbitrary ys:List<T>, z:T
    expand operator++ | contains
    assume prem: x = z or contains(xs' ++ ys, z)
    show x = z or contains(xs', z) or contains(ys, z)
    cases prem
    case: x = z {
      recall x = z
    }
    case z_in_xs_ys {
      have IH_conc: contains(xs', z) or contains(ys, z) by apply IH to z_in_xs_ys
      IH_conc
    }
  }
end
```


Concepts
* `ex_mid`  law of excluded middle
* `eq_true` combine with `replace` to resolve `if`-`then` terms
* `eq_false` combine with `replace` to resolve `if`-`then` terms

Here's the definition of `remove` from `List.pf`:
```
recursive remove<T>(List<T>, T) -> List<T> {
  remove(empty, y) = empty
  remove(node(x, xs'), y) =
    if x = y then
      xs'
    else
      node(x, remove(xs', y))
}
```

Example proof using `ex_mid`, `eq_true`, and `eq_false`.

```{.deduce^#remove_xy}
theorem remove_xy: all x:UInt, y:UInt.
  remove([x], y) = [x] or remove([x],y) = []
proof
  arbitrary x:UInt, y:UInt
  expand remove
  cases ex_mid[x = y]
  case xy: x = y {
    have xy_true: (x = y) = true by apply eq_true to xy
    replace xy_true.
  }
  case not_xy: not (x = y) {
    have xy_false: (x = y) = false by apply eq_false to not_xy
    replace xy_false
    show node(x, remove(@[]<UInt>, y)) = [x]
    expand remove.
  }
end
```

<!--
```{.deduce^file=DeduceIntroProof2.pf}
import UInt
import DeduceProgramming
import DeduceIntroProof
import Base
import List

<<ex_or_commute>>
<<false_explosion>>
<<de_morgan_variant>>
<<algebra_example>>
<<list_append_empty>>
<<switch_example>>
<<contains_append>>
<<remove_xy>>
```
-->

