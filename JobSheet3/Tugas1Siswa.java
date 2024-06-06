import java.util.Scanner;
public class Tugas1Siswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        Tugas1Maha[] arrayOfMahasiswa = new Tugas1Maha[3];
        
        String nama, jenisKelamin;
        int nim, data = 0;
        double ipk = 0, hasil = 0;
        
        for (int i = 0; i < 3; i++) {
            data = (i+1);
            System.out.println("Masukkan data mahasiswa ke-" + data);
            System.out.print("Masukkan nama: ");
            nama = sc.next();
            System.out.print("Masukkan NIM: ");
            nim = sc.nextInt();
            System.out.print("Masukkan jenis kelamin: ");
            jenisKelamin = sc.next();
            System.out.print("Masukkan IPK: ");
            ipk = sc.nextDouble();
            System.out.println();
            arrayOfMahasiswa[i] = new Tugas1Maha(nama, nim, jenisKelamin, ipk, data);
        }
        
        for (int i = 0; i < 3; i++) {
            hasil += arrayOfMahasiswa[i].ipk;
        }
        
        hasil /= data;
        
        for (Tugas1Maha tugas1Maha : arrayOfMahasiswa) {
            tugas1Maha.cetakInfo();
        }
        
        System.out.println("Rata-rata IPK: " + hasil);
        sc.close();
    }
}
