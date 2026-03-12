package P5;

public class nilaiMahasiswaMain {

    public static void main(String[] args) {
        
        String [] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
        int[]    nim        = {220101001, 220101002, 220101003, 220101004, 220101005, 220101006, 220101007, 220101008};
        int[]    tahunMasuk = {2022, 2022, 2021, 2021, 2023, 2020, 2023, 2020};
        int[]    nilaiUTS   = {78, 85, 90, 76, 92, 88, 80, 82};
        int[]    nilaiUAS   = {82, 88, 87, 79, 95, 85, 83, 84};

        niliaMahasiswa mhs = new niliaMahasiswa("data", 0, 0, 0, 0);

        System.out.printf("%-10s %-12s %-14s %-12s %-10s%n","Nama", "NIM", "Tahun Masuk", "Nilai UTS", "Nilai UAS");
        for (int i = 0; i < nama.length; i++) {
            System.out.printf("%-10s %-12d %-14d %-12d %-10d%n", nama[i], nim[i], tahunMasuk[i], nilaiUTS[i], nilaiUAS[i]);
        }

        int maksUTS = mhs.maksUTS(nilaiUTS,0 ,nilaiUTS.length-1);
        System.out.println("Nilai UTS Tertinggi: " + maksUTS);

        int minUTS = mhs.minUTS(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("Nilai UTS Terendha: " + minUTS);

        double rataUAS = mhs.rataUAS(nilaiUAS);
        System.out.println("Rata Rata Nilai UAS: " + rataUAS);
    }
}