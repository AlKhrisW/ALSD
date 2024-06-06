package TugasPraktikum1;

public class Penerimavaksin {
    int nomorAntrian;
    String nama;
    public Penerimavaksin(int na, String n) {
        nomorAntrian = na;
        nama = n;
    }
    public void print() {
        System.out.printf("| %-5s | %-11s |\n", nomorAntrian, nama);
    }
}
