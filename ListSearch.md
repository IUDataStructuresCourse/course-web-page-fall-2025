# Lab: List Search

Prove the following theorem about the `search` function provided in the
following file:

[Search.pf](./Search.pf)

You should `import Search` in the file that you submit.
You will also need to import several files from Deduce's library.


```
import UInt
import List
import Pair
import Base
import Option
import Search
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



