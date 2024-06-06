package TugasPraktikum2;

public class Method {
    Node head;
    int size;

    public Method() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Film item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Film item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Film item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong,  tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong,  tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void FindSeqSearch(int cari) throws Exception {
        int index = 1;
        if (isEmpty()) {
            throw new Exception("Linked Lists masih kosong");
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.data.id == cari) {
                    System.out.println(" berada pada node ke-" + index);
                    System.out.println("IDENTITAS:");
                    System.out.println(" ID Film     : " + current.data.id);
                    System.out.println(" Judul Film  : " + current.data.judul);
                    System.out.println(" IMDB Rating : " + current.data.rating);
                    break;
                }
                current = current.next;
                index++;
            }
        }
    }

    void bubbleSort() throws Exception {
        Node current = head;
        Film tmp;
        Node index = null;
        if (isEmpty()) {
            throw new Exception("Linked Lists masih kosong");
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.rating < index.data.rating) {
                        tmp = current.data;
                        current.data = index.data;
                        index.data = tmp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
}
