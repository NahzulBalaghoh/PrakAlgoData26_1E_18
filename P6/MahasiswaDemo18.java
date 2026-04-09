package P6;
import java.util.Scanner;
public class MahasiswaDemo18 {

    public static void main(String[] args) {
        Scanner nahzul = new Scanner (System.in);

        System.out.println("Masukkan jumlah mahasiswa: ");
        int n = nahzul.nextInt();
        nahzul.nextLine();
        
        MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18();
        list.listMhs = new Mahasiswa18[n];
        for (int i = 0; i < n; i++) {
            System.out.println("=== Input Mahasiswa Ke-" + (i+1) + " ===");

            System.out.println("NIM: ");
            String nim = nahzul.nextLine();

            System.out.println("Nama: ");
            String nama = nahzul.nextLine();

            System.out.println("Kelas: ");
            String kelas = nahzul.nextLine();

            System.out.println("IPK: ");
            double ipk = nahzul.nextDouble();
            nahzul.nextLine();

            Mahasiswa18 m = new Mahasiswa18(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("=== Data Mahasiswa Sebelum Sorting ===");
        list.tampil();

        list.bubbleSort();

        System.out.println("=== Data Mahasiswa Setelah Sorting (IPK DESC) ===");
        list.tampil();

        nahzul.close();

    }
}