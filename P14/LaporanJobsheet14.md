# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 14

Nama : Nahzul Balaghoh

NIM : 254107020156

Kelas : TI-1E

# 14.2 Kegiatan Praktikum 1

Implementasi Binary Search Tree menggunakan Linked List (100 Menit)

Pogram 

<img width="419" height="308" alt="Screenshot 2026-06-05 200055" src="https://github.com/user-attachments/assets/88513442-6909-4022-8a06-182f92fe65bd" />
<img width="629" height="511" alt="Screenshot 2026-06-05 200104" src="https://github.com/user-attachments/assets/ff5c5777-1bed-4513-bdf0-767f8405c7a9" />
<img width="547" height="777" alt="Screenshot 2026-06-05 200118" src="https://github.com/user-attachments/assets/58d5c817-16d0-41c4-98eb-c1643d8fb69c" />
<img width="539" height="818" alt="Screenshot 2026-06-05 200128" src="https://github.com/user-attachments/assets/ef34c3e6-5c72-47c9-8683-ba00c2fc193e" />
<img width="529" height="773" alt="Screenshot 2026-06-05 200141" src="https://github.com/user-attachments/assets/e388f527-3e6d-4801-9654-fa1ce4be762b" />
<img width="635" height="769" alt="Screenshot 2026-06-05 200201" src="https://github.com/user-attachments/assets/4bbfb091-cbb4-4c2b-80e4-efacb3b63da7" />
<img width="558" height="407" alt="Screenshot 2026-06-05 200212" src="https://github.com/user-attachments/assets/e9a176ba-1ea9-4c9f-bab7-ee0ea69d2ea4" />
<img width="799" height="833" alt="Screenshot 2026-06-05 200226" src="https://github.com/user-attachments/assets/be5bebd2-f1f1-4b38-8990-e8336b5be4c0" />

Hasil Running

<img width="638" height="892" alt="Screenshot 2026-06-05 200044" src="https://github.com/user-attachments/assets/f00774f9-77e2-40be-9dfe-a0276b1186ba" />


# Pertanyaan

1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?
   
    jawab: Pencarian lebih efektif karena BST menyusun data secara terurut dimana child kiri lebih kecil, child kanan lebih besar dari parent. Struktur ini mengeliminasi setengah ruang pencarian pada setiap iterasi, sehingga kompleksitas waktunya jauh lebih efisien
    
2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
    
    jawab: Atribut tersebut berfungsi sebagai pointer penunjuk percabangan node. left menunjuk ke cabang anak kiri, dan right menunjuk ke cabang anak kanan
    
3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?

    jawab: root berfungsi sebagai titik awal atau puncak dari seluruh penelusuran struktur tree

   b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?

     jawab: Nilai awal root saat objek baru dibuat adalah null

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?

    jawab: Node baru yang ditambahkan akan langsung ditetapkan sebagai root dari tree tersebut

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?
    <img width="462" height="289" alt="image" src="https://github.com/user-attachments/assets/29a16860-fad1-42bf-a4d4-a607af8755cf" />

    jawab: Blok kode tersebut menelusuri ke bawah (traversal) untuk mencari posisi daun (leaf) kosong guna menyisipkan node baru. Node diarahkan ke kiri jika IPK lebih kecil dari parent , atau ke kanan jika lebih besar, hingga menemukan posisi bernilai null untuk menempatkan data

6. Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua anak. Bagaimana method getSuccessor() membantu dalam proses ini?

    jawab: Saat menghapus node dengan dua child, method getSuccessor() digunakan untuk mencari node pengganti (nilai terkecil pada subtree kanan). Posisi node yang dihapus kemudian digantikan oleh suksesor tersebut dengan menyesuaikan pointer agar hierarki tree tetap utuh.


# 14.3 Kegiatan Praktikum 2

Implementasi Binary Tree dengan Array (45 Menit)

Program

<img width="533" height="503" alt="Screenshot 2026-06-05 200926" src="https://github.com/user-attachments/assets/d59c4bca-1863-438f-b953-89429189a4b1" />
<img width="797" height="435" alt="Screenshot 2026-06-05 200935" src="https://github.com/user-attachments/assets/413296f3-8e98-424d-ba71-fa4caf54c89b" />

Hasil Running

<img width="452" height="164" alt="Screenshot 2026-06-05 200914" src="https://github.com/user-attachments/assets/9a6b8519-f170-4d65-a2d3-c62c3f01b972" />


# Pertanyaan 

1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?

    jawab: Atribut data (dataMahasiswa) digunakan untuk menyimpan objek dalam bentuk array, sedangkan idxLast menandai batas indeks tertinggi yang menyimpan node valid dalam tree

2. Apakah kegunaan dari method populateData()?

    jawab: Berfungsi untuk menginisialisasi array beserta batas idxLast ke dalam objek tree dari fungsi utama

3. Apakah kegunaan dari method traverseInOrder()?

    jawab: Mencetak seluruh data node dalam array secara berurutan menggunakan metode penelusuran In-Order (Kiri $\rightarrow$ Root $\rightarrow$ Kanan) secara rekursif

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan right child masing-masing?

    jawab: Left child: indeks 5 (2 * 2 + 1), Right child: indeks 6 (2 * 2 + 2)

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?

    jawab: Mendeklarasikan bahwa indeks ke-6 adalah posisi elemen terakhir yang memiliki data riil di dalam simulasi array pohon biner

6. Mengapa indeks 2*idxStart+1 dan 2*idxStart+2 digunakan dalam pemanggilan rekursif, dan apa kaitannya dengan struktur pohon biner yang disusun dalam array?

    jawab: Rumus tersebut adalah standar pemetaan memori untuk merepresentasikan hierarki tree ke dalam array yang berbentuk linier. 2*idxStart+1 memetakan akses ke anak kiri, sementara 2*idxStart+2 memetakan akses ke anak kanan




