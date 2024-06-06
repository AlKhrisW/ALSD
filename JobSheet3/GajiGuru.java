public class GajiGuru {
    public String nama;
    public String status;
    public int nip;
    public int absensi;
    public int gajiPokok;
    public int tunjangan;
    public int gajiTotal;
    
    public GajiGuru(int i, String a, String t) {
        nip = i;
        nama = a;
        status = t;
    }
    int gajiPokok() {
        int perJam;
        if(status.equalsIgnoreCase("Guru Kontrak")){
            perJam = 20000;
            return gajiPokok = absensi * perJam;
        } else {
            perJam = 25000;
            return gajiPokok = absensi * perJam;
        }
    }
    int tunjangan() {
        if(status.equalsIgnoreCase("Guru Kontrak")){
            return tunjangan = (int)(gajiPokok * 1.25);
        } else {        
            return tunjangan = (int)(gajiPokok * 1.5);
        }
    }
    int gajiTotal() {
        return gajiTotal = gajiPokok + tunjangan;
            
    }
    void display() {
        System.out.println("=====================================");
        System.out.printf("|             %-9s             |%n", "Slip Gaji");
        System.out.println("=====================================");
        System.out.printf("| %-10s | %-20s |%n", "Nama", nama);
        System.out.printf("| %-10s | %-20s |%n", "Status", status);
        System.out.printf("| %-10s | %-20s |%n", "Gaji Pokok", "Rp. " + gajiPokok());
        System.out.printf("| %-10s | %-20s |%n", "Tunjangan", "Rp. " + tunjangan());
        System.out.printf("| %-10s | %-20s |%n", "Gaji Total", "Rp. " + gajiTotal());
        System.out.println("=====================================");
        System.out.println();
    }
}
