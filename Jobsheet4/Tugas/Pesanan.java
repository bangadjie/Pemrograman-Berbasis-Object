package Jobsheet4.Tugas;

public class Pesanan {
    private String idPesanan;
    private Pelanggan pembeli; // Atribut untuk Aggregation
    private Nota notaBeli;     // Atribut untuk Composition

    // Konstruktor
    public Pesanan(String idPesanan, Pelanggan pembeli, double totalBelanja) {
        this.idPesanan = idPesanan;
        
        // AGGREGATION: Objek Pelanggan diterima dari luar (parameter)
        this.pembeli = pembeli; 
        
        // COMPOSITION: Objek Nota dibuat sendiri di dalam konstruktor
        this.notaBeli = new Nota(totalBelanja); 
    }

    // DEPENDENCY: Ekspedisi hanya numpang lewat sebagai parameter method, 
    // tidak disimpan sebagai atribut class
    public void prosesPengiriman(Ekspedisi kurir) {
        System.out.println("Memproses pesanan ID: " + idPesanan);
        System.out.println("Total Tagihan: Rp" + notaBeli.getTotalHarga());
        
        // Memanggil method dari objek yang dipinjam sesaat
        kurir.kirimBarang(pembeli.getNama());
    }
}
