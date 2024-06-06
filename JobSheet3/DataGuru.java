public class DataGuru {
    public String nama;
    public String status;
    public int nip;
    
    public DataGuru(int i, String a, String t) {
        nip = i;
        nama = a;
        status = t;
    }
    void displayDataGuru() {
        System.out.printf("| %-10s | %-20s | %-15s |%n", nip, nama, status);
        System.out.println("=======================================================");
        
    }
}
