package P5;
import java.util.Scanner;

public class mainSum {

    public static void main(String[] args) {
        Scanner nahzul = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = nahzul.nextInt();

        sum sm= new sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = nahzul.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Devide and Condquer: " + sm.totalDC(sm.keuntungan, 0, elemen-1));

        nahzul.close();
    }
}