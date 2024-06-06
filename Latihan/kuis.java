public class kuis {
    String namaBarang;
    int kode, stok, hargaSatuan, terjual;
    public kuis( int k, String nb,int s, int hs) {
        namaBarang = nb;
        kode = k;
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