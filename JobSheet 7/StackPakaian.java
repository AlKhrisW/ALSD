public class StackPakaian {
    Pakaian data[];
    int size;
    int top;
    public StackPakaian(int size) {
        this.size = size;
        data = new Pakaian[size];
        top = -1;
    }
    public boolean isFull() {
        if (top == size-1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(Pakaian pkn) {
        if (!isFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi stack penuh");
        }
    }
    public void pop() {
        if (!isEmpty()) {
            Pakaian x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    public void peek() {
        System.out.println("Elemen teratas: " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }
    public void print() {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga);
        }
//        System.out.println("");
    }
    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    public void getMax() {
        double max = data[top].harga;
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                if (data[i].harga > max) {
                    max = data[i].harga;
                }
            }
            for (int i = top; i >= 0; i--) {
                if (max == data[i].harga) {
                    System.out.println("Pakaian dengan harga tertinggi: \n" + data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga);
                }
            }
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}
