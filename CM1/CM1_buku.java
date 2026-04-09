package CM1;

public class CM1_buku {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    CM1_buku(String kodeBuku, String judul,int tahunTerbit){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampilBuku (){
        System.out.println("Kode: "+ kodeBuku+"| Judul: "+judul+"| Tahun"+ tahunTerbit);
    }
}
