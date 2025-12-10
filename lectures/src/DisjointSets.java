public interface DisjointSets<N> {
    void make_set(N x);
    N find(N x);
    N union(N x, N y);
}

