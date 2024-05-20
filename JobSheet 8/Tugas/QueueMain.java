package Tugas;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian Pasien baru");
        System.out.println("2. Antrian Pasien keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian terakhir");
        System.out.println("5. Cek Semua antrian");
        System.out.println("6. Cari posisi Pasien");
        System.out.println("7. Daftar Pasien");
        System.out.println("8. EXIT");
        System.out.println("-----------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int pilih;
        
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        
        Queue antri = new Queue(jumlah);
        
        do {
            menu();
            pilih = sc.nextInt();
            
            switch(pilih) {
                case 1:
                    System.out.print("Nama\t\t: ");
                    String n = s.nextLine();
                    System.out.print("No ID\t\t: ");
                    int id = sc.nextInt();
                    System.out.print("Jenis Kelamin\t: ");
                    char jk = sc.next().charAt(0);
                    System.out.print("Umur\t\t: ");
                    int u = sc.nextInt();
                    Pasien p = new Pasien(n, id, jk, u);
                    antri.Enqueue(p);
                    break;
                case 2:
                    Pasien data = antri.Dequeue();
                    if (data != null) {
                        System.out.println("Antrian keluar: " + data.nama + " " + data.noID + " " + data.jenisKelamin + " " + data.umur);
                        break;
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    antri.print();
                    break;
                case 6:
                    System.out.print("Masukkan nama pasien: ");
                    String nama = s.nextLine();
                    antri.peekPosition(nama);
                    break;
                case 7:
                    antri.daftarPasien();
                    break;
            }
        } while (pilih != 8);
    }
}
