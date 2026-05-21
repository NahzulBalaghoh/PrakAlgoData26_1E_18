package CM2;

public class PesananDll18 {
    NodePesanan18 head;  
    NodePesanan18 tail;
    int size;
    int totalPendapatan;

    public PesananDll18() {
        head = null;
        tail = null;
        size = 0;
        totalPendapatan = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

   public void tambahPesanan (Pesanan18 pesanan) {
        NodePesanan18 newNode = new NodePesanan18(pesanan);
 
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        totalPendapatan += pesanan.harga;
    }

    public void sortByNama () {
        if (isEmpty() || head == tail) return;
 
        boolean swapped;
        do {
            swapped = false;
            NodePesanan18 current = head;
            while (current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    Pesanan18 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
 
    public void laporanPesanan () {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan.");
            return;
        }
 
        sortByNama();
 
        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.println("Kode Pesanan\t\tNama Pesanan\t\tHarga\n");
 
        NodePesanan18 current = head;
        while (current != null) {
            current.data.tampilPesanan();
            current = current.next;
        }
    }
}
