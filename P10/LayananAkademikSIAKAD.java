package P10;

import java.util.Scanner;

public class LayananAkademikSIAKAD {
    public static void main(String[] args) {
        Scanner nahzul = new Scanner (System.in);
        AntrianLayanan18 antrian = new AntrianLayanan18(5);
        int pilihan;
        do {
            System.out.println("=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. LIhat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = nahzul.nextInt();
            nahzul.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = nahzul.nextLine();
                    System.out.print("Nama: ");
                    String nama = nahzul.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = nahzul.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = nahzul.nextLine();
                    mahasiswa18 mhs = new mahasiswa18(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                   mahasiswa18 dilayani = antrian.layaniMahasiwa();
                     if (dilayani != null) {
                        System.out.print("Melayani Mahasiswa: ");
                        dilayani.tampilkanData();
                     }
                      break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam Antrian: " + antrian.getJumlaghAntrian());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        nahzul.close();
    }
}
