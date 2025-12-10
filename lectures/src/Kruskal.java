import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.Map;

interface Graph<V> {
    int numVertices();
    void addEdge(V source, V target);
    Iterable<V> adjacent(V source);
    Iterable<V> vertices();
}

interface Edge<V> {
    V source();
    V target();
}

interface EdgeGraph<V> extends Graph<V> {
    Iterable<Edge<V>> edges();
}

interface DisjointSets<N> {
    void make_set(N x);
    N find(N x);
    N union(N x, N y);
}

public class Kruskal {
    static <V> void kruskal_mst(EdgeGraph<V> G,
                                Map<V, Map<V,Double>> weight,
                                ArrayList<Edge<V>> T,
                                DisjointSets<V> sets)
    {
        for (V v : G.vertices())
            sets.make_set(v);

        ArrayList<Edge<V>> edges = new ArrayList<Edge<V>>();
        for (Edge<V> e : G.edges())
            edges.add(e);

        // REPLACEMENT HERE:
        // We compare edges by looking up their source/target in the weight map
        sort(edges, (e1, e2) -> {
            double w1 = weight.get(e1.source()).get(e1.target());
            double w2 = weight.get(e2.source()).get(e2.target());
            return Double.compare(w1, w2);
        });

        for (Edge<V> e : edges) {
            if (sets.find(e.source()) != sets.find(e.target())) {
                T.add(e);
                sets.union(e.source(), e.target());
            }
        }
    }
}
