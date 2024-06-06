public class PersegiPanjang {
    public int panjang;
    public int lebar;
    public int luas;
    public int keliling;
    
    public PersegiPanjang(int p, int l){
        panjang = p;
        lebar = l;
    }
    int hitungLuas(){
        return luas = panjang * lebar;
    }
    int hitungKeliling(){
        return keliling = 2 * (panjang + lebar);
    }
    void cetakInfo(){
            System.out.println( ", panjang: " +panjang + ", lebar: " + lebar + ", Luas: " + luas + ", Keliling: " + keliling);
    }
}
