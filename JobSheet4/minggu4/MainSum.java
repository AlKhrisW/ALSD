package minggu4;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================================");   
        System.out.print("Masukkan jumlah perusahaan: ");
        int prshn = sc.nextInt();
                
        for (int i = 0; i < prshn; i++) {
            System.out.println("=============================================================");
            System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
            System.out.println("Masukkan keuntungan perusahaan ke-" + (i+1));
            System.out.print("Masukkan jumlah bulan: ");
            int elm = sc.nextInt();
            
            sum sm = new sum(prshn, elm);
            
            System.out.println("=============================================================");
            
            for (int j = 0; j < sm.elemen; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j+1) + " = ");
                sm.keuntungan[i][j] = sc.nextDouble();
            }
            System.out.println("=============================================================");
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keuntungan perusahaan ke-" + (i+1) + " selama " + sm.elemen + " bulan adalah = %.2f\n", sm.totalBF(sm.keuntungan[i]));
            System.out.println("=============================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.printf("Total keuntungan perusahaan ke-" + (i+1) + " selama " + sm.elemen + " bulan adalah = %.2f\n", sm.totalDC(sm.keuntungan[i], 0, sm.elemen-1));
            System.out.println("=============================================================");
        }
        sc.close();        
    }
}
