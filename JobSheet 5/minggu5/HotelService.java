package minggu5;

public class HotelService {
    Hotel rooms[] = new Hotel[5];
    int index;
    void tambah(Hotel h) {
        if (index < rooms.length) {
            rooms[index] = h;
            index++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampilAll() {
        for (Hotel h : rooms) {
            h.tampil();
            System.out.println("");
        }
    }
// harga terendah-tertinggi
    void bubbleSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].harga < rooms[j-1].harga) {
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }
// bintang tertinggi-terendah
    void selectionSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxMin = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxMin].bintang) {
                    idxMin = j;
                }
            }
            Hotel tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
