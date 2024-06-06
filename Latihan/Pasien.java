public class Pasien {
    String nama;
    int noID, umur;
    char jenisKelamin;
    Pasien(String n, int id, char jk, int u) {
        nama = n;
        noID = id;
        jenisKelamin = jk;
        umur = u;
    }
    public void tampil() {
        System.out.println("Nama\t: " + nama);
        System.out.println("No. ID\t: " + noID);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur\t: " + umur);
    }
}
