public class queuelinkmain {
    public static void main(String[] args) {
        queuelink data = new queuelink();

        Pasien p1 = new Pasien("Natha", 04, 'P', 20);
        Pasien p2 = new Pasien("Fasya", 12, 'P', 20);
        Pasien p3 = new Pasien("Fallujah", 11, 'L', 20);

        data.add(p1);
        data.add(p2);
        data.add(p3);

        data.print();
        data.removeFirst();
        data.print();
        data.removeLast();
        data.print();
    }
}
