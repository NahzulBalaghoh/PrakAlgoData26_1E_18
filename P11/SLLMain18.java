package P11;
import java.util.Scanner;

public class SLLMain18 {
    public static void main(String[] args) {
        Scanner nahzul = new Scanner(System.in);

        SingleLinkedList18 sll = new SingleLinkedList18();
       
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jml = Integer.parseInt(nahzul.nextLine());
        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan data mahasiswa ke-"+(i+1));
            System.out.print("NIM: ");
            String nim = nahzul.nextLine();
            System.out.print("Nama: ");
            String nama = nahzul.nextLine();
            System.out.print("Kelas: ");
            String kelas = nahzul.nextLine();
            System.out.print("IPK: ");
            double ipk = Double.parseDouble(nahzul.nextLine());

            Mahasiswa18 mhs = new Mahasiswa18(nim, nama, kelas, ipk);
            
            System.out.println("Tambah sebagai: 1=First, 2=Last");
            System.out.println("Pilihan: ");
            int pilih = nahzul.nextInt();
            nahzul.nextLine(); 
            
            if (pilih == 1) {
                sll.addFirst(mhs);
            } else {
                sll.addLast(mhs);
            }
        }
        nahzul.close();
    }
}
