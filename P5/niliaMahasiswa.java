package P5;

public class niliaMahasiswa {

    String nama;
    int nim, tahunMasuk, nilaiUTS, nilaiUAS;

    niliaMahasiswa(String nama, int nim, int tahunMasuk, int nilaiUTS, int nilaiUAS){
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    int maksUTS (int [] arr, int l, int r){
        if (l == r) {
            return arr[l];
        }
        int mid = (l+r) / 2;
        int lMaks = maksUTS(arr, l, mid);
        int rMaks = maksUTS(arr, mid + 1, r);
        return Math.max(lMaks, rMaks);
    
    }

    int minUTS (int [] arr, int l, int r){
        if (l==r) {
            return arr[l];
        }
        int mid = (l+r) / 2;
        int lmid = minUTS(arr, l, mid );
        int rmid = minUTS(arr, mid + 1, r);
        return Math.min(lmid, rmid);
    }

    double rataUAS (int [] arr){
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr [i];
        }
        return total / arr.length;
    }
}