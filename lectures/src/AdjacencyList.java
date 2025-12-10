import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class AdjacencyList implements EdgeGraph<Integer> {
    ArrayList<LinkedList<Integer>> adjacent;

    public AdjacencyList(int num_vertices) {
        adjacent = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i != num_vertices; ++i)
            adjacent.add(new LinkedList<Integer>());
    }
    public int numVertices() {
        return adjacent.size();
    }
    public void addEdge(Integer u, Integer v) {
        adjacent.get(u).add(v);
    }

    public Iterable<Integer> adjacent(Integer u) {
        return adjacent.get(u);
    }

    public Iterable<Integer> vertices() {
        return iterable(IntStream.range(0, adjacent.size()).iterator());
    }

    public Iterable<Edge<Integer>> edges() {
        LinkedList<Edge<Integer>> edges = new LinkedList<>();
        int u = 0;
        for (LinkedList<Integer> L : adjacent) {
            for (Integer v : L)
                edges.add(new Edge(u, v));
            u = u + 1;
        }
        return edges;
    }

    static <T> Iterable<T>
    iterable(Iterator<T> iterator) {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() { return iterator; }
        };
    }
}
