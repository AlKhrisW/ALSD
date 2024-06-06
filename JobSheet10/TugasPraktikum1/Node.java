package TugasPraktikum1;

public class Node {
    Penerimavaksin data;
    Node prev, next;
    public Node(Node p, Penerimavaksin d, Node n) {
        prev = p;
        data = d;
        next = n;
    }
}
