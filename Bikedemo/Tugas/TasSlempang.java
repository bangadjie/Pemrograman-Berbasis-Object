package Bikedemo.Tugas;

public class TasSlempang extends Tas {
    private int ukuranTas;
    private String modelTas;

    public void setUkuranTas(int ukuran) {
        ukuranTas = ukuran;
    }

    public void setModelTas(String model) {
        modelTas = model;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Panjang Tali: " + ukuranTas + " cm");
        System.out.println("Model Tali: " + modelTas);
        System.out.println("Kategori: Tas Slempang");
    }
}
