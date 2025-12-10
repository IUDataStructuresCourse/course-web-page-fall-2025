import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Kruskal {
    static <V> void kruskal_mst(EdgeGraph<V> G,
                                Map<V, Map<V, Double>> weight,
                                ArrayList<Edge<V>> T,
                                DisjointSets<V> sets) {
        for (V v : G.vertices())
            sets.make_set(v);

        ArrayList<Edge<V>> edges = new ArrayList<Edge<V>>();
        for (Edge<V> e : G.edges())
            edges.add(e);

        edges.sort((e1, e2) -> {
            return Double.compare(weight.get(e1.source()).get(e1.target()),
                    weight.get(e2.source()).get(e2.target()));
        });

        for (Edge<V> e : edges) {
            if (sets.find(e.source()) != sets.find(e.target())) {
                T.add(e);
                sets.union(e.source(), e.target());
            }
        }
    }

    static int indexOf(Character c, Character[] array) {
        int i;
        for (i = 0; i != array.length; ++i) {
            if (array[i] == c)
                return i;
        }
        return i;
    }
    static class E {
        E(Character s, Character t, int w) { src = s; tgt = t; weight = w;}
        Character src;
        Character tgt;
        double weight;
    }
    static <K,V> void put2(HashMap<K,HashMap<K,V>> map, K key1, K key2, V value) {
        if (! map.containsKey(key1)) {
            map.put(key1, new HashMap<>());
        }
        map.get(key1).put(key2, value);
    }
    public static void main(String[] args) {
        AdjacencyList G = new AdjacencyList(6);
        Character[] nodes = {'A','B','C','D','E','F'};
        E[] edges = { new E('A','B', 1), new E('A','D', 4), new E('A','E', 3),
                      new E('B','E', 2),
                      new E('C','E', 4), new E('C','F', 2),
                      new E('D','E', 4),
                      new E('E','F', 7)};
        HashMap<Integer, HashMap<Integer, Double>> weight = new HashMap<>();
        for (E e : edges) {
            int u = indexOf(e.src, nodes);
            int v = indexOf(e.tgt, nodes);
            G.addEdge(u, v);
            put2(weight, u, v, e.weight);
        }
        ArrayList<Edge<Integer>> MST = new ArrayList<>();
        UnionFind<Integer> disjointSets = new UnionFind<>();
        kruskal_mst((EdgeGraph<Integer>)G,
                Collections.unmodifiableMap(weight),
                MST,
                disjointSets);
        System.out.println("Solution:\n");
        int total = 0;
        for (Edge<Integer> e : MST) {
            System.out.println(nodes[e.source()] + " -- " + nodes[e.target()] + "\n");
            total += weight.get(e.source()).get(e.target());
        }
        System.out.println("Total weight: ");
        System.out.println(total);
    }

}