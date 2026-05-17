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

    public void getData (int index) {
        NodeMahasiswa18 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
       tmp.data.tampilInformasi();
    }

    public int indexOf (String key) {
        NodeMahasiswa18 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        }else {
            return index;
        }
    }

    public void removeFirst () {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else if (head == tail) {
            head = tail = null;
        }else {
            head = head.next;
        }
    }

    public void removeLast () {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else if (head == tail) {
            head = tail = null;
        }else {
            NodeMahasiswa18 tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }

    public void remove (String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else {
            NodeMahasiswa18 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst();
                    break;
                }else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt (int index) {
        if ( index == 0){
            removeFirst();
        }else {
            NodeMahasiswa18 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}