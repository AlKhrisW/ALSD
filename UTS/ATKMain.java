package uts_aldo.khrisna.wijaya;

import java.util.Scanner;

public class ATKMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        MethodATK t = new MethodATK();
        int menu;
        char pilih;
        
        do {
            System.out.println("");
            System.out.println("1. Input Data Barang");
            System.out.println("2. Penjualan Barang");
            System.out.println("3. Barang Terlaris");
            System.out.println("4. Cari Barang");
            System.out.println("5. Tampil Data Barang");
            System.out.println("6. END");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            
            switch(menu) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                         System.out.print("Kode Barang\t: ");
                        int kode = sc.nextInt();
                        System.out.print("Nama Barang\t: ");
                        String nama = s.nextLine();
                        System.out.print("Stok Barang\t: ");
                        int stok = sc.nextInt();
                        System.out.print("Harga Barang\t: ");
                        int harga = sc.nextInt();
                        
                        ATK a = new ATK(kode, nama, stok, harga);
                        t.tambah(a);
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.print("Kode barang: ");
                    int kode = s.nextInt();
                    
                    System.out.println("");
                    int posisi = t.SeqSearch(kode);
                    t.TampilData(posisi);
                    System.out.println("");
                    
                    System.out.print("Jumlah beli: ");
                    int jumlah = sc.nextInt();
                    System.out.println("Harga bayar: " + t.Penjualan(kode, jumlah));
                    break;
                case 3:
                    t.BubbleSort();
                    t.tampil();
                    break;
                case 4:
                    System.out.print("Kode barang yang ingin dicari: ");
                    int barang = s.nextInt();
                    System.out.println("");
                    posisi = t.SeqSearch(barang);
                    t.TampilData(posisi);
                    System.out.println("");
                    break;
                case 5:
                    t.tampil();
                    break;
            }
        } while (menu != 6);
    }
}
