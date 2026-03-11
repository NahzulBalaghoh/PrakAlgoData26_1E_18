package P5;
import java.util.Scanner;
public class mainpangkat {

    public static void main(String[] args) {
        Scanner nahzul = new Scanner (System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen =nahzul.nextInt();

        pangkat[] png = new pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-"+(i+1)+ ": ");
            int basis = nahzul.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-"+ (i+1)+ ": ");
            int pangkat = nahzul.nextInt();
            png [i] = new pangkat(basis, pangkat);
        }

        System.out.println("HASIL PANGKA BRUTEFORCE: ");
        for (pangkat p: png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF());
        }
        System.out.println("HASIL PANGKA DEVIDE AND CONQUER: ");
        for (pangkat p: png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }

        nahzul.close();
    }
}