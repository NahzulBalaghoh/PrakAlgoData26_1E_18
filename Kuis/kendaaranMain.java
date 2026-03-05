package Kuis;
import java.util.Scanner;
// membuat class kendaraanMain
public class kendaaranMain {
   public static void main(String[] args) {
    // memuat scanner 
    Scanner nahzul = new Scanner(System.in);
    // menginput jumlah kendaran
    System.out.println("Masukkan jumlah kendaraan: ");
    int jmlKendaraan = nahzul.nextInt();
    nahzul.nextLine();
    kendaraan [] n = new kendaraan[jmlKendaraan];
    // melakukan looping untuk menampilkan isi dari class kendaraan
    for (int i = 0; i < n.length; i++) {
        System.out.println("Masukkan data kendaraan ke-"+(i+1));
        n [i] = new kendaraan("", 0, 0);
        n [i].tambah(nahzul);
    }
    kendaraan info = new kendaraan("", 0, 0);
    info.kendaraanEfisien(n);
    info.efisiensiLebihdari10(n);
    nahzul.close();
    }
}
