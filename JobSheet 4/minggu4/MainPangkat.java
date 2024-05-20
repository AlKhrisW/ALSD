package minggu5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nilai, pangkat, menu, elemen;
        
        System.out.println("Pilih metode penghitungan");
        System.out.println("1. Menggunakan Brute Force");
        System.out.println("2. Menggunakan Divide Conquer");
        System.out.print("Pilih menu (1/2): ");
        menu = sc.nextInt();
        
        switch (menu) {
            case 1:
                System.out.println("==============================================");
                System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
                elemen = sc.nextInt();
                
                Pangkat[] png1 = new Pangkat[elemen];
                
                for (int i = 0; i < elemen; i++) {
                    png1[i] = new Pangkat();
                    System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i+1) + " : ");
                    nilai = sc.nextInt();
                    System.out.print("Masukkan nilai pemangkat ke-" + (i+1) + " : ");
                    pangkat = sc.nextInt();
                    
                    png1[i] = new Pangkat(nilai, pangkat);
                }
                System.out.println("==============================================");
                System.out.println("Hasil Pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png1[i].nilai + " Pangkat " + png1[i].pangkat + " adalah: " + png1[i].pangkatBF(png1[i].nilai, png1[i].pangkat));
                }
                System.out.println("==============================================");
                break;
            case 2:
                System.out.println("==============================================");
                System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
                elemen = sc.nextInt();
                
                Pangkat[] png2 = new Pangkat[elemen];
                
                for (int i = 0; i < elemen; i++) {
                    png2[i] = new Pangkat();
                    System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i+1) + " : ");
                    nilai = sc.nextInt();
                    System.out.print("Masukkan nilai pemangkat ke-" + (i+1) + " : ");
                    pangkat = sc.nextInt();
                    
                    png2[i] = new Pangkat(nilai, pangkat);
                }
                System.out.println("==============================================");
                
                System.out.println("Hasil Pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png2[i].nilai + " Pangkat " + png2[i].pangkat + " adalah: " + png2[i].pangkatDC(png2[i].nilai, png2[i].pangkat));
                }
                System.out.println("==============================================");
                break;
        }
    }
}
