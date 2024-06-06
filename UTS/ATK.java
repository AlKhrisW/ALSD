// 03_ALdoKhrisna WIjaya
// SIB1D

public class ATK {
    String namaBarang;
    int kode, stok, hargaSatuan, terjual;
    ATK() {
        
    }
    ATK(int k, String n, int s, int hs) {
        kode = k;
        namaBarang = n;
        stok = s;
        hargaSatuan = hs;
    }
    public void tampil() {
        System.out.println("Kode Barang\t: " + kode);
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Stok Barang\t: " + stok);
        System.out.println("Harga Barang\t: " + hargaSatuan);
        System.out.println("Terjual\t: " + terjual);
    }
}
