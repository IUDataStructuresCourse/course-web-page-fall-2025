# Homework 1, Textbook Exercises

Submit your homework solution on Canvas (as text file, pdf, etc.).

## Chapter 1 Textbook Exercises

### 1.11 part a (proof about Fibonacci numbers and summations)
Let $F$ be the Fibonacci numbers ($F_0 = 1, F_1 = 1, ... F_{k+1} = F_k + F_{k-1}$). Prove the following:
$$\sum_{i=1}^{N-2}F_i = F_N - 2$$

### 1.12 (two proofs about sumations)
Prove the following formulas:

a. $\sum_{i=1}^{N}(2i-1) = N^2$

b. $\sum_{i=1}^{N}i^3 = (\sum_{i=1}^{N}i)^2$
 

## Chapter 2 Textbook Exercises

### 2.1 (function growth rates)

Order the following functions by growth rate:
$N, \sqrt{N}, N^{1.5}, N^2, N\log N, N \log \log N, N \log^2 N, N \log(N^2), 2/N, 2^N, 2^{N/2}, 37, N^2\log N, N^3$.

Indicate which functions grow at the same rate.


### 2.2 (reasoning about big-O)

Suppose $T_1(N) = O(f(N))$ and $T_2(N) = O(f(N))$. Which of the following are true?

a. $T_1(N) + T_2(N) = O(f(N))$  

b. $T_1(N) - T_2(N) = o(f(N))$  

c. $\dfrac{T_1(N)}{T_2(N)} = O(1)$  

d. $T_1(N) = O(T_2(N))$


### 2.5 (reasoning about big-O)

Find two functions $f(N)$ and $g(N)$ such that neither $f(N) = O(g(N))$ nor $g(N) = O(f(N))$.


### 2.7 part a (big-O for example loops (1) through (6))

### 2.24 (analysis of fast exponentiation)

Give a precise count on the number of multiplications used by the fast exponentiation routine. (*Hint:* Consider the binary representation of $N$)

```java
public static long pow( long x, int n )
{
  if( n == 0 )
    return 1;
  if( n == 1 )
    return x;
  if( isEven( n ) )
    return pow( x * x, n / 2 );
  else
    return pow( x * x, n / 2 ) * x;
}
```

### 2.31 (about binary search)

Suppose that line 15 in the binary search routine below had the statement `low = mid` instead of `low = mid + 1`. Would the routine still work?

```java
/**
* Performs the standard binary search.
* @return index where item is found, or -1 if not found.
*/
public static <AnyType extends Comparable<? super AnyType>>
int binarySearch( AnyType [ ] a, AnyType x )
{
  int low = 0, high = a.length - 1;

  while( low <= high )
  {
    int mid = ( low + high ) / 2;

    if( a[ mid ].compareTo( x)<0)
      low = mid + 1; /* Line 15 */
    else if( a[ mid ].compareTo( x )>0)
      high = mid - 1;
    else
      return mid; // Found
  }
  return NOT_FOUND; // NOT_FOUND is defined as -1
 }
```
