import java.util.HashMap;

public class UnionFind<N> implements DisjointSets<N> {
    HashMap<N, N> parent;
    HashMap<N, Integer> rank;

    public UnionFind() {
        parent = new HashMap<>();
        rank = new HashMap<>();
    }

    public N find(N x) {
        if (x == parent.get(x))
            return x;
        else {
            N rep = find(parent.get(x));
            parent.put(x, rep);
            return rep;
        }
    }

    public void make_set(N x) {
        parent.put(x, x);
        rank.put(x, 0);
    }

    public N union(N x, N y) {
        N rx = find(x);
        N ry = find(y);
        if (rank.get(rx) > rank.get(ry)) {
            parent.put(ry, rx);
            return rx;
        } else {
            parent.put(rx, ry);
            if (rank.get(ry) == rank.get(rx))
                rank.put(ry, rank.get(ry) + 1);
            return ry;
        }
    }

}