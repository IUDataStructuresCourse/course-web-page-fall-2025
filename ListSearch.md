# Lab: List Search

Prove the following theorem about the `search` provided in the
following file that you should `import`.

[Search.pf](./Search.pf)

You will also need to import the following files from Deduce's library.

```
import UInt
import List
import Pair
import Base
import Option
```

```
theorem search_correct: all y: UInt, xs: List<UInt>.
    define front = first(search(xs, y));
    define back = second(search(xs, y));
    (back = [] or head(back) = just(y)) and
    not (contains(front, y)) and
    front ++ back = xs 
proof
  ?
end
```



