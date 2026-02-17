package P1;
import java.util.Scanner;

public class tugas2 {
    static Scanner nahzul1 = new Scanner(System.in);
    static String [][] data; 
    static void dataJdwl (){
        for (int i = 0; i < data.length; i++) {
            System.out.println("Jadwal ke-" + (i+1));

            System.out.print("Nama Mata Kuliah: ");
            data[i][0] = nahzul1.nextLine();
            System.out.print("Ruang: ");
            data[i][1] = nahzul1.nextLine();
            System.out.print("Hari Kuliah: ");
            data[i][2] = nahzul1.nextLine();
            System.out.print("Jam Kuliah: ");
            data[i][3] = nahzul1.nextLine();
        }
        
    }
    static void tmplTabel (){
        System.out.println("================================================================");
        System.out.printf("%-35s %-15s %-10s %-15s\n","Nama Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("================================================================");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-35s %-15s %-10s %-15s\n",data[i][0],data[i][1],data[i][2],data[i][3]);
        }
        System.out.println("=================================================================");
    }
    static void bdsHari (){
        System.out.print("Mau cari jadwal berdasarkan hari tertentu? (y/n): ");
        String cari = nahzul1.nextLine();
        if (cari.equalsIgnoreCase("y")) {
            System.out.print("Masukkan hari yang ingin dicari: ");
            String hari = nahzul1.nextLine();

            System.out.println("=============================================================");
            boolean ditemukan = false;
            for (int i = 0; i < data.length; i++) {
                if (data[i][2].equalsIgnoreCase(hari)) {
                    System.out.printf("%-35s %-15s %-10s %-15s\n","Nama Mata Kuliah", "Ruang", "Hari", "Jam");
                    System.out.printf("%-35s %-15s %-10s %-15s\n",data[i][0],data[i][1],data[i][2],data[i][3]);
                    ditemukan = true;
                }
            }
            if (!ditemukan) {
                System.out.println("Tidak ada jadwal kuliah pada hari " + hari);
            }
            System.out.println("=============================================================");
        }
    }
    static void bdsMatkul(){
        System.out.print("Mau cari jadwal berdasarkan mata kuliah tertentu? (y/n): ");
        String cariLagi = nahzul1.nextLine();
        if (cariLagi.equalsIgnoreCase("y")) {
            System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
            String matkul = nahzul1.nextLine();

            System.out.println("=============================================================");
            boolean ditemukan1 = false;
            for (int i = 0; i < data.length; i++) {
                if (data[i][0].equalsIgnoreCase(matkul)) {
                    System.out.printf("%-35s %-15s %-10s %-15s\n","Nama Mata Kuliah", "Ruang", "Hari", "Jam");
                    System.out.printf("%-35s %-15s %-10s %-15s\n",data[i][0],data[i][1],data[i][2],data[i][3]);
                    ditemukan1 = true;
                }
            }
            if (!ditemukan1) {
                System.out.println("Tidak ada jadwal kuliah untuk mata kuliah " + matkul);
            }
            System.out.println("=============================================================");
        }
    }
    public static void main(String[] args) {
        Scanner nahzul = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int jmlJdwl = nahzul.nextInt();

        data = new String[jmlJdwl][4];

        dataJdwl();
        tmplTabel();
        bdsHari();
        bdsMatkul();

        nahzul.close();
    }
}
