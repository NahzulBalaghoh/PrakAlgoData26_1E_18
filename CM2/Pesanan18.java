package CM2;

public class Pesanan18 {
    int kodePesanan;
    String namaPesanan;
    int harga;

    public Pesanan18(int kodePesanan, String namaPesanan, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }

    public void tampilPesanan() {
        System.out.println(
            kodePesanan + "\t\t\t" + namaPesanan + "\t\t" + harga
        );
    }
}
