package P3;
import java.util.Scanner;

public class mahasiswaDemo {
    public static void main(String[] args) {
        Scanner nahzul = new Scanner(System.in);
        mahasiswa18[] arrayOfMahasiswa = new mahasiswa18[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new mahasiswa18();

            System.out.println("Masukkan Data Mahasiswa ke-"+ (i+1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa[i].nim = nahzul.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa[i].nama = nahzul.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa[i].kelas = nahzul.nextLine();
            System.out.print("IPK     : ");
            dummy = nahzul.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-"+(i+1));
            System.out.println("NIM     :"+arrayOfMahasiswa[i].nim);
            System.out.println("Nama    :"+arrayOfMahasiswa[i].nama);
            System.out.println("Kelas   :"+arrayOfMahasiswa[i].kelas);
            System.out.println("IPK     :"+arrayOfMahasiswa[i].ipk);
            System.out.println("---------------------------------------");
        }
        nahzul.close();
    }
}