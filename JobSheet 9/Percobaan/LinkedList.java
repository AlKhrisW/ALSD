package Percobaan;

public class LinkedList {
    Node head;
    public boolean isEmpty() {
        return (head == null);
    }
    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node currentNode = head;
            while(currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }
    public void addFirst(int input) {
        Node newNode = new Node(input, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(int input) {
        Node newNode = new Node(input, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node currentNode = head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
    public void insertAfter(int key, int input) {
        Node newNode= new Node(input, null);
        if (!isEmpty()) {
            Node currentNode = head;
            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.print("Linked list kosong");
        }
    }
    public void insertBefore(int key, int input) {
        Node newNode = new Node(input,null);
        if (!isEmpty()) {
            Node currentNode = head;
            Node prevNode = null;
            do {
                if (currentNode.data == key) {
                    if (prevNode == null) {
                        newNode.next = head;
                        head = newNode;
                        break;
                    } else {
                        newNode.next = prevNode.next;
                        prevNode.next = newNode;
                        break;
                    }
                }
                prevNode = currentNode;
                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.println("LinkedList kosong");
        }
    }
    public void insertAt(int input, int posisi) {
        Node newNode = new Node(input, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node currentNode = head;
            for (int i = 0; i < posisi -1; i++) {
                if (currentNode != null) {
                    currentNode = currentNode.next;
                }
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }
    public int getData(int index) {
        Node currentNode = head;
        for (int i = 0; i < index && currentNode != null; i++) {
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            System.out.println("Indeks melebihi panjang Linked list");
            return -1;
        }
        return currentNode.data;
    }
    public int indexOf(int key) {
        Node currentNode = head;
        int index = 0;
        while(currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }
        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }
    public void removeAt(int key) {
        if (isEmpty()) {
            System.out.println("LinkedList masih kosong");
        } else {
            Node currentNode = head;
            for (int i = 0; i < key-1; i++) {
                if (currentNode != null) {
                    currentNode = currentNode.next;
                }
            }
            currentNode.next = currentNode.next.next;
        }
    }
    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosong");
        }
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            Node currentNode = head;
            while(currentNode.next != null) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node currentNode = head;
            while(currentNode.next != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
}
