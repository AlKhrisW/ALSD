package UAS_AldoKhrisnaWijaya;

public class Method {
    NodeBarang headBarang = null;
    NodeTransaksi headTransaksi = null;
    int sizeBarang, sizeTransaksi;
    public boolean isEmptyBarang() {
        return headBarang == null;
    }
    public boolean isEmptyTransaksi() {
        return headTransaksi == null;
    }
    public void addBarang(BarangRental input) {
        if (isEmptyBarang()) {
            headBarang = new NodeBarang(null, input, null);
        } else {
            NodeBarang current = headBarang;
            while(current.next != null) {
                current = current.next;
            }
            NodeBarang newNode = new NodeBarang(current, input, null);
            current.next = newNode;
            sizeBarang++;

        }
    }
    public void addTransaksi(TransaksiRental input) {
        if (isEmptyTransaksi()) {
            headTransaksi = new NodeTransaksi(null, input, null);
        } else {
            NodeTransaksi current = headTransaksi;
            while (current.next != null) {
                current = current.next;
            }
            NodeTransaksi newNode = new NodeTransaksi(current, input, null);
            current.next = newNode;
            sizeTransaksi++;
        }
    }
    public void printBarang() {
        if (!isEmptyBarang()) {
            NodeBarang tmp = headBarang;
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists kosong");
        }
    }
    public void printTransaksi() {
        if (!isEmptyTransaksi()) {
            NodeTransaksi tmp = headTransaksi;
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists kosong");
        }
    }
    void bubbleSort() throws Exception {
        NodeTransaksi current = headTransaksi;
        TransaksiRental tmp;
        NodeTransaksi index = null;
        if (isEmptyBarang()) {
            throw new Exception("Linked Lists masih kosong");
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.br.noTNKB.compareTo(index.data.br.noTNKB) < 0) {
                        tmp = current.data;
                        current.data = index.data;
                        index.data = tmp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
        printTransaksi();
    }
    public double hitungHarga(String tnkb, int jam, String member) throws Exception {
        double hargaDiskon = 0;
        if (isEmptyBarang()) {
            throw new Exception("Linked Lists masih kosong");
        } else {
            NodeBarang current = headBarang;
            while (current != null) {
                if (current.data.noTNKB.equals(tnkb)) {
                    if (current.data.jenisKendaraan.equalsIgnoreCase("Motor")) {
                        double biayaSewa = 25000, total = 0, diskon = 0, diskonmember;
                        total = jam * biayaSewa;
                        if (member.equalsIgnoreCase("ya")) {
                            diskonmember = 25000;
                        } else {
                            diskonmember = 0;
                        }

                        if (jam >= 48 && jam <= 78) {
                            diskon = 0.10;
                        } else if (jam > 78) {
                            diskon = 0.20;
                        } else {
                            diskon = 0;
                        }
                        hargaDiskon = total - diskonmember - (total * diskon);
                    } else if (current.data.jenisKendaraan.equalsIgnoreCase("Mobil")) {
                        double biayaSewa = 40000, total = 0, diskon = 0, diskonmember;
                        total = jam * biayaSewa;
                        if (member.equalsIgnoreCase("ya")) {
                            diskonmember = 25000;
                        } else {
                            diskonmember = 0;
                        }

                        if (jam >= 48 && jam <= 78) {
                            diskon = 0.10;
                        } else if (jam > 78) {
                            diskon = 0.20;
                        } else {
                            diskon = 0;
                        }
                        hargaDiskon = total - diskonmember - (total * diskon);
                    }
                }
                current = current.next;
            }
        }
        return hargaDiskon;
    }
    public void remove(String tnkb) throws Exception {
        NodeBarang current = headBarang;
        while (current != null) {
            if (current.data.noTNKB.equals(tnkb)) {
                break;
            }
            current = current.next;
        }
        if (current.next == null) {
            current.prev.next = null;
        } else if (current.prev == null) {
            current = current.next;
            current.prev = null;
            headBarang = current;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }
    public void hitungPendapatan() {
        NodeTransaksi current = headTransaksi;
        double total = 0;
        while (current != null) {
            total = total + current.data.totalBiaya;
            current = current.next;
        }
        System.out.println("Pendapatan hari ini: " + total);
    }
}
