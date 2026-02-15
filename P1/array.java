package P1;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner nahzul = new Scanner(System.in);
        int jumlahsks = 8;
        String [] matkul = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja" }; 
        double [] bobotSks = {2,2,2,2,2,2,2,2};
        double [] nilaiangka = new double [jumlahsks];
        String [] nilaiHuruf = new String[jumlahsks];
        double []  bobotNilai = new double[jumlahsks]; 
        double totBobot = 0;
        int totSks = 0 ;
       

        System.out.println("========================================================================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("========================================================================================");
        
        for (int i = 0; i < jumlahsks; i++) {
            while (true) {
                System.out.print("Masukkan Nilai Angka unutk MK " + matkul[i] + ": ");
                double nilai = nahzul.nextDouble();

                if (nilai >=0 && nilai <= 100) {
                    nilaiangka [i] = nilai;

                    if (nilai > 80) {
                        nilaiHuruf [i] = "A";
                         bobotNilai [i] = 4.0 ;
                    }else if (nilai > 73) {
                        nilaiHuruf [i] = "B+";
                         bobotNilai [i] = 3.5 ;
                    }else if (nilai > 63) {
                        nilaiHuruf [i] = "B";
                         bobotNilai [i] = 3.0 ;
                    }else if (nilai > 60) {
                        nilaiHuruf [i] = "C+";
                         bobotNilai [i] = 2.5 ;
                    }else if (nilai > 50) {
                        nilaiHuruf [i] = "C";
                         bobotNilai [i] = 2.0 ;
                    }else if (nilai > 39) {
                        nilaiHuruf [i] = "D";
                         bobotNilai [i] = 1.0 ;
                    }else{
                        nilaiHuruf [i] = "E";
                         bobotNilai [i] = 0.0 ;
                    }

                    break;
                }else{
                    System.out.println("Nilai harus antara 0-100. Silahkan input ulang!");
                }
            }
        }

        for (int i = 0; i < jumlahsks; i++) {
            totSks += bobotSks[i];
            double hasilBobot =  bobotNilai [i] * bobotSks[i];
            totBobot += hasilBobot;
        }

        double ip = totBobot / totSks;

        System.out.println("==========================================================================================");
        System.out.println("Hasil konversi nilai");
        System.out.println("==========================================================================================");
        System.out.println("MK\t\t\t\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        
        for (int i = 0; i < jumlahsks; i++) {
            System.out.printf("%-45s %-15.2f %-15s %-15.2f%n", matkul[i], nilaiangka[i], nilaiHuruf [i],  bobotNilai [i]);
        }

        System.out.println("===========================================================================================");
        System.out.printf("IP : %.2f%n", ip);

        nahzul.close();
    }
}
