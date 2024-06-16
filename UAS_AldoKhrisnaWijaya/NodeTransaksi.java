package UAS_AldoKhrisnaWijaya;

public class NodeTransaksi {
    TransaksiRental data;
    NodeTransaksi next, prev;
    public NodeTransaksi(NodeTransaksi prev, TransaksiRental data, NodeTransaksi next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
