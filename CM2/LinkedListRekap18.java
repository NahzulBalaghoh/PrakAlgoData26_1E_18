package CM2;

public class LinkedListRekap18 {//linked list untuk rekap pesanan
    NodeRekap18 head;
    NodeRekap18 tail;

    public boolean isEmpty() {//cek apakah rekap kosong
        return head == null;
    }

    public void updateRekap(String namaPesanan) {//update rekap setiap kali ada pesanan baru
        NodeRekap18 current = head;
        while (current != null) {
            if (current.namaPesanan.equalsIgnoreCase(namaPesanan)) {
                current.jumlah += 1;
                return;
            }
            current = current.next;
        }
        
        NodeRekap18 newNode = new NodeRekap18(namaPesanan); //jika pesanan belum ada maka buat node baru 
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sortByJumlahDescending() {//mengurutkan berdasarkan jumlah terjual secara descending
        if (isEmpty() || head == tail) return;

        boolean swapped;
        do {
            swapped = false;
            NodeRekap18 current = head;
            while (current.next != null) {
                if (current.jumlah < current.next.jumlah) {
                    String tempNama = current.namaPesanan;//tukar nama pesanan
                    current.namaPesanan = current.next.namaPesanan;
                    current.next.namaPesanan = tempNama;

                    int tempJumlah = current.jumlah;//tukar jumlah
                    current.jumlah = current.next.jumlah;
                    current.next.jumlah = tempJumlah;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }


    public void cetakRekap() {//cetak rekap pesanan per menu
        if (isEmpty()) {
            System.out.println("Belum ada rekap pesanan.");
            return;
        }
        sortByJumlahDescending();//mengurutkan dulu sebelum mencetak

        System.out.println("======================================");
        System.out.println("REKAP PESANAN");
        System.out.println("======================================");
        System.out.println("Nama Pesanan\t\tJumlah Terjual");
        System.out.println("--------------------------------------");

        NodeRekap18 current = head;
        while (current != null) {
            System.out.println(current.namaPesanan + "\t\t\t" + current.jumlah);
            current = current.next;
        }
    }
}