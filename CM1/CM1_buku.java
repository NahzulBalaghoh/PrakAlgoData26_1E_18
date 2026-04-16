package CM1;

public class CM1_buku {
    String kodeBuku;
    String judul;
    int tahunTerbit;
    String grade; // tambah atribut grade

    CM1_buku(String kodeBuku, String judul,int tahunTerbit){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        grade();
    }

    void tampilBuku (){
        System.out.println("Kode: "+ kodeBuku+"| Judul: "+judul+"| Tahun"+ tahunTerbit + "| Status: " + grade);// tambahkan status 
    }

    //Jawaban Sesi 1 A
    //tambah method grade untuk menyeleksi mana yang Grade A dan Grade B 
    void grade (){
        if (this.judul.equals("Algoritma")) {
            this.grade = "Grade A";
        }else {
            this.grade = "Grade B";
        }
    }
}
