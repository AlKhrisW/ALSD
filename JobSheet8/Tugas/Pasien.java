package Tugas;

public class Pasien {
    String nama;
    int noID, umur;
    char jenisKelamin;
    Pasien() {
        
    }
    Pasien(String n, int id, char jk, int u) {
        nama = n;
        noID = id;
        jenisKelamin = jk;
        umur = u;
    }
}
