package UAS_AldoKhrisnaWijaya;

public class BarangRental {
    String noTNKB, namaKendaraan, jenisKendaraan;
    int tahun, biayaSewa;
    public BarangRental() {

    }
    public BarangRental(String no, String nama, String jenis, int thn, int biaya) {
        noTNKB = no;
        namaKendaraan = nama;
        jenisKendaraan = jenis;
        tahun = thn;
        biayaSewa = biaya;
    }
    public void print() {
        System.out.printf("| %-15s | %-20s | %-10s | %-10s | %-20s |\n", noTNKB, namaKendaraan, jenisKendaraan, tahun, biayaSewa);
    }
}
