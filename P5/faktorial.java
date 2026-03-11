package P5;
import java.util.Scanner;

public class faktorial {

    int faktorialBf (int n){
        int fakto =1;
        int i = 1 ;
        while (i <= n) {
            fakto *= i;
            i++;
        }
        return fakto;
    }

    int faktorialDC (int n){
        if (n == 1) {
            return 1;
        }else {
            int fakto = n * faktorialDC (n-1);
            return fakto;
        }
    }

    public static void main(String[] args) {
        Scanner nahzul = new Scanner (System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = nahzul.nextInt();

        faktorial fk = new faktorial ();
        System.out.println("Nilai faktorial "+nilai+" menggunakan BF: "+ fk.faktorialBf(nilai));
        System.out.println("Nilai faktorial "+nilai + " menggunakan DC: "+fk.faktorialDC(nilai));

        nahzul.close();
    }

}
