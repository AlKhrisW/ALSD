import java.util.Scanner;

public class GajiGuruMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GajiGuru[] gg = new GajiGuru[3];
        
        gg[0] = new GajiGuru(1234503, "Aldo Khrisna", "Guru Kontrak");
        gg[1] = new GajiGuru(1234511, "Fallujah Ramadi", "Guru Kontrak");
        gg[2] = new GajiGuru(1234514, "Husein Fadhlullah", "Guru Tetap");
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan absensi " + gg[i].nama + " : ");
            gg[i].absensi = sc.nextInt();
        }
        for (GajiGuru gajiGuru : gg) {
            gajiGuru.display();
        }
        sc.close();
    }
}
