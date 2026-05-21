package CM2;

public class Pembeli18 {
    int noAntrian;
    String namaPembeli;
    String noHp;

    public Pembeli18(int noAntrian, String namaPembeli, String noHp) {
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    public void tampil() {
         System.out.println(
            "\n" + noAntrian + "\t\t\t\t" + namaPembeli + "\t\t\t" + noHp
        );
    }
}
