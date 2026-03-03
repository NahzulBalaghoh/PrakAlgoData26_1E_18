package P3;
import java.util.Scanner;

public class dosen18 {

    String kode, nama;
    Boolean jenisKelamin;
    int usia;
    
    public dosen18(String kode, String nama, Boolean jenisKelamin, int usia){
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tambahData ( Scanner nahzul2, Scanner nahzul1){
        System.out.print("Kode: " );
        this.kode = nahzul2.nextLine();
        System.out.print("Nama: ");
        this.nama = nahzul2.nextLine();
        System.out.print("Jenis Kelamin: ");
        String jk = nahzul2.nextLine();
        this.jenisKelamin = jk.equalsIgnoreCase("Wanita");
        System.out.print("Usia: ");
        this.usia = nahzul1.nextInt();
        System.out.println("-------------------------------------------");
    }

    public void tmplData (){
        System.out.println("Kode: "+kode);
        System.out.println("Nama: "+nama);
        System.out.println("Jenis Kelamin: "+(jenisKelamin? "Wanita" : "Pria"));
        System.out.println("Usia: "+usia);
        System.out.println("---------------------------------------------");
    }
}