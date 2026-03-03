package P3;
import java.util.Scanner;

public class dosenDemo18 {

    public static void main(String[] args) {
        Scanner nahzul1 = new Scanner (System.in);
        Scanner nahzul2 = new Scanner (System.in);

        System.out.print("Masukan Jumlah Dosen: ");
        int jmlDosen = nahzul1.nextInt();
        dosen18 [] arrayDosen = new dosen18[jmlDosen];

        for (int i = 0; i < arrayDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            arrayDosen [i] = new dosen18("", "", false, 0);
            arrayDosen[i].tambahData(nahzul2, nahzul1);
        }

        for (int i = 0; i < arrayDosen.length; i++) {
            System.out.println("Data Dosen ke-"+(i+1));
            arrayDosen[i].tmplData();
        }

    }
}