package P14;

public class BinaryTree18 {
    Node18 root;
    nodeBuku18 rootBuku; // node untuk menyimpan buku

    public BinaryTree18() {
        root = null;
        rootBuku = null;
    }

    // construktur untuk inisialisasi root nodeBuku18
    public BinaryTree18(nodeBuku18 rootBuku) {
        this.rootBuku = rootBuku;
    }

    public boolean isEmpty() {
        return root == null;
    }   

    // mengeceek apakah tree buku kosong
    public boolean isEmptyBuku() {
        return rootBuku == null;
    }


    public void add (Mahasiswa18 mahasiswa) {
       Node18 newNode = new Node18(mahasiswa);
         if (isEmpty()) {
              root = newNode;
         } else {
              Node18 current = root;
              Node18 parent = null;
              while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                     current = current.left;
                     if (current == null) {
                          parent.left = newNode;
                          return;
                     }
                } else {
                     current = current.right;
                     if (current == null) {
                          parent.right = newNode;
                          return;
                     }
                }
              }
         }
    }

    // method untuk add diurutkan bersadarkan tahun terbit
    public void addBuku (buku18 buku) {
        nodeBuku18 newNode = new nodeBuku18(buku);
        if (isEmptyBuku()) {
            rootBuku = newNode;
        } else {
            nodeBuku18 current = rootBuku;
            nodeBuku18 parent = null;
            while (true) {
                parent = current;
                if (buku.tahunTerbit < current.buku.tahunTerbit) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    //method untuk menghitung jumlah buku dengan return int
    public int jumlahTotalBuku(nodeBuku18 node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + jumlahTotalBuku(node.left) + jumlahTotalBuku(node.right);
        }
    }


    // method untuk menampilkan buku yang terbit antara tahunAwal dan tahunAkhir menggunakan transversal in order 
    public void tampilBukuTerbit(nodeBuku18 node, int tahunAwal, int tahunAkhir) {
        if (node != null) {
            tampilBukuTerbit(node.left, tahunAwal, tahunAkhir);
            if (node.buku.tahunTerbit >= tahunAwal && node.buku.tahunTerbit <= tahunAkhir) {
                node.buku.tampilInformasi();
            }
            tampilBukuTerbit(node.right, tahunAwal, tahunAkhir);
        }
    }

    // method untuk menampilkan informasi buku dengan tahun terbit paling baru
    public void tampilBukuTerbaru(nodeBuku18 node) {
        if (node != null) {
            tampilBukuTerbaru(node.right);
            System.out.println("Buku dengan tahun terbit paling baru:");
            node.buku.tampilInformasi();
            tampilBukuTerbaru(node.left);
        }
    }
    

    boolean find (double ipk) {
        boolean result = false;
        Node18 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder (Node18 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder (Node18 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder (Node18 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node18 getSuccessor (Node18 del) {
        Node18 successor = del.right;
        Node18 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
    void delete (double ipk){
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        // cari node (current) yang akan dihapus
        Node18 parent = root;
        Node18 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //penghapusan 
        if (current == null){
            System.out.println("Data tidak ditemukan");
            return;
        }else {
            // jika tidak ada ana (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                } 
            }else if (current.left == null) { // jika hanya memiliki 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            }else if (current.right == null) { // jika hanya memiliki 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            }else { // jika memiliki 2 anak
                Node18 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current =");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    } 



   public void addRekursif(Node18 node, Mahasiswa18 mahasiswa) {
        if (isEmpty()) {
            root = new Node18(mahasiswa);
        } else {
            if (mahasiswa.ipk < node.mahasiswa.ipk) {
                if (node.left == null) {
                    node.left = new Node18(mahasiswa);
                } else {
                    addRekursif(node.left, mahasiswa);
                }
            } else {
                if (node.right == null) {
                    node.right = new Node18(mahasiswa);
                } else {
                    addRekursif(node.right, mahasiswa);
                }
            }
        }
    }



    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        Node18 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Mahasiswa dengan IPK terkecil:");
        current.mahasiswa.tampilInformasi();
    }
 
    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        Node18 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Mahasiswa dengan IPK terbesar:");
        current.mahasiswa.tampilInformasi();
    }



    void tampilMahasiswaIPKdiAtas(Node18 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }
}
