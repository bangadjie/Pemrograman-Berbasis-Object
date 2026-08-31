package Bikedemo.Tugas;

public class Sepatu {
    private int ukuranSepatu;
    private String jenisSepatu;

    public void setUkuran(int ukuran){
        ukuranSepatu = ukuran;
    }

    public void setJenis(String jenis){
        jenisSepatu = jenis;
    }

    public void cetakInfo() {
        System.out.println("--- Info Sepatu ---");
        System.out.println("Ukuran Sepatu : " + ukuranSepatu);
        System.out.println("Jenis Sepatu  : " + jenisSepatu);
    }
}
