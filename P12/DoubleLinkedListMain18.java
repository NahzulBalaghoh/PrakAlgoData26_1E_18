package P12;

import java.util.Scanner;

public class DoubleLinkedListMain18 {
    public static void main(String[] args) {
        Scanner nahzul = new Scanner(System.in);
        DoubleLinkedList18 list = new DoubleLinkedList18();
        int pilihan;


        do {
            System.out.println("\n=== MENU DOUBLE LINKED LIST ===");
            System.out.println("1. Tambahkan data di awal");
            System.out.println("2. Tambahkan data di akhir");
            System.out.println("3. Sisipkan ddata di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tambah data pada indeks tertentu");
            System.out.println("8. Hapus data setelah NIM");
            System.out.println("9. Hapus data pada indeks tertentu");
            System.out.println("10. Tampilkan data pertama");
            System.out.println("11. Tampilkan data terakhir");
            System.out.println("12. Tampilkan data pada indeks tertentu");
            System.out.println("13. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = nahzul.nextInt();
            nahzul.nextLine();

            switch (pilihan){
                case 1 :
                    Mahasiswa18 mhsAwal = inputMahasiswa(nahzul);
                    list.addFirst(mhsAwal);
                    break;
                case 2 :
                    Mahasiswa18 mhsAkhir = inputMahasiswa(nahzul);
                    list.addLast(mhsAkhir);
                    break;
                case 3 :
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = nahzul.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa18 dataBaru = inputMahasiswa(nahzul);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4 :
                    list.removeFirst();
                    break;
                case 5 :
                    list.removeLast();
                    break;
                case 6 :
                    list.print();
                    break;
                case 7:
                    System.out.print("Masukkan indeks : ");
                    int idxAdd = nahzul.nextInt();
                    nahzul.nextLine();
                    Mahasiswa18 mhsIndex = inputMahasiswa(nahzul);
                    list.add(idxAdd, mhsIndex);
                    break;

                case 8:
                    System.out.print("Masukkan NIM kunci : ");
                    String nimAfter = nahzul.nextLine();
                    list.removeAfter(nimAfter);
                    break;

                case 9:
                    System.out.print("Masukkan indeks yang dihapus : ");
                    int idxRemove = nahzul.nextInt();
                    nahzul.nextLine();
                    list.remove(idxRemove);
                    break;

                case 10:
                    Mahasiswa18 first = list.getFirst();
                    if (first != null) first.tampil();
                    break;

                case 11:
                    Mahasiswa18 last = list.getLast();
                    if (last != null) last.tampil();
                    break;

                case 12:
                    System.out.print("Masukkan indeks : ");
                    int idxGet = nahzul.nextInt();
                    nahzul.nextLine();
                    Mahasiswa18 byIdx = list.getIndex(idxGet);
                    if (byIdx != null) byIdx.tampil();
                    break;

                case 13:
                    System.out.println("Jumlah data : " + list.size());
                    break;
                case 0 :
                    System.out.println("Program selesai");
                    break;
                default :
                    System.out.println("Menu tidak valid");
            }
        } while (pilihan != 0);

        nahzul.close();
    }
    public static Mahasiswa18 inputMahasiswa(Scanner nahzul) {
        System.out.print("Masukkan NIM   : ");
        String nim = nahzul.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = nahzul.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = nahzul.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = nahzul.nextDouble();
        nahzul.nextLine(); 
        return new Mahasiswa18(nim, nama, kelas, ipk);
        }
}
