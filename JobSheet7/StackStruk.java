public class StackStruk {
    Struk data[];
    int size;
    int top;
    public StackStruk(int size) {
        this.size = size;
        data = new Struk[size];
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
        if (top == size-1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(Struk stk) {
        if (!isFull()) {
            top++;
            data[top] = stk;
        } else {
            System.out.println("Stack penuh");
        }
    }
    public void pop() {
        if (!isEmpty()) {
            Struk s = data[top];
            top--;
            System.out.println(s.nomorTransaksi + " " + s.tanggalPembelian + " " + s.jumlahBarang + " " + s.hargaBayar);
        } else {
            System.out.println("Stack kosong");
        }
    }
    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen teratas: \n" + data[top].nomorTransaksi + " " + data[top].tanggalPembelian + " " + data[top].jumlahBarang + " " + data[top].hargaBayar);
        } else {
            System.out.println("Stack kosong");
        }
    }
    public void print() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.println(data[i].nomorTransaksi + " " + data[i].tanggalPembelian + " " + data[i].jumlahBarang + " " + data[i].hargaBayar);
            }
        } else {
            System.out.println("Stack kosong");
        }
    }
    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack dikosongkan");
        } else {
            System.out.println("Stack kosong");
        }
    }
}
