# List Search O(n)

Prove the following theorem about the time complexity of `search`.

You may find [these tips](./bigOtips.md) useful.

You will need to import the following libraries from Deduce

```
import UInt
import List
import Pair
import Base
import BigO
```

This following function returns the number of operations used during search. Using this definition you will
prove that search runs in O(n) time.

```
recfun search_time(n:  UInt) -> UInt
  measure n of UInt
{
  if n = 0 then 1
  else 1 + search_time(n ∸ 1)
}
terminates {
  arbitrary n:UInt
  assume nz: not (n = 0)
  obtain n' where n_1n: n = 1 + n' from apply or_not to uint_zero_or_add_one[n], nz
  replace n_1n.
}
```

```
theorem search_O_n: search_time ≲ O_n
proof
  ?
end
```
