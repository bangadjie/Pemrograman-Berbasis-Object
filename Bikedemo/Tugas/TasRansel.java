package Bikedemo.Tugas;

public class TasRansel extends Tas {
    private int jumlahKantong;
    private String tipeLaptop;

    public void setJumlahKantong(int jumlah){
        jumlahKantong = jumlah;
    }

    public void setTipeLaptop(String tipe){
        tipeLaptop = tipe;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Jumlah Kantong: " + jumlahKantong);
        System.out.println("Kompartemen Laptop: " + tipeLaptop);
        System.out.println("Kategori: Tas Ransel");
    }
}
