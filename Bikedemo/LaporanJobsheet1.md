# Laporan Jobsheet 1
 # Laporan Praktikum PBO - Jobsheet 01: Pengantar Konsep PBO

## Identitas
* **Nama:** Muhammad Unggul Satria Adjie
* **NIM / Kelas:** 254107020040 / 2G
* **Mata Kuliah:** Pemrograman Berbasis Objek (PBO)

---
## Percobaan
### 3.1 Percobaan 1
#### 1. `Bike.java`
```java
package Bikedemo;

public class Bike{
    private String brand;
    private int speed;
    private int gear=1;
    //Gear 1: mac 5 km/h, Gear 2: max 10km/h, ... gear 6: max 60 l,/h
    private final int [] GEAR_SPEED_LIMITS = {5, 10, 25, 30, 40, 60};
    public  void setBrand(String brandName){
        brand = brandName;
    }
    public void gearChanges(int gearValue){
        if (gearValue <  1 || gearValue > 6 ) {
            System.out.println("Invalid gear value, Gear must be between 1 and 6.");
        } else {
            gear = gearValue;
        }
    }
    public int speedAcceleration(int increment){
        speed += increment;
        if (speed > GEAR_SPEED_LIMITS[gear - 1]) {
            speed = GEAR_SPEED_LIMITS[gear - 1];
        }
        return speed;
    }
    public int speedDeceleration(int decrement){
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        return speed;
    }
    public void printInfo(){
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
        System.out.println("Gear : " + gear);
    }
}
```

#### 2. `BikeDemo.java`
```java
package Bikedemo;

public class BikeDemo {
    public static void main(String[] args) {
        Bike mountainBike1 = new Bike();
        Bike mountainBike2 = new Bike();

        mountainBike1.setBrand("Trek");
        mountainBike1.speedAcceleration(10);
        mountainBike1.gearChanges(2);
        mountainBike1.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChanges(3);
        mountainBike2.printInfo();
    }
}
```
#### 3. Hasil Percobaan 1
```
hasil
```
---
## Percobaan
### 3.2 Percobaan 2
#### 1. `RoadBike.java`
```java
package Bikedemo;

public class RoadBike extends Bike{
    private int tireWidth;

    public void setTireWidth(int width){
        tireWidth = width;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("TIre Width : " + tireWidth + " mm");
        System.out.println("Bike Type : Road Bike");
    }
}
```
#### 2. `BikeDemo.java`
```java
package Bikedemo;

public class BikeDemo {
    public static void main(String[] args) {
        Bike mountainBike1 = new Bike();
        Bike mountainBike2 = new Bike();
        RoadBike roadBike1 = new RoadBike();

        mountainBike1.setBrand("Trek");
        mountainBike1.speedAcceleration(10);
        mountainBike1.gearChanges(2);
        mountainBike1.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChanges(3);
        mountainBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.speedAcceleration(15);
        roadBike1.gearChanges(4);
        roadBike1.printInfo();
    }
}
```
---

## 1. Jawaban Pertanyaan
1. **Jelaskan perbedaan antara object dengan class!**
   - **Class** adalah *blueprint* atau *prototype* (cetakan) yang mendefinisikan struktur, atribut (state), dan *method* (behavior) secara umum.
   - **Object** adalah hasil instansiasi (wujud nyata) dari *class* tersebut di dalam memori komputer yang memiliki nilai *state* yang spesifik.

2. **Jelaskan alasan gear dan brand dapat menjadi atribut dari object Bike!**
   - Karena `gear` dan `brand` merupakan karakteristik, ciri-ciri fisik, atau kondisi (*state*) yang melekat dan mendeskripsikan secara langsung suatu entitas sepeda (Bike).

3. **Sebutkan salah satu kelebihan utama dari pemrograman berorientasi objek dibandingkan dengan pemrograman prosedural!**
   - **Modularitas dan Fleksibilitas:** Program dipecah ke dalam objek-objek. Jika ada perubahan atau penambahan fitur (misal menambah objek baru dengan *inheritance*), keseluruhan program tidak akan terganggu. Berbeda dengan pemrograman prosedural, di mana perubahan kecil pada fungsi dapat memengaruhi banyak alur kode.

4. **Apakah diperbolehkan melakukan pendefinisian dua buah atribut dalam satu baris kode seperti `public String nama, alamat;`?**
   - **Diperbolehkan**, asalkan kedua atribut tersebut memiliki tipe data yang sama (dalam hal ini sama-sama `String`).

5. **Pada class `RoadBike`, jelaskan alasan atribut `brand`, `speed`, dan `gear` tidak lagi ditulis di dalam class tersebut!**
   - Karena `RoadBike` menerapkan konsep **Pewarisan (*Inheritance*)** dengan menambahkan *keyword* `extends Bike`. Oleh karena itu, semua atribut dan method yang ada di *parent class* (`Bike`) otomatis diturunkan ke `RoadBike` sehingga tidak perlu ditulis ulang.
---

## 2. Hasil Tugas Praktikum

### Pengamatan Objek
Berikut adalah 4 objek fisik yang diamati untuk dikonversi menjadi *class* Java:
1. **Tas** (Ditambahkan sebagai entitas umum / *parent class*)
2. **Tas Ransel** (Objek *child*, mewarisi atribut dasar Tas)
3. **Tas Slempang** (Objek *child*, mewarisi atribut dasar Tas)
4. **Jaket** (Objek independen)
5. **Sepatu** (Objek independen)

### Source Code

#### 1. `Tas.java` (Parent Class)
```java
public class Tas {
    private String merk;
    private String warna;

    public void setMerk(String merkTas) {
        merk = merkTas;
    }

    public void setWarna(String warnaTas) {
        warna = warnaTas;
    }

    public void cetakInfo() {
        System.out.println("Merk Tas: " + merk);
        System.out.println("Warna Tas: " + warna);
    }
}
```

#### 2. `TasRansel.java` (Child Class)
```java
public class TasRansel extends Tas {
    private int jumlahKantong;
    private String tipeLaptop;

    public void setJumlahKantong(int jumlah) {
        jumlahKantong = jumlah;
    }

    public void setTipeLaptop(String tipe) {
        tipeLaptop = tipe;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo(); // Memanggil cetakInfo dari parent (Tas)
        System.out.println("Jumlah Kantong: " + jumlahKantong);
        System.out.println("Kompartemen Laptop: " + tipeLaptop);
        System.out.println("Kategori: Tas Ransel");
    }
}
```

#### 3. `TasSlempang.java` (Child Class)
```java
public class TasSlempang extends Tas {
    private int panjangTali;
    private String modelTali;

    public void setPanjangTali(int panjang) {
        panjangTali = panjang;
    }

    public void setModelTali(String model) {
        modelTali = model;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo(); // Memanggil cetakInfo dari parent (Tas)
        System.out.println("Panjang Tali: " + panjangTali + " cm");
        System.out.println("Model Tali: " + modelTali);
        System.out.println("Kategori: Tas Slempang");
    }
}
```

#### 4. `Jaket.java`
```java
public class Jaket {
    private String ukuran;
    private String bahan;

    public void setUkuran(String ukuranJaket) {
        ukuran = ukuranJaket;
    }

    public void setBahan(String bahanJaket) {
        bahan = bahanJaket;
    }

    public void cetakInfo() {
        System.out.println("--- Info Jaket ---");
        System.out.println("Ukuran Jaket : " + ukuran);
        System.out.println("Bahan Jaket  : " + bahan);
    }
}
```

#### 5. `Sepatu.java`
```java
public class Sepatu {
    private int ukuranSepatu;
    private String jenisSepatu;

    public void setUkuran(int ukuran) {
        ukuranSepatu = ukuran;
    }

    public void setJenis(String jenis) {
        jenisSepatu = jenis;
    }

    public void cetakInfo() {
        System.out.println("--- Info Sepatu ---");
        System.out.println("Ukuran Sepatu : " + ukuranSepatu);
        System.out.println("Jenis Sepatu  : " + jenisSepatu);
    }
}
```

#### 6. `Demo.java` (Main Class)
```java
public class Demo {
    public static void main(String[] args) {
        // 1. Instansiasi objek
        Tas tasBiasa = new Tas();
        TasRansel ranselSaya = new TasRansel();
        TasSlempang slempangSaya = new TasSlempang();
        Jaket jaketSaya = new Jaket();
        Sepatu sepatuSaya = new Sepatu();

        // 2. Terapkan method untuk Tas (Parent)
        System.out.println("--- Objek Tas (Parent) ---");
        tasBiasa.setMerk("Eiger");
        tasBiasa.setWarna("Hitam");
        tasBiasa.cetakInfo();
        System.out.println();

        // 3. Terapkan method untuk TasRansel
        System.out.println("--- Objek Tas Ransel ---");
        ranselSaya.setMerk("Rei");
        ranselSaya.setWarna("Navy");
        ranselSaya.setJumlahKantong(5);
        ranselSaya.setTipeLaptop("15 Inch");
        ranselSaya.cetakInfo();
        System.out.println();

        // 4. Terapkan method untuk TasSlempang
        System.out.println("--- Objek Tas Slempang ---");
        slempangSaya.setMerk("Consina");
        slempangSaya.setWarna("Abu-abu");
        slempangSaya.setPanjangTali(110);
        slempangSaya.setModelTali("Webbing Lebar");
        slempangSaya.cetakInfo();
        System.out.println();

        // 5. Terapkan method untuk Jaket
        jaketSaya.setUkuran("XL");
        jaketSaya.setBahan("Parasut");
        jaketSaya.cetakInfo();
        System.out.println();

        // 6. Terapkan method untuk Sepatu
        sepatuSaya.setUkuran(42);
        sepatuSaya.setJenis("Sneakers");
        sepatuSaya.cetakInfo();
    }
}
```
### 7. Hasil
```
Hasil
```