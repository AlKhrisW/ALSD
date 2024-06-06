package minggu2;

public class Buku {
    String nama, pengarang, penerbit;
    int hargaSatuan, jumlah;
    
    void tambilBuku() {
        System.out.println("Buku: "+nama);
        System.out.println("Pengarang: "+pengarang);
        System.out.println("Penerbit: "+penerbit);
        System.out.println("Harga: "+hargaSatuan);
    }
    
    int hitungHargaTotal() {
        return jumlah*hargaSatuan;
    }
    
    int hitungDiskon() {
        if (hitungHargaTotal() > 100000) {
            return hitungHargaTotal() * 10 / 100;
        } else if (hitungHargaTotal() > 50000 && hitungHargaTotal() < 100000) {
            return hitungHargaTotal() * 5 / 100;
        } else {
            return hitungHargaTotal();
        }
    }
    
    int hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }
}
