package minggu7;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        PencarianMhs data = new PencarianMhs();
        int jumMhs = 0, menu;
        
        System.out.println("----------------------------------------");
        System.out.print("Jumlah mahasiswa yang ingin diinput: ");
        jumMhs = s.nextInt();
        
        data.length(jumMhs);
        
        System.out.println("----------------------------------------");
        System.out.println("Masukkan data mahasiswa");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("----------------------------------------");
            System.out.print("NIM\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
        
        System.out.println("");
        
        do {
            System.out.println("1. Data Mahasiswa");
            System.out.println("2. Data Mahasiswa berdasarkan NIM terkecil");
            System.out.println("3. Search berdasarkan NIM");
            System.out.println("4. Search berdasarkan Nama");
            System.out.println("5. End");
            System.out.print("Pilih opsi: ");
            menu = s.nextInt();
            
            switch(menu) {
                case 1:
                    System.out.println("----------------------------------------");
                    System.out.println("Data keseluruhan Mahasiswa : ");
                    data.tampil();
                    break;
                case 2:
                    System.out.println("----------------------------------------");
                    System.out.println("Disorting berdasarkan NIM terkecil");
                    data.selectionSort();
                    data.tampil();
                    break;
                case 3:
                    System.out.println("----------------------------------------");
                    System.out.println("Masukkan Nim Mahasiswa yang dicari : ");
                    System.out.print("NIM :");
                    int cari = s.nextInt();
                    System.out.println("Menggunakan sequential search");
                    int posisi = data.FindSeqSearch(cari);
                    data.Tampilposisi(cari, posisi);
                    data.TampilData(cari, posisi);
                    break;
                case 4:
                    System.out.println("==============================");
                    System.out.println("Masukkan Nama Mahasiswa yang dicari : ");
                    System.out.print("Nama :");
                    String cariN = s1.nextLine();
                    System.out.println("Menggunakan binary search");
                    data.selectionSort();
                    posisi = data.FindBinarySearch(cariN, 0, jumMhs-1);
                    data.count(cariN);
                    System.out.println("");
                    data.TampilposisiN(cariN, posisi);
                    System.out.println("");
                    data.TampilDataN(cariN, posisi);
                    break;
            }
        } while (menu != 5);
        s.close();
        s1.close();
    }
}
