# Laporan Praktikum PBO - Pertemuan 2: Kelas dan Objek

## Identitas
* **Nama:** Muhammad Unggul Satria Adjie
* **NIM / Kelas:** 254107020040 / TI 2G
* **Mata Kuliah:** Pemrograman Berbasis Objek (PBO)

---

## A. Langkah Kerja (Step 1 - 7)

Pada pertemuan ini, langkah kerja berfokus pada pengenalan kelas, objek, method, dan referensi. Berikut adalah gabungan *source code* dari langkah kerja 1 hingga 7 beserta implementasinya:

### 1. Class `Rectangle.java` (Langkah 2 - 4)
Berisi atribut `width` dan `height`, konstruktor, serta method `area()` dan `perimeter()`.
```java
package Jobsheet2;

public class Rectangle {
    int width;
    int height; 

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    int area(){
        return width * height;
    }

    int perimeter(){
        return 2 * (width + height);
    }
}
```

### 2. Class `Student.java` (Langkah 6)
Dibuat berdasarkan diagram UML dengan atribut *private* dan konstruktor spesifik.
```java
package Jobsheet2;

public class Student {
    private String name;
    private String studentId;
    private double gpa;

    Student(String name, String studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }
    public String describe(){
        return name + " (" + studentId + ", GPA: " + gpa + ") ";
    }
}
```

---

## B. Tugas Mandiri dan Deliverable

### 1. Class `Circle.java` (Tugas Mandiri)
Pembuatan class `Circle` berdasarkan diagram UML dengan perhitungan luas dan keliling lingkaran menggunakan `Math.PI`.
```java
package Jobsheet2;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area(){
        return Math.PI * radius * radius;  
    }

    double circumference(){
        return 2 * Math.PI * radius;
    }
}
```

### 2. Main Class (`Main.java`)
Menjalankan *Array of Objects* untuk Rectangle (Langkah 7), pemanggilan objek Student, dan pengujian Tugas Mandiri class Circle.
```java
package Jobsheet2;

public class Main {
    public static void main(String[] args) {
        // Langkah 7: Array of objects
        Rectangle[] shapes = new Rectangle[3];
        shapes[0] = new Rectangle(6,4);
        shapes[1] = new Rectangle(3,3);
        shapes[2] = new Rectangle(8, 2);

        for(Rectangle r : shapes) {
            System.out.println("Area: " + r.area() + ", Perimeter: " + r.perimeter());
        }
        
        // Pengujian Student
        Student s = new Student("Nadia", "5001", 3.8);
        System.out.println(s.describe());

        // Pengujian Tugas Mandiri - Circle
        Circle c = new Circle(5);
        System.out.println("Circle area : " + c.area());
        System.out.println("Circle circumference : " + c.circumference()); 
    }
}
```

### 3. Jawaban Pertanyaan Konsep
**a. Apa bedanya objek dengan referensi ke objek?**
- **Objek** adalah bentuk nyata (instance) dari sebuah kelas yang berisi nilai atribut sungguhan dan tersimpan di dalam memori *heap*. Sedangkan **referensi ke objek** adalah variabel penunjuk yang berada di memori *stack*, di mana isinya hanyalah alamat memori yang merujuk ke lokasi objek asli di *heap* tersebut.

**b. Tepatnya kapan konstruktor sebuah kelas dijalankan?**
- Konstruktor dijalankan secara otomatis dan seketika saat objek baru dibuat menggunakan *keyword* `new` (contoh: `new Circle(5)`). Konstruktor ini dieksekusi sebelum objek tersebut bisa digunakan, untuk memastikan semua atribut awal sudah terisi dengan benar.

---