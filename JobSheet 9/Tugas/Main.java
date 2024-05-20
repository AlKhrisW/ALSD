package Tugas;

public class Main {
    public static void main(String[] args) {
        LinkedList soal = new LinkedList();
        
        soal.addQuestion("Siapa nama ketua kelas SIB-1D?", "Husein Fadhlullah");
        soal.addQuestion("Dimana Husein berkuliah?", "POLINEMA");
        soal.addQuestion("Berapakah saudara Husein?", "3");
        
        soal.play();
    }
}
