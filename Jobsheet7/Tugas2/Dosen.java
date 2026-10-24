package Jobsheet7.Tugas2;

public class Dosen extends Manusia {
    @Override
    public void makan() {
        super.makan(); // Memanggil method makan() dari superclass Manusia
        System.out.println("Dosen makan di kantin fakultas");
    }

    public void lembur() {
        System.out.println("Dosen lembur menilai ujian");
    }
}
