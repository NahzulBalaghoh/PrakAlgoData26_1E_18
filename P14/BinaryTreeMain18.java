package P14;
 
public class BinaryTreeMain18 {
    public static void main(String[] args) {
        BinaryTree18 bst = new BinaryTree18();
 
        bst.add(new Mahasiswa18("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa18("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa18("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa18("244160220", "Dewi", "B", 3.54));
 
        System.out.println("\nDaftar semua mahasiswa (in oder traversal):");
        bst.traverseInOrder(bst.root);
 
        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);
 
        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);
 
        bst.add(new Mahasiswa18("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa18("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa18("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);
 
        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);


        System.out.println("\n\n=== Tugas 1: addRekursif ===");
        BinaryTree18 bstRekursif = new BinaryTree18();
        bstRekursif.addRekursif(bstRekursif.root, new Mahasiswa18("244160121", "Ali", "A", 3.57));
        bstRekursif.addRekursif(bstRekursif.root, new Mahasiswa18("244160221", "Badar", "B", 3.85));
        bstRekursif.addRekursif(bstRekursif.root, new Mahasiswa18("244160185", "Candra", "C", 3.21));
        bstRekursif.addRekursif(bstRekursif.root, new Mahasiswa18("244160220", "Dewi", "B", 3.54));
        bstRekursif.addRekursif(bstRekursif.root, new Mahasiswa18("244160131", "Devi", "A", 3.72));
        System.out.println("InOrder Traversal hasil addRekursif:");
        bstRekursif.traverseInOrder(bstRekursif.root);


        System.out.println("\n=== Tugas 2: cariMinIPK dan cariMaxIPK ===");
        bstRekursif.cariMinIPK();
        bstRekursif.cariMaxIPK();


        System.out.println("\n=== Tugas 3: tampilMahasiswaIPKdiAtas(3.50) ===");
        System.out.println("Mahasiswa dengan IPK di atas 3.50:");
        bstRekursif.tampilMahasiswaIPKdiAtas(bstRekursif.root, 3.50);

        System.out.println("");

        // Inisialisasi BinaryTree18 untuk menyimpan buku
        BinaryTree18 treeBuku = new BinaryTree18();
        // menambahkan data baru 
        treeBuku.addBuku(new buku18("B01", "Struktur Data Java", "Rahma", 2017));
        treeBuku.addBuku(new buku18("B02", "Algoritma Pemrograman", "Aldi", 2012));
        treeBuku.addBuku(new buku18("B03", "Pemrograman Web Modern", "Eko", 2022));
        treeBuku.addBuku(new buku18("B04", "Dasar-Dasar AI", "Kanaya", 2021));
        treeBuku.addBuku(new buku18("B05", "Sistem Operasi", "Ayu", 2011));
        treeBuku.addBuku(new buku18("B06", "Keamanan Jaringan", "Irgi", 2025));

        System.out.println("\n=== 1. Menghitung Jumlah Total Buku ===");
        int total = treeBuku.jumlahTotalBuku(treeBuku.rootBuku);
        System.out.println("Jumlah total buku yang terdaftar di sistem: " + total + " buku.");
        System.out.println("------------------------------------------------------------");

        System.out.println("\n=== 2. Menampilkan Buku Berdasarkan Rentang Tahun ===");
        // Untuk method tampilBukuTerbit dengan parameter tahunAwal dan tahunAkhir
        int tahunAwal = 2015;
        int tahunAkhir = 2021;
        System.out.println("Daftar Buku Terbit Antara Tahun " + tahunAwal + " s/d " + tahunAkhir + " (InOrder):");
        treeBuku.tampilBukuTerbit(treeBuku.rootBuku, tahunAwal, tahunAkhir);
        System.out.println("------------------------------------------------------------");

        System.out.println("\n=== 3. Menampilkan Buku dengan Tahun Terbit Terbaru ===");
        // Untuk method yang mencari nilai Max (paling kanan di BST)
        treeBuku.tampilBukuTerbaru(treeBuku.rootBuku);
        System.out.println("------------------------------------------------------------");
    }
}