package Jobsheet7.Percobaan4;

public class MainPercobaan4 {
    public static void main(String[] args) {
        Ikan a = new Ikan();
        Piranha c = new Piranha();

        a.swim();
        c.swim();

        Piranha anak = c.beranak();
        System.out.println("TIpe Objek anak: " + anak.getClass().getSimpleName());
    }
}
