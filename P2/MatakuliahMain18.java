package P2;

public class MatakuliahMain18 {
    public static void main(String[] args) {
        MataKuliah18 mk1 = new MataKuliah18();
        mk1.kodeMk = "TIF125";
        mk1.nama = "Dasar Pemrograman";
        mk1.sks = 2;
        mk1.jml_jam = 4;

        mk1.tampilInformasi();
        mk1.kurangiJam(2);
        mk1.tampilInformasi();

        MataKuliah18 mk2 = new MataKuliah18("SIB125", "Prak Daspro", 2,4 );
        mk2.ubahSks(3);
        mk2.tambahJam(2);
        mk2.tampilInformasi();
    }
    
}