import java.util.Scanner;

public class StackPakaianMain {
    public static void main(String[] args) {
        StackPakaian stk = new StackPakaian(5);
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        char pilih;
        int menu;
        
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. GetMax");
            System.out.println("6. End");
            System.out.print("Pilih opsi: ");
            menu = sc.nextInt();
            
            System.out.println("");
            switch(menu) {
                case 1:
                    do {
                        System.out.print("Jenis: ");
                        String jenis = s.nextLine();
                        System.out.print("Warna: ");
                        String warna = s.nextLine();
                        System.out.print("Merk: ");
                        String merk = s.nextLine();
                        System.out.print("Ukuran: ");
                        String ukuran = s.nextLine();
                        System.out.print("Harga: ");
                        double harga = sc.nextDouble();
                        
                        Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                        
                        System.out.print("Apakah anda akan menampahkan data baru ke stack (y/n) ? ");
                        pilih = sc.next().charAt(0);
                        stk.push(p);
                    } while (pilih == 'y');
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    stk.getMax();
                    break;
            }
            System.out.println("");
        } while (menu != 6);
        sc.close();
        s.close();
    }
}
