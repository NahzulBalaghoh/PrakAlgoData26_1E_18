package P15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class SistemNilaiMahasiswa18 {
    static List<Mahasiswa18> daftarMahasiswa = new ArrayList<>();
    static List<MataKuliah18> daftarMataKuliah = new ArrayList<>();
    static List<Nilai18> daftarNilai = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
 
    public static void main(String[] args) {
        inisialisasiData();
 
        int pilih;
        do {
            tampilMenu();
            System.out.print("Pilih\t: ");
            pilih = Integer.parseInt(scan.nextLine());
 
            switch (pilih) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    cariNilaiMahasiswa();
                    break;
                case 4:
                    urutDataNilai();
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
            System.out.println();
        } while (pilih != 5);
    }
 
    static void inisialisasiData() {
        daftarMahasiswa.add(new Mahasiswa18("20001", "Thalhah", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa18("20002", "Zubair", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa18("20003", "Abdur-Rahman", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa18("20004", "Sa'ad", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa18("20005", "Sa'id", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa18("20006", "Ubaidah", "021xxx"));
 
        daftarMataKuliah.add(new MataKuliah18("00001", "Internet of Things", 3));
        daftarMataKuliah.add(new MataKuliah18("00002", "Algoritma dan Struktur Data", 3));
        daftarMataKuliah.add(new MataKuliah18("00003", "Algoritma dan Pemrograman", 2));
        daftarMataKuliah.add(new MataKuliah18("00004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMataKuliah.add(new MataKuliah18("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }
 
    static void tampilMenu() {
        System.out.println("**************************************************");
        System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("1. Input Nilai");
        System.out.println("2. Tampil Nilai");
        System.out.println("3. Mencari Nilai Mahasiswa");
        System.out.println("4. Urut Data Nilai");
        System.out.println("5. Keluar");
        System.out.println("**************************************************");
    }
 
    static Mahasiswa18 cariMahasiswa(String nim) {
        for (Mahasiswa18 mhs : daftarMahasiswa) {
            if (mhs.nim.equals(nim)) {
                return mhs;
            }
        }
        return null;
    }
 
    static MataKuliah18 cariMataKuliah(String kode) {
        for (MataKuliah18 mk : daftarMataKuliah) {
            if (mk.kode.equals(kode)) {
                return mk;
            }
        }
        return null;
    }
 
    static void tampilDaftarMahasiswa() {
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("**************************************************");
        System.out.printf("%-10s%-15s%-10s\n", "NIM", "Nama", "Telf");
        for (Mahasiswa18 mhs : daftarMahasiswa) {
            System.out.printf("%-10s%-15s%-10s\n", mhs.nim, mhs.nama, mhs.notelp);
        }
    }
 
    static void tampilDaftarMataKuliah() {
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("**************************************************");
        System.out.printf("%-10s%-40s%-5s\n", "Kode", "Mata Kuliah", "SKS");
        for (MataKuliah18 mk : daftarMataKuliah) {
            System.out.printf("%-10s%-40s%-5d\n", mk.kode, mk.nama, mk.sks);
        }
    }
 
    // Input Nilai
    static void inputNilai() {
        System.out.println("Masukan data");
        System.out.print("Kode\t: ");
        String kodeNilai = scan.nextLine();
        System.out.print("Nilai\t: ");
        double nilaiInput = Double.parseDouble(scan.nextLine());
        System.out.println();
 
        tampilDaftarMahasiswa();
        System.out.print("Pilih mahasiswa by nim: ");
        String nim = scan.nextLine();
        Mahasiswa18 mhs = cariMahasiswa(nim);
 
        System.out.println();
        tampilDaftarMataKuliah();
        System.out.print("Pilih MK by kode: ");
        String kodeMk = scan.nextLine();
        MataKuliah18 mk = cariMataKuliah(kodeMk);
 
        if (mhs != null && mk != null) {
            daftarNilai.add(new Nilai18(mhs, mk, nilaiInput));
            System.out.println("Data nilai berhasil ditambahkan.");
        } else {
            System.out.println("Data mahasiswa/mata kuliah tidak ditemukan.");
        }
    }
 
    // Tampil Nilai
    static void tampilNilai() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("**************************************************");
        System.out.printf("%-10s%-15s%-40s%-5s%-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (Nilai18 n : daftarNilai) {
            System.out.printf("%-10s%-15s%-40s%-5d%-5.2f\n",
                    n.mahasiswa.nim, n.mahasiswa.nama, n.mataKuliah.nama, n.mataKuliah.sks, n.nilai);
        }
    }
 
    // Mencari Nilai Mahasiswa
    static void cariNilaiMahasiswa() {
        tampilNilai();
        System.out.print("Masukkan data mahasiswa[nim] :");
        String nim = scan.nextLine();
 
        int totalSks = 0;
        System.out.printf("%-10s%-15s%-40s%-5s%-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (Nilai18 n : daftarNilai) {
            if (n.mahasiswa.nim.equals(nim)) {
                System.out.printf("%-10s%-15s%-40s%-5d%-5.2f\n",
                        n.mahasiswa.nim, n.mahasiswa.nama, n.mataKuliah.nama, n.mataKuliah.sks, n.nilai);
                totalSks += n.mataKuliah.sks;
            }
        }
        System.out.println("Total SKS " + totalSks + " telah diambil.");
    }
 
    //  Urut Data Nilai (ascending berdasarkan nilai)
    static void urutDataNilai() {
        Collections.sort(daftarNilai, Comparator.comparingDouble(n -> n.nilai));
        tampilNilai();
    }

    // Tugas no.2
    static void hapusMahasiswaViaQueue(String nim) {
        Queue<Mahasiswa18> antrian = new LinkedList<>(daftarMahasiswa);
        List<Mahasiswa18> hasil = new ArrayList<>();
 
        while (!antrian.isEmpty()) {
            Mahasiswa18 mhs = antrian.poll(); 
            if (!mhs.nim.equals(nim)) {
                hasil.add(mhs); 
            }
        }
        daftarMahasiswa = hasil;
        System.out.println("Data mahasiswa dengan nim " + nim + " telah dihapus.");
    }
}
