package CM2;

import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner nahzul = new Scanner(System.in);
        PembeliDll18 antrian = new PembeliDll18();
        PesananDll18 pesanan = new PesananDll18();
        LinkedListRekap18 rekap = new LinkedListRekap18(); //instansiasi linked list rekap
        int pilihan;
 
        antrian.tambahPembeli("Ainra", "08224500000");
        antrian.tambahPembeli("Danra", "08224511111");
        antrian.tambahPembeli("Sanri", "08224522222");
 
        do {
            System.out.println("\n==============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Rekap Pesanan per menu");//menu baru
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = nahzul.nextInt();
            nahzul.nextLine();
 
            switch (pilihan) {
 
                case 1 :
                    System.out.print("Nama Pembeli : ");
                    String nama = nahzul.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = nahzul.nextLine();
                    antrian.tambahPembeli(nama, noHp);
                    break;
 
                case 2 :
                    antrian.print();
                    break;
 
                case 3 :
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong!");
                        break;
                    }
                    System.out.print("Kode Pesanan  : ");
                    int kode = nahzul.nextInt();
                    nahzul.nextLine();
                    System.out.print("Nama Pesanan  : ");
                    String namaPesanan = nahzul.nextLine();
                    System.out.print("Harga         : ");
                    int harga = nahzul.nextInt();
                    nahzul.nextLine();

                    Pembeli18 pembeli = antrian.hapusAntrian(antrian.head.data.noAntrian);
                    if (pembeli == null) break;
 
                    Pesanan18 pesananBaru = new Pesanan18(kode, namaPesanan, harga);
                    pesanan.tambahPesanan(pesananBaru);
                    rekap.updateRekap(namaPesanan);// Update rekap setiap kali ada pesanan baru
                    System.out.println(pembeli.namaPembeli + " telah memesan " + namaPesanan);
                    break;
 
                case 4 :
                    pesanan.laporanPesanan();
                    break;

                case 5 :
                    rekap.cetakRekap();//cetak rekap pesanan per menu
                    break;
                case 0 :
                    System.out.println("Terima kasih!");
                    break;
 
                default :
                    System.out.println("Menu tidak valid.");
            }
 
        } while (pilihan != 0);
 
        nahzul.close();
    }
}
