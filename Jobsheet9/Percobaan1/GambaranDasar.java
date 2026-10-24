package Jobsheet9.Percobaan1;

public class GambaranDasar {
    interface Vegetarian { }
    static class Animal{}
    static class Deer extends Animal implements Vegetarian{}
    static class Lion extends Animal{}

    public static void main(String[] args) {
        Deer d = new Deer();
        Lion l = new Lion();

        Animal a = d;
        Animal a2 = l;
        Vegetarian v = d;
        // Vegetarian v2 = l;


        System.out.println("a menunjukan objek " + a.getClass().getSimpleName());
        System.out.println("a2 menunjukan objek " + a2.getClass().getSimpleName());
        System.out.println("v menunjukan objek " + v.getClass().getSimpleName());
    }
}
