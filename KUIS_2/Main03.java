package KUIS_2;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner aldo = new Scanner(System.in);
        Scanner aldo03 = new Scanner(System.in);
        Method03 wijaya = new Method03();
        int menu03;
        
        System.out.println("==== QUIZ 2 PRAKTIKUM ASD TI ====");
        System.out.println("Dibuat oleh : Aldo Khrisna Wijaya");
        System.out.println("NIM         : 2341760091");
        System.out.println("Absen       : 03");
        System.out.println("=================================");

        do {
            System.out.println("Menu.");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan pesanan by nama");
            System.out.println("5. Hitung total Pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih (1-6): ");
            menu03 = aldo03.nextInt();

            switch (menu03) {
                case 1:
                    System.out.println("---------------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("---------------------");
                    System.out.print("Nomor Antrian   : ");
                    int no = aldo03.nextInt();
                    System.out.print("Nama Customer   : ");
                    String nama = aldo.nextLine();
                    System.out.print("Nomor HP        : ");
                    String nohp = aldo.nextLine();

                    Pembeli03 khrisna = new Pembeli03(no, nama, nohp);
                    wijaya.addPembeli(khrisna);
                    break;
                case 2:
                    System.out.println("+++++++++++++++++++++++++++++++++");
                    System.out.println("Daftar Antrian Resto Royal Delish");
                    System.out.println("+++++++++++++++++++++++++++++++++");
        
                    System.out.printf("| %-5s | %-15s | %-15s |\n", "No.", "Nama Customer", "No. Hp");
                    wijaya.printBeli();
                    System.out.println("Total Antrian: " + wijaya.size03);
                    break;
                case 3:
                    System.out.println("-----------------------");
                    System.out.println("Transaksi Input Pesanan");
                    System.out.println("-----------------------");

                    System.out.print("Nomor Pesanan   : ");
                    int nomor = aldo03.nextInt();
                    System.out.print("Pesanan         : ");
                    String name = aldo.nextLine();
                    System.out.print("Harga           : ");
                    int harga = aldo03.nextInt();
                    Pesanan03 Wijaya = new Pesanan03(nomor, name, harga);
                    wijaya.addPesanan(Wijaya);

                    System.out.println("+++++++++++++++++++++++++++++++++");
                    System.out.println("Daftar Pesanan Resto Royal Delish");
                    System.out.println("+++++++++++++++++++++++++++++++++");
    
                    System.out.printf("| %-5s | %-15s | %-10s |\n", "No.", "Nama Pesanan", "Harga");
                    wijaya.printPesan();

                    wijaya.removeFirstBeli();
                    break;
                case 4:
                    System.out.printf("| %-5s | %-15s | %-10s |\n", "No.", "Nama Pesanan", "Harga");
                    wijaya.bubbleSort();
                    wijaya.printPesan();
                    break;
                case 5:
                    System.out.println("++++++++++++++++");
                    System.out.println("TOTAL PENDAPATAN");
                    System.out.println("++++++++++++++++");
                    wijaya.hitung();
                    break;
                default:
                    break;
            }
        } while (menu03 != 6);
        aldo.close();
        aldo03.close();
    }
}
