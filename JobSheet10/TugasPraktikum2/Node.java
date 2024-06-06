package TugasPraktikum2;

public class Node {
    Film data;
    Node prev, next;
    public Node(Node p, Film d, Node n) {
        prev = p;
        data = d;
        next = n;
    }
}
