package P12;

public class DoubleLinkedList18 {
    
    Node18 head;
    Node18 tail;
    int size; // tugas praktikum 

    public DoubleLinkedList18(){
        head = null;
        tail = null;
    }

    public boolean isEmpty () {
        return head == null;
    }

    public void addFirst (Mahasiswa18 data){
        Node18 newNode = new Node18(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++; // tugas praktikum
    }

    public void addLast (Mahasiswa18 data){
        Node18 newNode = new Node18(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++; // tugas praktikum
    }

    public void insertAfter (String keyNim, Mahasiswa18 data){
        Node18 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan Nim " + keyNim + " tidak ditemukan");
            return;
        }

        Node18 newNode = new Node18(data);

       
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        size++; // tugas praktikum
        System.out.println("Data berhasil disisipkan setelah NIM "  + keyNim);
    }

    public void print () {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }else {
            Node18 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public void printReverse(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node18 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

     //Praktikum 2

    public void removeFirst () {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        } 

        System.out.println("Data berhasil dihapus.");
        head.data.tampil();
        
            if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }


    public void removeLast () {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        System.out.println("Data berhasil dihapus.");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

    }

    //Tugas Praktikum

    public void add (int index, Mahasiswa18 data){
        if (index < 0 || index > size){
            System.out.println("Index di luar batas!");
            return;
        }

        if (index == 0) {
            addFirst(data);
        }else if (index == size ){
            addLast(data);
        }else {
            Node18 current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            
            Node18 newNode = new Node18(data);
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            
            size++;
        }
    }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked List kosong!");
            return;
        }
        
        Node18 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        
        if (current.next == null) {
            System.out.println("Tidak ada data setelah NIM " + keyNim + " (NIM ini berada di akhir).");
            return;
        }
        
        Node18 target = current.next; 
        
        if (target == tail) {
            removeLast(); 
        } else {
            current.next = target.next;
            target.next.prev = current;
            size--;
            System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus: " );
            target.data.tampil();
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks di luar batas!");
            return;
        }
        
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node18 current = head;
          
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            
            current.prev.next = current.next;
            current.next.prev = current.prev;
            
            size--;
            System.out.println("Data pada indeks " + index + " (" + current.data.nama + ") berhasil dihapus.");
        }
    }

    public Mahasiswa18 getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong!");
            return null;
        }
        return head.data;
    }

    public Mahasiswa18 getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong!");
            return null;
        }
        return tail.data;
    }

    public Mahasiswa18 getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks di luar batas!");
            return null;
        }
        
        Node18 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size(){
        return size;
    }

}
