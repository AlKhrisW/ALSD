import java.util.Scanner;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang, lebar;
        
        System.out.print("Masukkan length array: ");
        int n = sc.nextInt();
        
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[n];
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Persegi panjang ke-" + (i+1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();
            
            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        }
        for (int i = 0; i < n; i++) {
            arrayOfPersegiPanjang[i].hitungLuas();
            arrayOfPersegiPanjang[i].hitungKeliling();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Persegi panjang ke-" + (i+1));
            arrayOfPersegiPanjang[i].cetakInfo();
        }
        sc.close();
    }
}
