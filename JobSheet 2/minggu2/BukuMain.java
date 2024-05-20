package minggu2;

public class BukuMain {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        
        buku1.nama = "Sherlock Holmes - Study in Scarlet";
        buku1.pengarang = "Sir Arthur Conan Doyle";
        buku1.penerbit = "Gramedia";
        buku1.hargaSatuan = 70000;
        buku1.jumlah = 2;
        
        buku1.hitungHargaTotal();
        buku1.hitungDiskon();
        buku1.hitungHargaBayar();
        buku1.tambilBuku();
        
        System.out.println("Total harga: " + buku1.hitungHargaBayar());
    }
}
