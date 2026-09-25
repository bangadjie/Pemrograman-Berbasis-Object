package Jobsheet4.Tugas;

public class mainTugas {
    public static void main(String[] args) {
        // Pembuatan objek untuk Aggregation
        Pelanggan pelanggan1 = new Pelanggan("Budi Santoso");
        
        // Pembuatan objek untuk Dependency
        Ekspedisi ekspedisiJNE = new Ekspedisi("JNE Express");

        // Membuat objek Pesanan
        // (Nota akan otomatis terbuat secara Composition di dalam konstruktor ini)
        Pesanan pesanan1 = new Pesanan("ORD-998", pelanggan1, 150000.0);

        // Menjalankan method yang mengandung Dependency
        pesanan1.prosesPengiriman(ekspedisiJNE);
    }
}
