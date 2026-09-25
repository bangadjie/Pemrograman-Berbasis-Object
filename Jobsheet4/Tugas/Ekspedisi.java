package Jobsheet4.Tugas;

public class Ekspedisi {
    private String namaKurir;

    public Ekspedisi(String namaKurir) {
        this.namaKurir = namaKurir;
    }

    public void kirimBarang(String namaPenerima) {
        System.out.println("Mengirim barang kepada " + namaPenerima + " menggunakan " + namaKurir);
    }
}
