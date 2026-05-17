package P11;

public class SingleLinkedList18 {
    NodeMahasiswa18 head;
    NodeMahasiswa18 tail;

    boolean isEmpty() {
        return head == null;
    }   

    public void print (){
        if (!isEmpty()) {
            NodeMahasiswa18 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst (Mahasiswa18 input){
        NodeMahasiswa18 ndInput = new NodeMahasiswa18(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast (Mahasiswa18 input){
        NodeMahasiswa18 ndInput = new NodeMahasiswa18(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter (String key, Mahasiswa18 input) {
        NodeMahasiswa18 ndInput = new NodeMahasiswa18(input, null);
        NodeMahasiswa18 tmp = head;
        do {
            if (tmp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = tmp.next;
                tmp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            tmp = tmp.next;
        } while (tmp != null);
    }

    public void insertAt (int index, Mahasiswa18 input) {
        if (index < 0) {
            System.out.println("Indeks Salah");
        }else if (index == 0) {
            addFirst(input);
        }else {
            NodeMahasiswa18 tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = new NodeMahasiswa18(input, tmp.next);
            if (tmp.next.next == null) {
                tail = tmp.next;
            }
        }
    }
}