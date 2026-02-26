package P3;
import java.util.Scanner;

public class mataKuliah18 {

    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;


    public mataKuliah18 (String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData (Scanner nahzul){
        System.out.print("Kode        : ");
        this.kode = nahzul.nextLine();
        System.out.print("Nama        : ");
        this.nama = nahzul.nextLine();
        System.out.print("Sks         : ");
        this.sks = Integer.parseInt(nahzul.nextLine());
        System.out.print("Jumlah Jam  : ");
        this.jumlahJam = Integer.parseInt(nahzul.nextLine());
        System.out.println("=======================================================");
    }

    public void cetakInfo(){
        System.out.println("Kode            : "+ kode);
        System.out.println("Nama            : "+ nama);
        System.out.println("Sks             : "+ sks);
        System.out.println("jumlah Jam      : "+ jumlahJam);
        System.out.println("---------------------------------------------- ");
        
    }

    public mataKuliah18(){

    }
}