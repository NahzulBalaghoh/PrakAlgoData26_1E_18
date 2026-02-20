package P2;
public class mahasiswa18 {
    String nama, nim, kelas;
    double ipk;
    
    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: "+nim);
        System.out.println("IPK: "+ipk);
        System.out.println("Kelas: "+ kelas);
    }

    void ubahKelas (String kelasBaru){
        kelas = kelasBaru;
    }

    void updateIPk (double ipkBaru){
        ipk = ipkBaru;
    }

    String nilaiKinerja(){
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        }else if (ipk >= 3.0) {
            return "Kinerja baik";
        }else if (ipk >= 2.0) {
            return "Konerja cukup";
        }else {
            return "Kinerja Kurang";
        }
    }

}