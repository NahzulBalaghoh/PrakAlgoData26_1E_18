package P6;

public class DataDosen18 {

    Dosen18[] dataDosen18 = new Dosen18[10];
    int idx;

    void tambah(Dosen18 dsn) {
        if (idx < dataDosen18.length) {
            dataDosen18[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            System.out.println("-------------------------------");
            dataDosen18[i].tampil();
        }
        System.out.println("-------------------------------");
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen18[j].usia < dataDosen18[j - 1].usia) {
                    Dosen18 tmp       = dataDosen18[j];
                    dataDosen18[j]    = dataDosen18[j - 1];
                    dataDosen18[j - 1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen18[j].usia > dataDosen18[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen18 tmp          = dataDosen18[idxMax];
            dataDosen18[idxMax]  = dataDosen18[i];
            dataDosen18[i]       = tmp;
        }
    }


    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen18 temp = dataDosen18[i];
            int j = i;
            while (j > 0 && dataDosen18[j - 1].usia < temp.usia) {
                dataDosen18[j] = dataDosen18[j - 1];
                j--;
            }
            dataDosen18[j] = temp;
        }
    }
}
