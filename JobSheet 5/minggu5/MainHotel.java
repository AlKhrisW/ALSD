package jobsheet6;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opsi;
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Awan", "Jakarta", 700000, 4);
        Hotel h2 = new Hotel("Bintang", "Malang", 350000, 3);
        Hotel h3 = new Hotel("Bulan", "Surabaya", 160000, 2);
        Hotel h4 = new Hotel("Angkasa", "Surabaya", 1500000, 5);
        Hotel h5 = new Hotel("Matahari", "Malang", 375000, 3);
        
        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);
        
        System.out.println("Data Hotel: ");
        list.tampilAll();
        
        do {
            System.out.println("1. Urutkan menurut harga terendah-tertinggi");
            System.out.println("2. Urutkan menurut bintang tertinggi-terendah");
            System.out.println("3. Exit");
            System.out.print("Pilih opsi: ");
            opsi = sc.nextInt();
            
            System.out.println("");
            
            if (opsi == 1) {
                list.bubbleSort();
                list.tampilAll();
            } else if(opsi == 2) {
                list.selectionSort();
                list.tampilAll();
            }
        } while (opsi != 3);
    }
}
