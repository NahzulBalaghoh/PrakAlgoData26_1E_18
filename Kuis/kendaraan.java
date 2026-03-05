package Kuis;
import java.util.Scanner;
// class kendaraan 
public class kendaraan {
    // atribut
    String nomorPlat;
    double jarakTempuh;
    double konsumsiBahanbakar;

    // 
    public kendaraan (String nomorPlat, double jarakTempuh, double konsumsiBahanBakar){
        this.nomorPlat = nomorPlat;
        this.jarakTempuh= jarakTempuh;
        this.konsumsiBahanbakar = konsumsiBahanBakar;
    }
    public void tambah (Scanner nahzul){
        System.out.println("Nomor plat:");
        this.nomorPlat = nahzul.nextLine();
        System.out.println("Jarak tempuh: ");
        this.jarakTempuh = nahzul.nextDouble();
        System.out.println("konsumsi bahan bakar: ");
        this.konsumsiBahanbakar = nahzul.nextDouble();
        nahzul.nextLine();
    }
    // menghitung efisiensi 
    public double efisiensiBBM(){
        return jarakTempuh / konsumsiBahanbakar;
    }
    // menampilkna data
    public void printData (){
        System.out.println("Nomor Plat: "+nomorPlat);
        System.out.println("jarak Tempuh: "+ jarakTempuh);
        System.out.println("KOnsumsi Bahan Bakar: "+konsumsiBahanbakar);
    }
    //mencari kendaran paling efisien 
    public void kendaraanEfisien (kendaraan [] n){
        int index = 0;
        for (int i = 0; i < n.length; i++) {
            if (n [i].efisiensiBBM() < n [index].efisiensiBBM() ) {
                index = i ;
            }
        }
        System.out.println("Kendaraan paling efisien adalah: ");
        n [index].printData();
    }
    // menghitung jumlah kendaraan yang efisiensinya lebih dari 10
    public void efisiensiLebihdari10 (kendaraan [] n){
        int jml = 0;
        for (int i = 0; i < n.length; i++) {
            if (n [i].efisiensiBBM() > 10) {
                jml ++;
            }
        }
        System.out.println("Jumlah kendaran dengan nilai efisiensi lebih dari 10: "+jml);
    } 
}
