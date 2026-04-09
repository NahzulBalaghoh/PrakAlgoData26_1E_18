package P6;
import java.util.Scanner;
public class MahasiswaDemo18 {

    public static void main(String[] args) {
        Scanner nahzul = new Scanner (System.in);
        
        MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18();
        list.listMhs = new Mahasiswa18[5];
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Masukkan Data Mahasiswa Ke-" + (i+1));

            System.out.print("NIM: ");
            String nim = nahzul.nextLine();

            System.out.print("Nama: ");
            String nama = nahzul.nextLine();

            System.out.print("Kelas: ");
            String kelas = nahzul.nextLine();

            System.out.print("IPK: ");
            double ipk = nahzul.nextDouble();
            nahzul.nextLine();

            System.out.println("-----------------------------------------------");

            Mahasiswa18 m = new Mahasiswa18(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        nahzul.close();

    }
}