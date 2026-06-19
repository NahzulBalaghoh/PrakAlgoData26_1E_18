package P15;

public class MataKuliah18 {
    String kode;
    String nama;
    int sks;

    public MataKuliah18() {
    }

    public MataKuliah18(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    @Override
    public String toString() {
        return kode + "\t" + nama + "\t" + sks;
    }
}
