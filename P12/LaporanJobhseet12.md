#  Laporan Praktikum Dasar Pemorgraman Jobsheet 12
Nama : Nahzul Balaghoh

NIM : 254107020156

Kelas : TI-1E

#  12.2 Percobaan 1: Operasi Penambahan pada Double Linked List

Program 

<img width="592" height="434" alt="Screenshot 2026-05-20 181421" src="https://github.com/user-attachments/assets/9e83e804-684a-4a40-a146-2a8abd20b1aa" />
<img width="332" height="256" alt="Screenshot 2026-05-20 181428" src="https://github.com/user-attachments/assets/cc7b25ab-413c-457e-b44c-52218fd32961" />
<img width="389" height="633" alt="Screenshot 2026-05-20 182341" src="https://github.com/user-attachments/assets/9f932f3a-e92b-4e3e-a6ec-81fe6cba475e" />
<img width="595" height="652" alt="Screenshot 2026-05-20 182354" src="https://github.com/user-attachments/assets/149d4be8-d315-4dfb-a9d9-89c64b9c9847" />
<img width="573" height="800" alt="Screenshot 2026-05-20 183838" src="https://github.com/user-attachments/assets/ebe74c54-ab52-4043-8529-0dd883d6a45f" />
<img width="493" height="498" alt="Screenshot 2026-05-20 183952" src="https://github.com/user-attachments/assets/97df617e-8007-44e9-8f94-8a41e2292b7f" />

Hasil running 

<img width="278" height="750" alt="Screenshot 2026-05-20 184338" src="https://github.com/user-attachments/assets/2fbd69e0-52f2-4950-a82a-95c3f909e3f1" />

# Pertanyaan 
1.	Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan Double Linked List!

Jawab : 
Single Linked List Setiap node hanya memiliki satu pointer yaitu next yang menunjuk ke node berikutnya. Traversal hanya bisa dilakukan satu arah (head menuju tail).

Double Linked List: Setiap node memiliki dua pointer yaitu next (ke node berikutnya) dan prev (ke node sebelumnya). Traversal bisa dilakukan dua arah (head menuju tail maupun tail menuju head), sehingga lebih fleksibel dalam manipulasi node.

2.	Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi masing-masing atribut tersebut pada proses traversal dan manipulasi node!

Jawab : 
next: Menyimpan referensi ke node berikutnya dalam linked list. Digunakan saat traversal maju (forward).
prev: Menyimpan referensi ke node sebelumnya. Digunakan saat traversal mundur (backward)

3.	Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut terhadap kondisi awal linked list!

Jawab : Konstruktor ini menginisialisasi kondisi awal linked list sebagai list kosong, dengan menetapkan head dan tail bernilai null. Ini memastikan method isEmpty() bekerja dengan benar dan mencegah error saat operasi pertama kali dilakukan pada list yang belum memiliki node.

4.	Perhatikan potongan kode berikut:

<img width="683" height="86" alt="image" src="https://github.com/user-attachments/assets/dc4ff4c8-1e85-43cc-b8f2-9483310a4fa7" />

Mengapa head dan tail harus menunjuk node yang sama ketika linked list masih kosong?

Jawab : Agar head selalu menandai awal list dengan benar dan tail selalu menandai akhir list dengan benar. Jika hanya salah satu yang diset, pointer satunya akan tetap null dan menyebabkan eror pada operasi berikutnya. 

5.	Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika tidak terdapat data pada linked list!

Jawab : 

<img width="418" height="215" alt="Screenshot 2026-05-20 190424" src="https://github.com/user-attachments/assets/60111e0b-d073-471d-98c6-9e2736fc9bd8" />


6.	Modifikasi kode program dengan menambahkan method printReverse() untuk menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail menuju head!

Jawab : 

<img width="408" height="196" alt="Screenshot 2026-05-20 190649" src="https://github.com/user-attachments/assets/0f547b84-76f3-4d7b-9793-8bda4930924e" />


# 12.3 Percobaan 2: Operasi Penghapusan pada Double Linked List

Program

<img width="422" height="493" alt="Screenshot 2026-05-20 191613" src="https://github.com/user-attachments/assets/9f58c8f7-eec6-4263-9395-d07ad3d06f43" />

Hasil running 

<img width="273" height="435" alt="Screenshot 2026-05-20 185517" src="https://github.com/user-attachments/assets/b69af9b2-a9c1-4b0b-9cf1-cefcd85bed77" />

# Pertanyaan 
1.	Perhatikan potongan kode berikut pada method removeFirst():

<img width="685" height="62" alt="image" src="https://github.com/user-attachments/assets/fc584b2c-b132-46f7-b0d6-a4192f9941aa" />

Jelaskan fungsi masing-masing statement tersebut pada proses penghapusan node!

Jawab : 
head = head.next: Memindahkan pointer head ke node kedua (yang sekarang menjadi node pertama baru). Node lama di awal sudah tidak direferensikan oleh head.
head.prev = null: Memutus pointer prev dari node baru (yang kini menjadi head) agar tidak lagi menunjuk ke node lama yang sudah dihapus. Ini penting agar node lama bisa di-garbage collect oleh Java dan linked list tidak memiliki referensi "mundur" ke node yang sudah dihapus.

2.	Modifikasi method removeFirst() dan removeLast() agar program menampilkan data yang berhasil dihapus!

Jawab : 

<img width="448" height="660" alt="Screenshot 2026-05-20 185502" src="https://github.com/user-attachments/assets/e85bce70-03af-4984-8d49-9a08e26788d5" />


# Tugas 

Program 

<img width="638" height="860" alt="Screenshot 2026-05-20 192531" src="https://github.com/user-attachments/assets/6753779d-3727-4c00-a897-af6ed0c50f07" />
<img width="641" height="972" alt="Screenshot 2026-05-20 192600" src="https://github.com/user-attachments/assets/edceab35-5291-4d65-9530-16df60c91cc0" />
<img width="374" height="253" alt="Screenshot 2026-05-20 192615" src="https://github.com/user-attachments/assets/73456fef-038a-4130-9a7b-2a699071e5a5" />
<img width="608" height="126" alt="Screenshot 2026-05-20 192628" src="https://github.com/user-attachments/assets/19bf1b54-b353-42c7-a244-6f11ea6fd179" />
<img width="447" height="698" alt="Screenshot 2026-05-20 192640" src="https://github.com/user-attachments/assets/552b070a-0588-45a4-b527-20a59272fd39" />

Hasil running 

<img width="279" height="958" alt="Screenshot 2026-05-20 193756" src="https://github.com/user-attachments/assets/cdb81b81-3d8b-4d58-826f-f28de6691880" />
<img width="271" height="878" alt="Screenshot 2026-05-20 193933" src="https://github.com/user-attachments/assets/3bdc9291-13d9-4fac-be74-69c9af7e5bc8" />
<img width="272" height="342" alt="Screenshot 2026-05-20 193942" src="https://github.com/user-attachments/assets/48ec0958-ad93-42b1-b266-759c2f423764" />

