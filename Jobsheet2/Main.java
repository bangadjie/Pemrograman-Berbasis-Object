package Jobsheet2;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Rectangle[] shapes = new Rectangle[3];
        shapes[0] = new Rectangle(6,4);
        shapes[1] = new Rectangle(3,3);
        shapes[2] = new Rectangle(8, 2);

        for(Rectangle r : shapes) {
            System.out.println("Area: " + r.area() + ", Perimeter: " + r.perimeter());
        }
        
        Student s = new Student("Nadia", "5001", 3.8);
        System.out.println(s.describe());

        Circle c = new Circle(5);
        System.out.println("Circle area : " + c.area());
        System.out.println("Circle area : " + c.circumference());
        // System.out.println("Area: " + original.area());
        // Rectangle copy = original;
        // copy.width = 10;
        // System.out.println("Via original: " + original.area());
        // System.out.println("VIa Copy: " + copy.area());  
        // Rectangle empty = null;  
        // System.out.println(empty.area()); 

    }
      
}