package P2;
public class mahasiswaMain18 {
    public static void main(String[] args) {
        mahasiswa18 mhsl = new mahasiswa18();
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIPk(3.60);
        mhsl.tampilkanInformasi();

        mahasiswa18 mhs2 = new mahasiswa18("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIPk(3.30);
        mhs2.tampilkanInformasi();
    }
}