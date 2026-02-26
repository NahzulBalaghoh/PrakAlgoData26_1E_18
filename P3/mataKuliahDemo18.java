package P3;
import java.util.Scanner;

public class mataKuliahDemo18 {

    public static void main(String[] args) {
        Scanner nahzul = new Scanner(System.in);
        mataKuliah18 [] arrayOfMatakuliah = new mataKuliah18[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-"+(i+1));
            System.out.print("Kode          : ");
            kode = nahzul.nextLine();
            System.out.print("Nama          : ");
            nama = nahzul.nextLine();
            System.out.print("Sks           : ");
            dummy = nahzul.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    : ");
            dummy = nahzul.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------------------");


            arrayOfMatakuliah[i] = new mataKuliah18(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            System.out.println("Kode            : "+ arrayOfMatakuliah[i].kode);
            System.out.println("Nama            : "+ arrayOfMatakuliah[i].nama);
            System.out.println("Sks             : "+ arrayOfMatakuliah[i].sks);
            System.out.println("jumlah Jam      : "+ arrayOfMatakuliah[i].jumlahJam);
            System.out.println("---------------------------------------------- ");
        }
        nahzul.close();

    }
}