package P10;

public class AntrianLayanan18 {
    
    mahasiswa18 [] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan18 (int max) {
        this.max = max;
        this.data = new mahasiswa18 [max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty (){
        if (size == 0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean isFull (){
        if (size == max) {
            return true;
        }else {
            return false;
        }
    }

    public void peek (){
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        }else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print (){
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        }else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + "");
            }
            System.out.println(data[i] + "");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear () {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian (mahasiswa18 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++; 
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public mahasiswa18 layaniMahasiwa (){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        mahasiswa18 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }
    
    public void lihatTerdepan () {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println(" NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua () {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        } else {
            System.out.println("Data semua mahasiswa dalam antrian:");
            System.out.println(" NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public int getJumlaghAntrian () {
        return size;
    }
}


