package P6;


public class MahasiswaBerprestasi18 {

    Mahasiswa18 [] listMhs = new Mahasiswa18[5];
    int idx;
    
    void tambah (Mahasiswa18 m){
        if (idx < listMhs.length) {
            listMhs[idx]= m;
            idx ++;
        }else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil (){
        for (Mahasiswa18 m : listMhs ) {
            m.tampilInformasi();
            System.out.println("-------------------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMhs.length; i++) {
            for (int j = 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    Mahasiswa18 tmp = listMhs[j];
                    listMhs[j] = listMhs [j-1];
                    listMhs[j-1]= tmp;
                }
            }
        }
    }

    void selectionSort (){
        for (int i = 0; i < listMhs.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa18 tmp = listMhs [idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa18 temp = listMhs[i];
            int j = i;
            while (j>0 && listMhs[j-1].ipk<temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
           if (listMhs[j].ipk==cari) {
                posisi = j;
                break;
           }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("Data mahasiswa dengan IPK : " + x + " ditemuakan pda indeks " + pos);
        }else{
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos!=-1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama );
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + listMhs[pos].ipk);
        }else{
            System.out.println("Data mahasiswa denga IPK " + x + " tidak ditemuukan");
        }
    }
}

