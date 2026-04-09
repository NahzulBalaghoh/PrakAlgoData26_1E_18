package CM1;
import java.util.Scanner;
public class CM1_main {

    static void urutkanDariDenda (CM1_peminjaman [] data){
        int n = data.length;
            
        for (int i = 1; i < n; i++) {
        CM1_peminjaman kunci = data[i];
            int j = i-1;

            while (j>= 0 && data[j].denda < kunci.denda) {
                data [j+1] = data [j];
                j--;
            }
            data [j+1] = kunci;
        }
    }

    static void cariDariNim (CM1_peminjaman[] dataCopy, String targetNIM){
        int n = dataCopy.length;
        for (int i = 1; i < n; i++) {
            CM1_peminjaman kunci = dataCopy[i];
            int j = i-1;
            while (j>= 0 && dataCopy[j].mhs.nim > kunci.mhs.nim) {
                dataCopy [j+1] = dataCopy [j];
                j--;
            }
            dataCopy [j+1] = kunci;
        }
        int low = 0, high = n-1, midFound = -1;
        int targetInt = Integer.parseInt(targetNIM);

        System.out.println("Masukkan NIM: " + targetNIM);
        while (low <=high) {
            int mid = (low + high) / 2;

           if (dataCopy[mid].mhs.nim == targetInt) {
                midFound = mid;
                break;
            } else if (dataCopy[mid].mhs.nim < targetInt) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (midFound == -1) {
                System.out.println("Data dengan NIM "+ targetNIM + " tidak ditemukan");
                return;
            }
                int start = midFound;
                while (start > 0 && dataCopy[start-1].mhs.nim == targetInt) start--;
                    int end = midFound;
                while (end < n-1 && dataCopy[end+1].mhs.nim == targetInt) end++;

                    System.out.println("Hasil Pencarian NIM: " + targetNIM);
                for (int i = start; i <= end; i++) {
                    dataCopy[i].tampilPeminjaman();
                }
    }


    public static void main(String[] args) {
        Scanner nahzul = new Scanner (System.in);

        CM1_mahasiswa[] mahasiswaa = {
            new CM1_mahasiswa(2201, "Andi","Tenik Informatika"),
            new CM1_mahasiswa(2202, "Budi","Tenik Informatika"),
            new CM1_mahasiswa(2203, "Citra","Tenik Informasi Bisnis")
        };

        CM1_buku [] bukuu = {
            new CM1_buku("B001", "Algoritma",2020),
            new CM1_buku("B002", "Basis Data",2019),
            new CM1_buku("B003", "Pemrograman",2021),
            new CM1_buku("B004", "Fisika",2024),
        };

        CM1_peminjaman[] pjm = {
            new CM1_peminjaman(mahasiswaa[0], bukuu[0], 7),
            new CM1_peminjaman(mahasiswaa[1], bukuu[1], 3),
            new CM1_peminjaman(mahasiswaa[2], bukuu[2], 10),
            new CM1_peminjaman(mahasiswaa[2], bukuu[3], 6),
            new CM1_peminjaman(mahasiswaa[0], bukuu[1], 4)
        };
        
        int pilih = -1;
        while (pilih != 0) {
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih =nahzul.nextInt();

            if (pilih == 1) {
                System.out.println("Daftar Mahasiswa:");
                for (CM1_mahasiswa m : mahasiswaa) m.tampilMahasiswa();
 
             } else if (pilih == 2) {
                System.out.println("Daftar Buku:");
                for (CM1_buku b : bukuu) b.tampilBuku();
 
            } else if (pilih == 3) {
                System.out.println("Data Peminjaman:");
                for (CM1_peminjaman p : pjm) p.tampilPeminjaman();
 
            } else if (pilih == 4) {
            
                CM1_peminjaman[] sorted = new CM1_peminjaman[pjm.length];
                for (int i = 0; i < pjm.length; i++) sorted[i] = pjm[i];

                urutkanDariDenda(sorted);

                System.out.println("\nSetelah diurutkan (Denda terbesar):");
                for (CM1_peminjaman p : sorted) p.tampilPeminjaman();
                
            } else if (pilih == 5) {
                System.out.print("Masukkan NIM: ");
                String nim = nahzul.next();
 
                CM1_peminjaman[] copy = new CM1_peminjaman[pjm.length];
                for (int i = 0; i < pjm.length; i++) copy[i] = pjm[i];

                cariDariNim(copy, nim);
            }else if (pilih == 0) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        nahzul.close();
        
            
    }
}