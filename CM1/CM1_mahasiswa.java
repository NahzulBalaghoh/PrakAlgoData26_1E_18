package CM1;

public class CM1_mahasiswa {
    int nim;
    String nama;
    String prodi;

    CM1_mahasiswa(int nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa(){
        System.out.println("NIM: " + nim + "|Nama: " + nama + "| Prodi: " + prodi);
    }

}
