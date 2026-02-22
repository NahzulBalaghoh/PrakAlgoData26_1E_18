package P2;

public class dosenMain18 {

    public static void main(String[] args) {
        dosen18 dosen1 = new dosen18();
        dosen1.idDosen = "199810142020122056";
        dosen1.nama = "Nahzul Balaghoh";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2008;
        dosen1.bidangKeahlian = "Fisika";

        dosen1.tampilInformasi();
        dosen1.ubahKeahlian("Matematika");
        dosen1.tampilInformasi();
        dosen1.hitungMasaKerja(2026);

        dosen18 dosen2 = new dosen18("199404142020101156", "Gisya Alfredo", false, 2014, "K3" );
        dosen2.setStatusAktif(true);
        dosen2.tampilInformasi();
    }
}