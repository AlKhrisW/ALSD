package KUIS_2;

public class Pesanan03 {
    int kodePesanan03, harga03;
    String namaPesanan03;
    public Pesanan03(int a, String b, int c) {
        kodePesanan03 = a;
        namaPesanan03 = b;
        harga03 = c;
    }
    public void tampilPesan() {
        System.out.printf("| %-5s | %-15s | %-10s |\n", kodePesanan03, namaPesanan03, harga03);
    }
}
