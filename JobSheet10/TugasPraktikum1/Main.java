package TugasPraktikum1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Method dll = new Method();
        int menu;

        do {
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println(" PENGANTRI VAKSIN EXTRAVAGANZA ");
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println(" 1. Tambah Data Penerima Vaksin");
            System.out.println(" 2. Hapus Data Pengantri Vaksin");
            System.out.println(" 3. Daftar Penerima Vaksin");
            System.out.println(" 4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++++");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor Antrian: ");
                    int antrian = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = sc.nextLine();
    
                    Penerimavaksin p = new Penerimavaksin(antrian, nama);
                    dll.addLast(p);
                    break;
                case 2:
                    System.out.println(dll.head.data.nama + " telah selesai divaksinasi");
                    dll.removeFirst();
                    dll.print();
                    break;
                case 3:
                    dll.print();
                    break;
            }
        } while (menu != 4);
        sc.close();
    }
}
