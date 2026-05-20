package P12;

public class Mahasiswa18 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa18(String nm, String name, String kls, double ipk) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ipk;

    }

    public void tampil (){
        System.out.println(
            "NIM    :  " + nim +
            "\nNama   :  " + nama +
            "\nKelas  :  " + kelas +
            "\nIPK    :  " + ipk 
        );
    }
}