package P11;
import java.util.Scanner;

public class QueueMain18 {
     public static void main(String[] args) {
        QueueLinkedList18 queue = new QueueLinkedList18();
        Scanner nahzul = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("===== ANTRIAN MAHASISWA =====");
            System.out.println("1. Masukkan Data Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Tampilkan Semua Antrian Mahasiswa");
            System.out.println("4. Lihat Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Cek Antrian Kosong");
            System.out.println("8. Cek Antrian Penuh");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilih = Integer.parseInt(nahzul.nextLine());
            System.out.println();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = nahzul.nextLine();
                    System.out.print("Nama  : ");
                    String nama = nahzul.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = nahzul.nextLine();
                    System.out.print("IPK   : ");
                    double ipk = Double.parseDouble(nahzul.nextLine());
                    Mahasiswa18Q mhs = new Mahasiswa18Q(nim, nama, kelas, ipk);
                    queue.enqueue(mhs);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.print();
                    break;

                case 4:
                    queue.peekFront();
                    break;

                case 5:
                    queue.peekRear();
                    break;

                case 6:
                    queue.jumlahAntrian();
                    break;

                case 7:
                    if (queue.isEmpty()) {
                        System.out.println("Antrian KOSONG.");
                    } else {
                        System.out.println("Antrian TIDAK kosong.");
                    }
                    break;

                case 8:
                    if (queue.isFull()) {
                        System.out.println("Antrian PENUH.");
                    } else {
                        System.out.println("Antrian BELUM penuh.");
                    }
                    break;

                case 9:
                    queue.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();

        } while (pilih != 0);

        nahzul.close();
    }
}
