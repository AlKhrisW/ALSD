import java.util.Scanner;

public class StrukMain {
    public static void main(String[] args) {
        StackStruk stk = new StackStruk(10);
        Scanner sc = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        char pilih;
        int menu;
        
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Clear");
            System.out.println("6. End");
            System.out.print("Pilih opsi: ");
            menu = sc.nextInt();
            
            System.out.println("");
            switch(menu) {
                case 1:
                    do {
                        System.out.print("Nomor Transaksi: ");
                        int nt = sc.nextInt();
                        System.out.print("Tanggal Pembelian: ");
                        String tp = sb.nextLine();
                        System.out.print("Jumlah Barang: ");
                        int jb = sc.nextInt();
                        System.out.print("Harga Bayar: ");
                        int hb = sc.nextInt();
                        
                        Struk s = new Struk(nt, tp, jb, hb);
                        
                        System.out.print("Menambahkan data baru ke stack ? (y/n) ");
                        pilih = sc.next().charAt(0);
                        stk.push(s);
                    } while (pilih == 'y');
                    break;
                case 2:
                    System.out.print("Mengeluarkan berapa struk: ");
                    int data = sc.nextInt();
                    System.out.println("Data yang keluar: ");
                    for (int i = 0; i < data; i++) {
                        stk.pop();
                    }
                    System.out.println("");
                    System.out.println("Struk tersisa: ");
                    stk.print();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    System.out.println("Isi stack");
                    stk.print();
                    break;
                case 5:
                    stk.clear();
                    break;
            }
            System.out.println("");
        } while (menu != 6);
    }
}
