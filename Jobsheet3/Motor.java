package Jobsheet3;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakon = false;

    public void nyalakanMesin(){
        kontakon = true;
    }
    public void matikanMesin(){
        kontakon = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if (kontakon == true) {
            kecepatan += 5;
        }else{
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off!\n");
        }
    }
    public void kurangiKecepatan(){
        if (kontakon == true) {
            kecepatan -= 5;
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off!\n");
        }
    }
    public void printStatus(){
        if (kontakon == true) {
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
