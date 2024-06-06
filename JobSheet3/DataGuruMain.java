import java.util.Scanner;

public class DataGuruMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataGuru[] dp = new DataGuru[3];
        
        String nama, status;
        int nip;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data guru ke-" + (i+1));
            System.out.print("Masukkan NIP:");
            nip = sc.nextInt();
                sc.nextLine();
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan status: ");
            status = sc.nextLine();
            
            dp[i] = new DataGuru(nip, nama, status);
        }
        
        System.out.println("=======================================================");
        System.out.printf("| %-10s | %-20s | %-15s |%n", "NIP", "Nama", "Status");
        System.out.println("=======================================================");

        for (DataGuru dataGuru : dp) {
            dataGuru.displayDataGuru();
        }
        sc.close();
    }
}
