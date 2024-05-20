package Tugas;

public class Queue {
    Pasien[] data;
    int front, rear, size, max;
    public Queue(int n) {
        max = n;
        data = new Pasien[max];
        size = 0;
        front = rear = -1;
    }
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
        }
        return false;
    }
    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
        }
        return false;
    }
    public void Enqueue(Pasien dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }
    public Pasien Dequeue() {
        Pasien dt = new Pasien();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while(i <= rear) {
                System.out.print("Antrian ke-" + (i + 1) + " : ");
                System.out.println(data[i].nama + " " + data[i].noID + " " + data[i].jenisKelamin + " " + data[i].umur);
                i = (i + 1) % max;
            }
            System.out.println("Jumlah elemen = " + size);
        }
    }
    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].nama + " " + data[front].noID + " " + data[front].jenisKelamin + " " + data[front].umur);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terakhir: " + data[rear].nama + " " + data[rear].noID + " " + data[rear].jenisKelamin + " " + data[rear].umur);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void peekPosition(String nama) {
        if (!isEmpty()) {
            int i = front;
            while(i <= rear) {
                if (data[i].nama.equalsIgnoreCase(nama)) {
                    System.out.println("Pasien: ");
                    System.out.println(data[i].nama + " " + data[i].noID + " " + data[i].jenisKelamin + " " + data[i].umur);
                    System.out.println("Terdapat pada antrian ke-" + (i + 1));
                    break;
                } else {
                    System.out.println("Pasien tidak ditemukan");
                }
                i = (i + 1) % max;
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void daftarPasien() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while(i <= rear) {
                System.out.println(data[i].nama + " " + data[i].noID + " " + data[i].jenisKelamin + " " + data[i].umur);
                i = (i + 1) % max;
            }
        }
    }
}
