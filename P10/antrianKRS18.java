package P10;

public class antrianKRS18 {
    mahasiswaKRS18[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahKRS;   
    int maxDilayani; 

    public antrianKRS18(int max) {
        this.max = max;
        this.data = new mahasiswaKRS18[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahKRS = 0;
        this.maxDilayani = 30;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }
    
    public boolean isDPAFull() {
        return sudahKRS >= maxDilayani;
    }

    public void tambahAntrian(mahasiswaKRS18 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        if (isDPAFull()) {
            System.out.println("DPA sudah mencapai batas maksimal pelayanan (" + maxDilayani + " mahasiswa).");
            return;
        }
        System.out.println("Memanggil antrian untuk proses KRS:");
        int jumlahDipanggil = 0;
        while (jumlahDipanggil < 2 && !isEmpty() && !isDPAFull()) {
            mahasiswaKRS18 mhs = data[front];
            front = (front + 1) % max;
            size--;
            sudahKRS++;
            jumlahDipanggil++;
            System.out.print("  [" + sudahKRS + "] ");
            mhs.tampilkanData();
        }
    }

    public void kosongkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong.");
        } else {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Antrian Terdepan:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        int tampil = Math.min(2, size);
        for (int i = 0; i < tampil; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling akhir dalam antrian:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getSudahKRS() {
        return sudahKRS;
    }

    public int getBelumKRS() {
        return size;
    }
}
