package KUIS_2;

public class Method03 {
    Pembeli03 beli03;
    Pesanan03 pesan03;
    Method03 next03, headBeli03, headPesan03;
    int size03 = 0;

    public Method03() {

    }

    public Method03(Pembeli03 input) {
        beli03 = input;
        next03 = null;
    }

    public Method03(Pesanan03 input) {
        pesan03 = input;
        next03 = null;
    }

    public boolean isEmptyBeli() {
        return (headBeli03 == null);
    }

    public boolean isEmptyPesan() {
        return (headPesan03 == null);
    }

    public void addPembeli(Pembeli03 input) {
        Method03 newNode03 = new Method03(input);
        if (isEmptyBeli()) {
            headBeli03 = newNode03;
        } else {
            Method03 currentNode03 = headBeli03;
            while (currentNode03.next03 != null) {
                currentNode03 = currentNode03.next03;
            }
            currentNode03.next03 = newNode03;
        }
        size03++;
    }

    public void addPesanan(Pesanan03 input) {
        Method03 newNode03 = new Method03(input);
        if (isEmptyPesan()) {
            headPesan03 = newNode03;
        } else {
            Method03 currentNode03 = headPesan03;
            while (currentNode03.next03 != null) {
                currentNode03 = currentNode03.next03;
            }
            currentNode03.next03 = newNode03;
        }
    }

    public void printBeli() {
        if (!isEmptyBeli()) {
            Method03 currentNode = headBeli03;
            while (currentNode != null) {
                currentNode.beli03.tampilBeli();
                currentNode = currentNode.next03;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void printPesan() {
        if (!isEmptyBeli()) {
            Method03 currentNode = headPesan03;
            while (currentNode != null) {
                currentNode.pesan03.tampilPesan();
                currentNode = currentNode.next03;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeFirstBeli() {
        if (!isEmptyBeli()) {
            headBeli03 = headBeli03.next03;
            size03--;
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void bubbleSort() {
        if (isEmptyPesan()) {
            return;
        }
        
        boolean swapped;
        Method03 currentNode;
        Method03 index = null;
        Pesanan03 temp;
    
        do {
            swapped = false;
            currentNode = headPesan03;
    
            while (currentNode.next03 != index) {
                if (currentNode.pesan03.namaPesanan03.compareToIgnoreCase(currentNode.next03.pesan03.namaPesanan03) < 0) {
                    temp = currentNode.pesan03;
                    currentNode.pesan03 = currentNode.next03.pesan03;
                    currentNode.next03.pesan03 = temp;
                    swapped = true;
                }
                currentNode = currentNode.next03;
            }
            index = currentNode;
        } while (swapped);
    }
    
    public void hitung() {
        int total = 0;
        Method03 currentNode = headPesan03;
        while (currentNode != null) {
            total += currentNode.pesan03.harga03;
            currentNode = currentNode.next03;
        }
        System.out.println("Pendapatan hari ini: " + total);
    }
}
