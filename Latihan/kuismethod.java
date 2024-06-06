public class kuismethod {
    kuis data;
    kuismethod next, head;

    public kuismethod() {
        
    }
    public kuismethod(kuis data) {
        this.data = data;
        this.next = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void add(kuis input) {
        kuismethod newNode = new kuismethod(input);
        if (isEmpty()) {
            head = newNode;
        } else {
            kuismethod currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            kuismethod currentNode = head;
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
            kuismethod currentNode = head;
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
