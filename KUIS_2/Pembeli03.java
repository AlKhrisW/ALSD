package KUIS_2;

public class Pembeli03 {
    String namaPembeli03, NoHp03;
    int nomorAntrian03;
    public Pembeli03() {

    }
    public Pembeli03(int a, String b, String c) {
        nomorAntrian03 = a;
        namaPembeli03 = b;
        NoHp03 = c;
    }
    public void tampilBeli() {
        System.out.printf("| %-5s | %-15s | %-15s |\n", nomorAntrian03, namaPembeli03, NoHp03);
    }
}