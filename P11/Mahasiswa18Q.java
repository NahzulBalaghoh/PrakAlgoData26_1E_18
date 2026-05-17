package P11;

public class Mahasiswa18Q {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa18Q() {

    }

    public Mahasiswa18Q(String nm, String name, String kls, double ipk) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nim + "\t" + nama + "\t" + kelas + "\t" + ipk);
    }
}
