package P14;

public class buku18 {
    String kodeBuku;
    String judul;
    String pengarang;
    int tahunTerbit;

    public buku18() {
    }

    public buku18(String kodeBuku, String judul, String pengarang, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilInformasi() {
        System.out.println("Kode Buku: " + this.kodeBuku +
            " | Judul: " + this.judul +
            " | Pengarang: " + this.pengarang +
            " | Tahun Terbit: " + this.tahunTerbit);
    }
}
