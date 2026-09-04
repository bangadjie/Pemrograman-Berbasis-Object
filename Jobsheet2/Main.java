package Jobsheet2;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(6,4);
        
        r.width = 6;
        r.height = 4;

        System.out.println("Rectangle " + r.width + "x" + r.height);
        System.out.println("Area: " + r.area());    
        System.out.println("Perimeter: " + r.perimeter()); 
    }
      
}