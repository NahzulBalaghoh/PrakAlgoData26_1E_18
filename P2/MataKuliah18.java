package P2;

public class MataKuliah18 {
    String kodeMk, nama;
    int sks, jml_jam;

    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah: "+ kodeMk);
        System.out.println("Nama: "+nama);
        System.out.println("Sks: "+sks);
        System.out.println("jumlah Jam: "+ jml_jam);
    }

    void ubahSks(int sksBaru){
        sks = sksBaru;
        System.out.println("Sks telah diubah menjadi: " + sks);
    }

    void tambahJam(int jam){
        jml_jam = jml_jam + jam;

    }

    void kurangiJam(int jam){
        if (jml_jam < jam) {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam yang tersisa tidak cukup untuk dikurangi");
        }else{
            jml_jam  = jml_jam - jam ;
        }
    }

    public MataKuliah18(){

    }

    public MataKuliah18(String kodeMk, String nama, int sks, int jml_jam){
        this.kodeMk = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jml_jam = jml_jam;
    }
}