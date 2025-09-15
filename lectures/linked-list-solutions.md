
Student exercise: implement a `max` algorithm that returns the maximum
element of a `Sequence`.

    public static <T> T max(Sequence<T> s, T zero, BiPredicate<T, T> less);

Solution:

    public static <T> T max(Sequence<T> s, T zero, BiPredicate<T, T> less) {
		T m = zero;
		for (Iter<T> i = s.begin(); !i.equals(s.end()); i.advance()) {
			T c = i.get();
			if (less.test(m, c))
			    m = c;
		}
		return m;
    }

Student in-class exercise: implement Sequence using an array

Solution:

    class Array<T> implements Sequence<T> {
        T[] data;
        public Array(T[] a) { data = a; }
		
        public class ArrayIter implements Iter<T> {
			int pos;
			ArrayIter(int p) { pos = p; }
			public T get() { return data[pos]; }
			public void advance() { ++pos; }
			public Iter<T> clone() { return new ArrayIter(pos); }
			public boolean equals(Iter<T> other) { 
				return pos == ((ArrayIter)other).pos; 
			}
        }
		
        public Iter<T> begin() { return new ArrayIter(0); }
        public Iter<T> end() { return new ArrayIter(data.length); }
    }
