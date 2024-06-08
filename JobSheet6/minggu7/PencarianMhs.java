package minggu7;


public class PencarianMhs {
    Mahasiswa listMhs[];
    int idx;
    void length(int jumlah) {
        listMhs = new Mahasiswa[jumlah];
    }
    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("----------------------------------");
        }
    }
    int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].nim == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].nim < listMhs[idxMin].nim) {
                    idxMin = j;
                }
            }
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) /2;
            int compare = listMhs[mid].nama.compareToIgnoreCase(cari);
            if (compare == 0) {
                return (mid);
            } else if (compare > 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }
    void TampilposisiN(String x, int pos) {
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].nama.equalsIgnoreCase(x)) {
                System.out.println("Nama : " + x + " ditemukan pada indeks " + i);
            }
        }
        if (pos == -1) {
            System.out.println("Nama : " + x + " tidak ditemukan");
        }
    }
    void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    void TampilDataN(String x, int pos) {
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].nama.equalsIgnoreCase(x)) {
                System.out.println("Data pada index ke-" + i);
                System.out.println("Nim\t : " + listMhs[i].nim);
                System.out.println("Nama\t : " + listMhs[i].nama);
                System.out.println("Umur\t : " + listMhs[i].umur);
                System.out.println("IPK\t : " + listMhs[i].ipk);
            }
            System.out.println("");
        }
        if (pos == -1) {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    void count(String cari) {
        int counter = 0;
        for (Mahasiswa l : listMhs) {
            if (l.nama.equalsIgnoreCase(cari)) {
                counter++;
            }
        }
        if (counter > 1) {
            System.out.println("Nama  " + cari + " ditemukan sebanyak " + counter + " kali");
        }
    }
}
