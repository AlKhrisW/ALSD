package jobsheet6;

public class Hotel {
    String nama, kota;
    int harga, bintang;
    
    Hotel(String n, String k, int h, int b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }
    void tampil() {
        System.out.println("Nama\t: " + nama);
        System.out.println("Kota\t: " + kota);
        System.out.println("Harga\t: " + harga);
        System.out.println("Bintang\t: " + bintang);
    }
}
