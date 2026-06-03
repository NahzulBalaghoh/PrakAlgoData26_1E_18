package CM2;

public class NodeRekap18 {//node untuk rekap pesanan
    String namaPesanan;
    int jumlah;
    NodeRekap18 prev;
    NodeRekap18 next;

    public NodeRekap18(String namaPesanan) {
        this.namaPesanan = namaPesanan;
        this.jumlah = 1;//setiap dibuat jumlah langsung 1 karena baru ada 1 pesanan
        this.prev = null;
        this.next = null;
    }
}