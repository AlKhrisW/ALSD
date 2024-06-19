public class Mahasiswa implements Comparable<Mahasiswa>{
    String nim;
    String nama;
    String notelp;
    public Mahasiswa() {

    }
    public Mahasiswa(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }
    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + ')';
    }
    public int compareTo(Mahasiswa data) {
        return this.nim.compareTo(data.nim);
    }
}
