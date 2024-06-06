import java.util.Scanner;

public class kuismain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        kuismethod data = new kuismethod();
        
        kuis k1 = new kuis(1, "buku", 30, 5000);
        kuis k2 = new kuis(2, "pensil", 100, 3500);
        kuis k3 = new kuis(3, "penghapus", 50, 1500);

        data.add(k1);
        data.add(k2);
        data.add(k3);

        data.print();
        data.removeLast();
        data.print();

        sc.close();
    }
}
