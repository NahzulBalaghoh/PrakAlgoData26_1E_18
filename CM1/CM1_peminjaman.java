package CM1;

public class CM1_peminjaman {
    CM1_mahasiswa mhs;
    CM1_buku buku;
    int lamaPinjam;
    int batasPinjam  = 5;
    int terlambat;
    int denda;


    CM1_peminjaman(CM1_mahasiswa mhs, CM1_buku buku, int lamaPinjam){
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda(){
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            if (buku.grade.equals("Grade A")) { //Jawaban Sesi 1 A tambah agar bisa menghitung denda dengan grade A keterlambatan * 5000 perhari dan grade B keterlambatan * 2000 perhari
                denda = terlambat * 5000;
            }else {
                denda = terlambat * 2000;
            }
        }else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman (){
        System.out.println(mhs.nama + "| " + buku.judul + "| Lama: " +lamaPinjam + "| Terlambat: "+terlambat + "| Denda: " + denda);
    }
}
