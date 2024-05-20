package minggu5;

import java.util.Scanner;

public class MainAkar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, bF = 0, dC = 0;

        System.out.print("Masukkan bilangan: ");
        number = sc.nextInt();
        
        bF = Akar.AkarBF(number);
        System.out.println("Akar menggunakan Brute Force: " + bF);

        dC = Akar.AkarDC(number);
        System.out.println("Akar menggunakan Divide Conquer: " + dC);
    }
}
