package Bikedemo.Tugas;

public class Jaket {
    private String ukuran;
    private String bahan;

    public void setUkuran(String ukuranJaket){
        ukuran = ukuranJaket;
    }
    
    public void setBahan(String bahanJaket){
        bahan = bahanJaket;
    }
    
    public void cetakInfo() {
        System.out.println("--- Info Jaket ---");
        System.out.println("Ukuran Jaket : " + ukuran);
        System.out.println("Bahan Jaket  : " + bahan);
    }
}
