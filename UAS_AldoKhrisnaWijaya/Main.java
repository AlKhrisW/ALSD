package UAS_AldoKhrisnaWijaya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Method barang = new Method();
        int menu, count = 0;
        do {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih(1-5): ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    BarangRental b1 = new BarangRental("S 4567 YV", "Honda Beat", "Motor", 2017, 10000);
                    BarangRental b2 = new BarangRental("N 4511 VS", "Honda Vario", "Motor", 2018, 10000);
                    BarangRental b3 = new BarangRental("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 30000);
                    BarangRental b4 = new BarangRental("N 4321 A", "Toyota Innova", "Mobil", 2019, 60000);
                    BarangRental b5 = new BarangRental("B 1234 AG", "Toyota Avanza", "Mobil", 2021, 25000);
                    
                    barang.addBarang(b1);
                    barang.addBarang(b2);
                    barang.addBarang(b3);
                    barang.addBarang(b4);
                    barang.addBarang(b5);

                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.printf("+                           %-35s                           +\n", "Daftar Kendaraan Rental Serba Serbi");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.printf("| %-15s | %-20s | %-10s | %-10s | %-20s |\n", "Nomor TNKB", "Nama Kendaraan", "Jenis", "Tahun", "Biaya Sewa");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    barang.printBarang();
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    break;
                case 2:
                    count++;
                    System.out.println("--------------------------------------");
                    System.out.printf("       %-24s       \n", "Masukkan Data Peminjaman");
                    System.out.println("--------------------------------------");
                    System.out.print("Masukkan Nama Peminjam    : ");
                    String nama = s.nextLine();
                    System.out.print("Masukkan Nomer TNKB       : ");
                    String no = s.nextLine();
                    System.out.print("Masukkan Lama Pinjam      : ");
                    int lama = sc.nextInt();
                    System.out.print("Apakah Member (ya/tidak)  : ");
                    String member = s.nextLine();
                    double harga = barang.hitungHarga(no, lama, member);

                    NodeBarang current = barang.headBarang;
                    boolean find = false;
                    while (current != null) {
                        if (current.data.noTNKB.equals(no)) {
                            find = true;
                            TransaksiRental tr = new TransaksiRental(count, nama, lama, harga, current.data);
                            barang.addTransaksi(tr);
                            System.out.println("-------------------------------------------------------------------------------------------------------------");
                            System.out.printf("| %-5s | %-15s | %-20s | %-20s | %-15s | %-15s |\n", "Kode", "No TNKB", "Nama Barang", "Nama Peminjam", "Lama Pinjam", "Total Biaya");
                            System.out.println("-------------------------------------------------------------------------------------------------------------");
                            barang.printTransaksi();
                            System.out.println("-------------------------------------------------------------------------------------------------------------");
                            barang.remove(no);
                            break;
                        }
                        current = current.next;
                    }
                    if (!find) {
                        System.out.println("Tidak bisa diproses, kendaraan sudah dipinjam orang lain");
                    }
                    break;
                case 3:
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.printf("+                              %-47s                              +\n", "Daftar Transaksi Peminjaman Rental Serba Serbi");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.printf("| %-5s | %-15s | %-20s | %-20s | %-15s | %-15s |\n", "Kode", "No TNKB", "Nama Barang", "Nama Peminjam", "Lama Pinjam", "Total Biaya");
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    barang.printTransaksi();
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    
                    System.out.println("+++++++++++++++++++++++++++++++++++");
                    System.out.println("TOTAL PENDAPATAN RENTAL SERBA SERBI");
                    System.out.println("+++++++++++++++++++++++++++++++++++");
                    barang.hitungPendapatan();
                    break;
                    case 4:
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.printf("+                              %-47s                              +\n", "Daftar Transaksi Peminjaman Rental Serba Serbi");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.printf("| %-5s | %-15s | %-20s | %-20s | %-15s | %-15s |\n", "Kode", "No TNKB", "Nama Barang", "Nama Peminjam", "Lama Pinjam", "Total Biaya");
                    System.out.println("-------------------------------------------------------------------------------------------------------------");
                    barang.bubbleSort();
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    break;
            }
        } while (menu != 5);
        sc.close();
        s.close();
    }
}
