package P2;
public class dosen18 {
    String idDosen, nama, bidangKeahlian;
    int tahunBergabung;
    boolean statusAktif;

    void tampilInformasi(){
        System.out.println("Id Dosen: " + idDosen);
        System.out.println("Nama: "+ nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: "+ tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    
    void setStatusAktif(boolean status){
        statusAktif = status;
        if ( status = true) {
            System.out.println("Saat ini berstatus aktif");
        }else{
            System.out.println("Saat ini berstatus tidak aktif");
        }
    }

    int hitungMasaKerja(int thnSkrg){
        int masaKerja = thnSkrg - tahunBergabung;
        System.out.println("Masa Kerja " + nama + " adalah " + masaKerja + " tahun");
        return masaKerja;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }

    dosen18 (){

    }

    dosen18(String idDosen, String nmaa, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nmaa;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}