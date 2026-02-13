package P1;
import java.util.Scanner;
public class nilai_akhir {
    public static void main(String[] args) {
        Scanner nahzul = new Scanner(System.in);
        int nilai_tugas, nilai_kuis, nilai_uts, nilai_uas;
        double nilai_akhir, nilai_setara;
        String nilai_huruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================================================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilai_tugas = nahzul.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        nilai_kuis = nahzul.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        nilai_uts = nahzul.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        nilai_uas = nahzul.nextInt();

        if ((nilai_tugas>=0 && nilai_tugas<=100) && (nilai_kuis>=0 && nilai_kuis<=100) && (nilai_uts>=0 && nilai_uts<=100) && (nilai_uas>=0 && nilai_uas<=100)) {
            
            nilai_akhir = ((0.2*nilai_tugas)+ (0.2*nilai_kuis) + (0.3*nilai_uts) + (0.3*nilai_uas));

            if (nilai_akhir>80) {
                nilai_huruf = "A";
                nilai_setara = 4;
            } else if (nilai_akhir> 73) {
                nilai_huruf = "B+";
                nilai_setara = 3.5;
            } else if (nilai_akhir> 65) {
                nilai_huruf = "B";
                nilai_setara = 3;
            } else if (nilai_akhir > 60) {
                nilai_huruf = "C+";
                nilai_setara = 2.5;
            } else if (nilai_akhir> 50) {
                nilai_huruf = "C";
                nilai_setara = 2;
            } else if (nilai_akhir> 39) {
                nilai_huruf = "D";
                nilai_setara = 1;
            } else{
                nilai_huruf = "E";
                nilai_setara = 0;
            }

        System.out.println("Nilai Akhir: " + nilai_akhir);
        System.out.println("Nilai Huruf: " + nilai_huruf);

        if (nilai_setara<2) {
            System.out.println("ANDA TIDAK LULUS");
        } else {
            System.out.println("SELAMAT ANDA LULUS");
        }
        } else {
            System.out.println("Nilai Tidak Valid");
        }

        nahzul.close();
    }
}
