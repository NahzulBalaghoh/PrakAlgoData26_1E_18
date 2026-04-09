package P6;
import java.util.Scanner;
public class MahasiswaDemo18 {

    public static void main(String[] args) {
        
        MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18();
        Scanner nahzul = new Scanner (System.in);
        int jumMhs = 5;

        for (int i = 0; i < jumMhs ; i++) {
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

            list.tambah(new Mahasiswa18(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("---------------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = nahzul.nextDouble();

        System.out.println("---------------------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("---------------------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(posisi, pss);
        list.tampilDataSearch(cari, pss);

        nahzul.close();

    }
}