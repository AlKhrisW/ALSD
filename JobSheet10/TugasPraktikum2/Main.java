package TugasPraktikum2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Method dll = new Method();
        int menu;

        do {
            System.out.println("=============================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("=============================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("=============================");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID Film       : ");
                    int id = sc.nextInt();
                    System.out.print("Judul Film    : ");
                    String judul = s.nextLine();
                    System.out.print("Rating Film   : ");
                    Double rating = sc.nextDouble();

                    Film d = new Film(id, judul, rating);
                    dll.addFirst(d);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.print("ID Film       : ");
                    int i = sc.nextInt();
                    System.out.print("Judul Film    : ");
                    String j = s.nextLine();
                    System.out.print("Rating Film   : ");
                    Double r = sc.nextDouble();

                    Film a = new Film(i, j, r);
                    dll.addLast(a);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film");
                    System.out.print("ID Film       : ");
                    int f = sc.nextInt();
                    System.out.print("Judul Film    : ");
                    String l = s.nextLine();
                    System.out.print("Rating Film   : ");
                    Double g = sc.nextDouble();
                    System.out.print("Data Film ini akan masuk di urutan ke-");
                    int urutan = sc.nextInt();

                    Film c = new Film(f, l, g);
                    dll.add(c, urutan);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.println("Urutan data yang ingin dihapus: ");
                    int u = sc.nextInt();
                    dll.remove(u);
                    break;
                case 7:
                    System.out.println("Cetak data: ");
                    dll.print();
                    break;
                case 8:
                    System.out.println("Cari Data");
                    System.out.print("Masukkan ID Film yang dicari: ");
                    int cari = sc.nextInt();
                    System.out.print("Data ID Film " + cari);
                    dll.FindSeqSearch(cari);
                    break;
                case 9:
                    dll.bubbleSort();
                    dll.print();
                    break;
            }
        } while (menu != 10);

        sc.close();
        s.close();
    }
}
