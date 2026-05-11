package P10;
import java.util.Scanner;

public class antrianKRSMain {
   public static void tampilkanMenu() {
        System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
        System.out.println("1. Tambah Mahasiswa ke Antrian");
        System.out.println("2. Panggil Antrian (Proses KRS)");
        System.out.println("3. Tampilkan Antrian");
        System.out.println("4. Lihat Terdepan & Terakhir");
        System.out.println("5. Info Antrian");
        System.out.println("6. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antrianKRS18 antrian = new antrianKRS18(10);
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh! Maksimal 10 mahasiswa.");
                        break;
                    }
                    System.out.print("NIM   : "); String nim = sc.nextLine();
                    System.out.print("Nama  : "); String nama = sc.nextLine();
                    System.out.print("Prodi : "); String prodi = sc.nextLine();
                    System.out.print("Kelas : "); String kelas = sc.nextLine();
                    antrian.tambahAntrian(new mahasiswaKRS18(nim, nama, prodi, kelas));
                    break;

                case 2:
                    antrian.panggilAntrian();
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    System.out.println("-- 2 Terdepan --");
                    antrian.tampilkanDuaTerdepan();
                    antrian.tampilkanPalingAkhir();
                    break;

                case 5:
                    System.out.println("Status antrian kosong : " + antrian.isEmpty());
                    System.out.println("Status antrian penuh  : " + antrian.isFull());
                    System.out.println("Jumlah antri saat ini : " + antrian.getJumlahAntrian());
                    System.out.println("Sudah proses KRS      : " + antrian.getSudahKRS() + " / " + antrian.maxDilayani);
                    System.out.println("Belum proses KRS      : " + antrian.getBelumKRS());
                    break;

                case 6:
                    antrian.kosongkanAntrian();
                    break;

                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}
