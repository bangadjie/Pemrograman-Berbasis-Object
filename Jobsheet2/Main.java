package Jobsheet2;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Rectangle original = new Rectangle(6,4);

        Rectangle copy = original;
        copy.width = 10;
        System.out.println("Via original: " + original.area());
        System.out.println("VIa Copy: " + copy.area());  
        Rectangle empty = null;  
        System.out.println(empty.area()); 
    }
      
}