package P11;

public class QueueLinkedList18 {
    NodeQueue18 head; 
    NodeQueue18 tail; 
    int size;
    int MAX = 5;

    boolean isEmpty() {
        return head == null;
    }

    boolean isFull() {
        return size >= MAX;
    }

    public void print() {
        if (!isEmpty()) {
            NodeQueue18 tmp = head;
            System.out.println("Isi Antrian:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void enqueue(Mahasiswa18Q input) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak bisa menambah data.");
            return;
        }
        NodeQueue18 ndInput = new NodeQueue18(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
        System.out.println(input.nama + " berhasil masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada yang dapat dipanggil.");
            return;
        }
        System.out.print("Mahasiswa dipanggil: ");
        head.data.tampilInformasi();
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.print("Antrian terdepan: ");
        head.data.tampilInformasi();
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.print("Antrian paling akhir: ");
        tail.data.tampilInformasi();
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian saat ini: " + size);
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }
}
