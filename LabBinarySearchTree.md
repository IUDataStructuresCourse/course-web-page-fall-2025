# Binary Search Tree

In this assignment we implement the Search algorithm for Binary Search
Trees and prove that it is correct.

We define a binary tree in Deduce as follows.

```
union Tree<E> {
  EmptyTree
  TreeNode(Tree<E>, E, Tree<E>)
}
```

The following `BST_map` function serves as a specification for how the
Search should behave. The `BST_map` function takes a tree and returns
its mapping from keys to values. Here we make use of the `update` and
`combine` functions from the library `lib/Maps.pf`.

```
recursive BST_map(Tree<Pair<UInt,UInt>>) -> fn UInt -> Option<UInt> {
  BST_map(EmptyTree) = @empty_map<UInt,UInt>
  BST_map(TreeNode(L, kv, R)) =
    update(combine(BST_map(L), BST_map(R)), first(kv), just(second(kv)))
}
```

## Implement Search

Fill in the Search algorithm. It takes a tree and returns a partial
map.  That is, `BST_search` returns a function that takes a key and
returns a value (wrapped in `just`) or `none` if there is no entry for
the key. The Search algorithm should be linear time with respect to
the height of the tree. (`BST_map` is linear in the size of the tree,
which is much worse.)

```
recursive BST_search(Tree<Pair<UInt,UInt>>) -> fn UInt -> Option<UInt> {
  FILL ME IN
}
```

## The Binary Search Tree Property

Next we formalize the Binary Search Tree Property.  First we define
the following auxilliary function that returns all the keys in a tree.

```
recursive BST_keys(Tree<Pair<UInt,UInt>>) -> Set<UInt> {
  BST_keys(EmptyTree) = ∅
  BST_keys(TreeNode(L,kv,R)) = single(first(kv)) ∪ BST_keys(L) ∪ BST_keys(R)
}
```

The Binary Search Tree Property says that, for every node in the tree,
its key is greater than all the keys in the left subtree and less than
all the keys in the right subtree. Here's a formulation of this as a
recursive function.

```
recursive is_BST(Tree<Pair<UInt,UInt>>) -> bool {
  is_BST(EmptyTree) = true
  is_BST(TreeNode(L, kv, R)) =
    (all l:UInt. if l ∈ BST_keys(L) then l < first(kv))
    and (all r:UInt. if r ∈ BST_keys(R) then first(kv) < r)
    and is_BST(L) and is_BST(R)
}
```

## Prove that Search is Equivalent to `BST_map`

Prove the following theorem.

```
theorem BST_search_map: all T:Tree<Pair<UInt,UInt>>.
  if is_BST(T) then BST_search(T) = BST_map(T)
proof
  ?
end
```

The file [BinarySearchTreeStarter.pf](./BinarySearchTreeStarter.pf) 
includes the above definitions as well as a helpful theorem
`BST_keys_map_none`.
