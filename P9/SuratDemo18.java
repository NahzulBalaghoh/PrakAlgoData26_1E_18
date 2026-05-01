package P9;
import java.util.Scanner;

public class SuratDemo18 {
    public static void main(String[] args) {
        StackSurat18 stack = new StackSurat18(5);
        Scanner nahzul = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("Menu:");
            System.out.println("1. Menerima Surat Izin");
            System.out.println("2. Memproses Surat Izin");
            System.out.println("3. melihat Surat Izin Terakhir");
            System.out.println("4. Mencari Surat");
            System.out.print("Pilih: ");
            pilih = nahzul.nextInt();
            nahzul.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = nahzul.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = nahzul.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = nahzul.nextLine();
                    System.out.print("Jenis Izin (S / I): ");
                    char jenisIzin = nahzul.nextLine().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = nahzul.nextInt();
                    nahzul.nextLine();
                    Surat18 surat = new Surat18(idSurat, nama, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.println("Surat " + nama + " diterima");
                    break;

                case 2:
                    Surat18 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat " + proses.namaMahasiswa);
                        System.out.println("ID Surat   : " + proses.idSurat);
                        System.out.println("Kelas      : " + proses.kelas);
                        System.out.println("Jenis Izin : " + (proses.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi     : " + proses.durasi + " hari");
                        System.out.println("Surat berhasil diproses");
                    }
                    break;

                case 3:
                    Surat18 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir masuk dari: " + terakhir.namaMahasiswa);
                        System.out.println("ID Surat   : " + terakhir.idSurat);
                        System.out.println("Kelas      : " + terakhir.kelas);
                        System.out.println("Jenis Izin : " + (terakhir.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi     : " + terakhir.durasi + " hari");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = nahzul.nextLine();
                    stack.cariSurat(cari);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);

        nahzul.close();
    }
}