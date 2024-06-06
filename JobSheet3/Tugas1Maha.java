public class Tugas1Maha {
    public String nama;
    public int nim;
    public String jenisKelamin;
    public double ipk;
    public int data;
    
    public Tugas1Maha(String a, int i, String e, double p, int d) {
        nama = a;
        nim = i;
        jenisKelamin = e;
        ipk = p;
        data = d;
    }
    void cetakInfo() {
        System.out.println("Data Mahasiswa ke-" + data);
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("IPK: " + ipk + "\n");
        
    }
}
