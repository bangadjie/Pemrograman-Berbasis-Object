package Bikedemo.Tugas;

public class MainDemo {
    public static void main(String[] args) {
        Tas tasBiasa = new Tas();
        TasRansel ransel1 = new TasRansel();
        TasSlempang slempang1 = new TasSlempang();
        Jaket jaket1 = new Jaket();
        Sepatu sepatu1 = new Sepatu();

        System.out.println("=== Objek Tas ===");
        tasBiasa.setMerk("Presiden");
        tasBiasa.setWarna("Hitam");
        tasBiasa.cetakInfo();
        System.out.println();

        System.out.println("=== Object Tas Ransel ===");
        ransel1.setMerk("Presiden");
        ransel1.setWarna("Hitam");
        ransel1.setJumlahKantong(5);
        ransel1.setTipeLaptop("14 inch");
        ransel1.cetakInfo();
        System.out.println();

        System.out.println("=== Object Tas Slempang ===");
        slempang1.setMerk("Rei");
        slempang1.setWarna("Abu-Abu");
        slempang1.setUkuranTas(30);
        slempang1.setModelTas("Kecil");
        slempang1.cetakInfo();
        System.out.println();

        jaket1.setUkuran("M");
        jaket1.setBahan("Parasut");
        jaket1.cetakInfo();
        System.out.println();

        sepatu1.setUkuran(40);
        sepatu1.setJenis("Hiking");
        sepatu1.cetakInfo();
    }
}
