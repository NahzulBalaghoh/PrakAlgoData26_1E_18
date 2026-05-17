package P11;

public class Mahasiswa18 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa18 (){

    }

    public Mahasiswa18(String nm, String name, String kls, double ipk) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ipk;
    }

    public void tampilInformasi () {
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + ipk);
    }
}
