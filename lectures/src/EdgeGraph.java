public interface EdgeGraph<V> extends Graph<V> {
    Iterable<Edge<V>> edges();
}