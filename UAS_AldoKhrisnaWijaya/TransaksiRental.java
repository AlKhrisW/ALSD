package UAS_AldoKhrisnaWijaya;

public class TransaksiRental {
    BarangRental br;
    int kodeTransaksi, lamaPinjam;
    String namaPeminjam;
    double totalBiaya;
    public TransaksiRental() {

    }
    public TransaksiRental(int kode, String nama, int lama, double total, BarangRental b) {
        kodeTransaksi = kode;
        namaPeminjam = nama;
        lamaPinjam = lama;
        totalBiaya = total;
        br = b;
    }
    public void print() {
        System.out.printf("| %-5s | %-15s | %-20s | %-20s | %-15s | %-15s |\n", kodeTransaksi, br.noTNKB, br.namaKendaraan, namaPeminjam, lamaPinjam, totalBiaya);
    }
}
