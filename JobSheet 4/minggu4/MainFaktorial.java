package minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = 0, end = 0;
        System.out.println("=============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc.nextInt();
        
        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : ");
            fk[i].nilai = sc.nextInt();
        }
        
        System.out.println("=============================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            start = System.nanoTime();
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + fk[i].faktorialBF(fk[i].nilai));
            end = System.nanoTime();
        }
        System.out.println("Waktu ekseskusi Brute Force: " + (end - start) + "nanoseken");
        System.out.println("=============================================");
        
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            start = System.nanoTime();
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + fk[i].faktorialDC(fk[i].nilai));
            end = System.nanoTime();
        }
        System.out.println("Waktu ekseskusi Divide Conquer: " + (end - start) + "nanoseken");
        System.out.println("=============================================");
    }
}
