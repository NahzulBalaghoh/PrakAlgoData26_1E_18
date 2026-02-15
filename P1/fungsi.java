package P1;

public class fungsi {
    static String [] cabang = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};
    static int [] aglonema = {10, 6, 2, 5};
    static int [] keladi = {5, 11, 10, 7};
    static int [] alocasia = {15, 9, 10, 12};
    static int [] mawar = {7, 12, 5, 9};

    static int [] totPendapatan = new int [4];
    static String [] status = new String[4];

    static void hitungPend(){
        int hargaAglonema = 75000, hargaKeladi = 50000, hargaAlocasia = 60000, hargaMawar = 10000;
        for (int i = 0; i < cabang.length; i++) {
            totPendapatan[i] = (aglonema[i] * hargaAglonema) + (keladi[i] * hargaKeladi) + (alocasia[i] * hargaAlocasia) + (mawar[i] * hargaMawar);

            if (totPendapatan[i] > 1500000) {
                status[i] = "Sangat Baik";
            }else {
                status [i] = "Perlu Evaluasi";
            }
        }
    }

    static void tampilTabelStock (){
        System.out.println("=============================================================================");
        System.out.println("Program Pendapatan Royal Garden");
        System.out.println("==============================================================================");
        System.out.println("\t\t\tAglonema\tKeladi\t\tAlocasia\tMawar");

        for (int i = 0; i < cabang.length; i++) {
            System.out.println(cabang[i] + "\t\t" + aglonema[i] + "\t\t" + keladi[i] + "\t\t" + alocasia[i] + "\t\t" + mawar[i]);
        }
    }

    static void tampilPendapatan (){
        System.out.println("==============================================================================");
        System.out.println("Pendapatan dan Status Cabang");
        System.out.println("===============================================================================");

        for (int i = 0; i < cabang.length; i++) {
            System.out.println(cabang[i] + "\t\tRp " + totPendapatan[i] + "\t\t" + status[i]);
        }
    }

    public static void main(String[] args) {
        hitungPend();
        tampilTabelStock();
        tampilPendapatan();
    }
}