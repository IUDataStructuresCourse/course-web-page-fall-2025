public class Edge<V> {
    V src; V tgt;
    Edge(V s, V t) { src = s; tgt = t; }
    V source() { return src; }
    V target() { return tgt; }
}