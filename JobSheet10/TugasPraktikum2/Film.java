package TugasPraktikum2;

public class Film {
    int id;
    String judul;
    double rating;
    public Film(int i, String j, double r) {
        id = i;
        judul = j;
        rating = r;
    }
    public void print() {
        System.out.println("ID      : " + id);
        System.out.println(" Judul  : " + judul);
        System.out.println(" Rating : " + rating);
    }
}
