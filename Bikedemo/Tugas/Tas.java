package Bikedemo.Tugas;

public class Tas {
    private String merk;
    private String warna;

    public void setMerk(String merkTas){
        merk = merkTas;
    }

    public void setWarna(String warnaTas){
        warna = warnaTas;
    }

    public void cetakInfo(){
        System.out.println("Merk Tas : "+ merk);
        System.out.println("Warna Tas : "+ warna);

    }
}
