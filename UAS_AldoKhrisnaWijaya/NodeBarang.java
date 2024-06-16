package UAS_AldoKhrisnaWijaya;

public class NodeBarang {
    BarangRental data;
    NodeBarang next, prev;
    public NodeBarang(NodeBarang prev, BarangRental data, NodeBarang next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
