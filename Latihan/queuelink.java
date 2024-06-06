public class queuelink {
    Pasien data;
    queuelink next, head;
    public queuelink() {
        
    }
    public queuelink(Pasien data) {
        this.data = data;
        this.next = null;
    }
    public boolean isEmpty() {
        return (head == null);
    }
    public void add(Pasien input) {
        queuelink newNode = new queuelink(input);
        if (isEmpty()) {
            head = newNode;
        } else {
            queuelink currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
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
            queuelink currentNode = head;
            while(currentNode.next != null) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
    public void print() {
        if (!isEmpty()) {
            System.out.println("Isi linked list: ");
            queuelink currentNode = head;
            while(currentNode != null) {
                currentNode.data.tampil();
                currentNode = currentNode.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }
}
