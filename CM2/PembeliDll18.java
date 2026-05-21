package CM2;

public class PembeliDll18 {
    NodePembeli18 head;
    NodePembeli18 tail;
    int size;
    int noAntrian;

    public PembeliDll18(){
        head = null;
        tail = null;
        size = 0;
        noAntrian = 0;
    }

    public boolean isEmpty () {
        return head == null;
    }

    public int size (){
        return size;
    }

    public void tambahPembeli(String namaPembeli, String noHp) {
        noAntrian++;
        Pembeli18 newPembeli = new Pembeli18(noAntrian, namaPembeli, noHp);
        NodePembeli18 newNode = new NodePembeli18(newPembeli);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + noAntrian);
    }

    public void print () {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
            return;
        }

        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.println("No Antrian\t\t\tNama\t\t\tNo HP");
        
        NodePembeli18 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
        
    }

    public Pembeli18 hapusAntrian (int noAntrian) {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
 
        NodePembeli18 current = head;
        while (current != null && current.data.noAntrian != noAntrian) {
            current = current.next;
        }
 
        if (current == null) {
            System.out.println("Nomor antrian " + noAntrian + " tidak ditemukan.");
            return null;
        }
 
        Pembeli18 removed = current.data;
 
        if (current == head && current == tail) {
            head = tail = null;
        } else if (current == head) {
            head = head.next;
            head.prev = null;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
        return removed;
    }

}
