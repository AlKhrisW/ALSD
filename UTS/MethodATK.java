public class MethodATK {
    ATK data[] = new ATK[3];
    int index;
    public void tambah(ATK a) {
        if (index < data.length) {
            data[index] = a;
            index++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    public void tampil() {
        for (ATK k : data) {
            k.tampil();
            System.out.println("--------------------------------------");
        }
    }
    public int Penjualan(int kode, int jumlah) {
        int hargaBayar = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i].kode == kode) {
                data[i].stok = data[i].stok - jumlah;
                hargaBayar = data[i].hargaSatuan * jumlah;
                data[i].terjual = data[i].terjual + jumlah;
            }
        }
        return hargaBayar;
    }
    public void BubbleSort() {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if (data[j].terjual > data[j-1].terjual) {
                    ATK tmp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = tmp;
                }
            }
        }
    }
    public int SeqSearch(int key) {
        int posisi = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i].kode == key) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    void TampilData( int pos) {
        if (pos != -1) {
            System.out.println("Kode Barang\t : " + data[pos].kode);
            System.out.println("Nama Barang\t : " + data[pos].namaBarang);
            System.out.println("Stok Barang\t : " + data[pos].stok);
            System.out.println("Harga Barang\t : " + data[pos].hargaSatuan);
            System.out.println("Terjual\t: " + data[pos].terjual);
        } else {
            System.out.println("data tidak ditemukan");
        }
    }
}
