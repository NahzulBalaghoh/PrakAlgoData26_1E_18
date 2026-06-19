package P15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa18 {
    List<Mahasiswa18> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa18... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa18 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(String nim) {
        sortAscending(); 
        
        Mahasiswa18 keyMhs = new Mahasiswa18(nim, "", "");
        Comparator<Mahasiswa18> c = new Comparator<Mahasiswa18>() {
            @Override
            public int compare(Mahasiswa18 m1, Mahasiswa18 m2) {
                return m1.nim.compareTo(m2.nim);
            }
        };
        
        return Collections.binarySearch(mahasiswas, keyMhs, c);
    }

    public static void main(String[] args) {
        ListMahasiswa18 lm = new ListMahasiswa18();
        Mahasiswa18 m = new Mahasiswa18("201234", "Noureen", "021xx1");
        Mahasiswa18 m1 = new Mahasiswa18("201235", "Akhleema", "021xx2");
        Mahasiswa18 m2 = new Mahasiswa18("201236", "Shannum", "021xx3");
        // menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        // menampilkan list mahasiswa
        lm.tampil();
        // update mahasiswa
        lm.update(lm.linearSearch("201235"), new Mahasiswa18("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}