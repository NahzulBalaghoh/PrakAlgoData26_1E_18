package P6;
import java.util.Scanner;

public class Dosen18Main18 {

    public static void main(String[] args) {
        Scanner nahzul  = new Scanner(System.in);
        DataDosen18 data = new DataDosen18();
        int pilihan;

        do {
            System.out.println("       MENU DATA DOSEN       ");
            System.out.println("------------------------------");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection/Insertion Sort)");
            System.out.println("5. Keluar");
            System.out.println("-------------------------------");
            System.out.print("Pilih menu: ");
            pilihan = nahzul.nextInt();
            nahzul.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("--- Tambah Data Dosen ---");
                    System.out.print("Kode: ");
                    String kode = nahzul.nextLine();

                    System.out.print("Nama: ");
                    String nama = nahzul.nextLine();

                    System.out.print("Jenis Kelamin (true=Laki-laki / false=Perempuan): ");
                    Boolean jk = nahzul.nextBoolean();
                    nahzul.nextLine();

                    System.out.print("Usia: ");
                    int usia = nahzul.nextInt();
                    nahzul.nextLine();

                    Dosen18 dsn = new Dosen18(kode, nama, jk, usia);
                    data.tambah(dsn);
                    break;

                case 2:
                    System.out.println("--- Data Seluruh Dosen ---");
                    if (data.idx == 0) {
                        System.out.println("Belum ada data Dosen.");
                    } else {
                        data.tampil();
                    }
                    break;

                case 3:
                    System.out.println("--- Sorting ASC berdasarkan Usia (Bubble Sort) ---");
                    data.SortingASC();
                    System.out.println("Data berhasil diurutkan dari termuda ke tertua:");
                    data.tampil();
                    break;

                case 4:
                    System.out.println("--- Sorting DSC berdasarkan Usia ---");
                    System.out.println("1. Selection Sort");
                    System.out.println("2. Insertion Sort");
                    System.out.print("Pilih metode: ");
                    int metode = nahzul.nextInt();
                    nahzul.nextLine();

                    if (metode == 1) {
                        data.sortingDSC();
                        System.out.println("Data diurutkan dengan Selection Sort (tertua ke termuda):");
                    } else {
                        data.insertionSort();
                        System.out.println("Data diurutkan dengan Insertion Sort (tertua ke termuda):");
                    }
                    data.tampil();
                    break;

                case 5:
                    System.out.println("Terima kasih");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        nahzul.close();
    }    
}