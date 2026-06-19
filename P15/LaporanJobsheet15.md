# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 15

Nama : Nahzul Balaghoh

NIM : 254107020156

Kelas : TI-1E

# 16.2. Kegiatan Praktikum 1
  program
  
  <img width="386" height="381" alt="Screenshot 2026-06-16 214841" src="https://github.com/user-attachments/assets/fe2b169f-ce6f-491f-a1a7-0915bb5164c8" />

  hasil running
  
  <img width="245" height="61" alt="Screenshot 2026-06-16 210545" src="https://github.com/user-attachments/assets/6fc38623-73c7-4427-a7f9-2e773605f90b" />


# Pertanyaan
  1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist?
  
  jawab :  Karena dideklarasikan tanpa generic (List l = new ArrayList()), jadi tipe elemennya dianggap Object. Apa pun bisa disimpan sebagai Object (angka di-autobox jadi Integer, "Cireng" tetap String).
  
  2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu!
  
  jawab :

  <img width="386" height="382" alt="Screenshot 2026-06-16 215343" src="https://github.com/user-attachments/assets/ca16f6b2-f41c-40e6-98af-252686da323c" />

  3. Ubah kode pada baris kode 38 menjadi seperti ini
     
  <img width="227" height="21" alt="image" src="https://github.com/user-attachments/assets/b8edbb9a-4412-4e7c-bf7b-9390fd5ee9af" />

  jawab :
  
  <img width="208" height="65" alt="Screenshot 2026-06-16 215447" src="https://github.com/user-attachments/assets/76f8fd45-6ecc-4169-af13-35770f5460fc" />

  4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya

  <img width="341" height="50" alt="image" src="https://github.com/user-attachments/assets/13f5a59a-2d94-461d-bad1-728b1e1346c5" />

  jawab :
  
  <img width="379" height="62" alt="Screenshot 2026-06-16 215457" src="https://github.com/user-attachments/assets/f59c9a71-6f87-40db-812b-23da99896249" />

  5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!
  
  jawab :
  
  <img width="252" height="77" alt="Screenshot 2026-06-16 215803" src="https://github.com/user-attachments/assets/5f42d314-c61a-4c37-b8cc-1eb79bee0c47" />
  
  push() menyisipkan elemen di awal list (perilaku stack/LIFO), beda dari add() yang menambah di akhir. Karena itu getFirst() jadi "Mei-mei", sedangkan getLast() tetap "Al-Qarni". push(), pop(), getFirst(), getLast() ini cuma ada karena LinkedList implements Deque — itu sebabnya deklarasinya harus diubah dari List<String> jadi LinkedList<String> (pertanyaan 3), karena method-method itu tidak ada di interface List.

# 16.3. Kegiatan Praktikum 2
  program
  
  <img width="314" height="443" alt="Screenshot 2026-06-19 220942" src="https://github.com/user-attachments/assets/507289b6-589f-415d-aa13-0950137f0c2f" />

  hasil running
  
  <img width="173" height="60" alt="Screenshot 2026-06-19 220929" src="https://github.com/user-attachments/assets/d579baf0-95c2-4b33-bb35-8ca6e281103c" />


# Pertanyaan
  1. Apakah perbedaan fungsi push() dan add() pada objek fruits?
  
  jawab : Stack adalah turunan Vector. push() sebenarnya cuma memanggil addElement() di belakangnya (posisi sama dengan add(), di akhir/top stack), tapi push() mengembalikan elemen yang dimasukkan (representasi semantik operasi stack), sedangkan add() mengembalikan boolean.
  
  2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?
  
  jawab :
  
  <img width="305" height="407" alt="Screenshot 2026-06-19 221308" src="https://github.com/user-attachments/assets/b520c814-87a1-4cb7-a49d-2be808de0bbe" />
  
  fruits sudah kosong total karena sebelumnya di-pop() semua lewat while (!fruits.empty()). Tanpa push("Melon") dan push("Durian"), bagian iterator, stream, dan for-loop sesudahnya tidak akan mencetak apa-apa karena stack-nya kosong.
  
  3. Jelaskan fungsi dari baris 46-49?
  
  jawab : Itu cara mengambil elemen pakai Iterator secara manual: it.hasNext() mengecek masih ada elemen atau tidak, it.next() mengambil elemen sekaligus memindah posisi ke elemen berikutnya. Ini alternatif selain for-each.
  
  4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian?
  
  jawab :
  
  <img width="263" height="71" alt="Screenshot 2026-06-19 221559" src="https://github.com/user-attachments/assets/0013f3df-526d-479b-ad3d-79d9767a8327" />
  
  Jika Stack<String> diganti List<String> Akan compile error di push(), add()(masih ok karena ada di List)... tepatnya push(), pop(), dan empty() tidak dikenali, karena method-method itu spesifik milik class Stack, bukan bagian dari interface List.
  
  5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!
  
  jawab :
  
  <img width="291" height="26" alt="Screenshot 2026-06-19 221948" src="https://github.com/user-attachments/assets/46fbfa4c-01a1-4742-a3c5-b433cffb3c96" />

  6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!
  
  jawab :
  
  <img width="338" height="114" alt="Screenshot 2026-06-19 221958" src="https://github.com/user-attachments/assets/0efd8bb0-3306-4f4d-b252-0fe7e7358e4f" />

  <img width="326" height="26" alt="Screenshot 2026-06-19 221726" src="https://github.com/user-attachments/assets/5d532680-d5bb-4b3b-8f98-2282c27463a7" />


# 16.4. Kegiatan Praktikum 3
  
  program 
  
  <img width="383" height="211" alt="Screenshot 2026-06-19 223857" src="https://github.com/user-attachments/assets/49f84aa9-c3bb-4722-9950-5c623ed4a832" />
  
  <img width="395" height="419" alt="Screenshot 2026-06-19 223916" src="https://github.com/user-attachments/assets/4e3044b9-7781-48b7-b856-b9faff0f67ed" />
  
  <img width="396" height="85" alt="Screenshot 2026-06-19 223929" src="https://github.com/user-attachments/assets/2cbf7166-5e20-4017-a998-5bacb12d06b9" />

  
  hasil running

  <img width="230" height="79" alt="Screenshot 2026-06-19 223840" src="https://github.com/user-attachments/assets/e58ab049-3a30-4d1c-9e3b-79724b82632c" />

# Pertanyaan
  1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? Dan kelebihannya apa?
  
  jawab : Itu varargs (variable arguments) — boleh memanggil method dengan jumlah argumen bebas (0, 1, atau banyak objek Mahasiswa18) tanpa bikin overload bermacam-macam atau bungkus manual ke array. Kelebihannya: pemanggilan jadi simpel, contoh lm.tambah(m, m1, m2) langsung tanpa bikin array dulu.
  
  2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!
  
  jawab :
  
  <img width="314" height="134" alt="Screenshot 2026-06-19 224714" src="https://github.com/user-attachments/assets/c99d5d64-7b29-4afb-8a95-bab35931c7ca" />

  3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!
  
  jawab :

  <img width="295" height="179" alt="Screenshot 2026-06-19 224732" src="https://github.com/user-attachments/assets/9c9b126d-bfaf-49e1-aa70-4b1eaf77d8cb" />


# 16.5. Tugas Praktikum
  program no 1
  
  <img width="226" height="181" alt="Screenshot 2026-06-19 231527" src="https://github.com/user-attachments/assets/43d17afa-3768-4329-835c-583fd79a8e89" />
  
  
  <img width="299" height="137" alt="Screenshot 2026-06-19 231538" src="https://github.com/user-attachments/assets/2e5a49d5-eec3-44bd-907b-7fe939dc0367" />

  
  <img width="257" height="401" alt="Screenshot 2026-06-19 231554" src="https://github.com/user-attachments/assets/e4088e30-ea56-4671-9701-2bbf47faca70" />

  
  <img width="388" height="459" alt="Screenshot 2026-06-19 231612" src="https://github.com/user-attachments/assets/4dae36c9-c33a-4ede-94a7-2710f23fd79a" />

  
  <img width="392" height="407" alt="Screenshot 2026-06-19 231627" src="https://github.com/user-attachments/assets/aec65fe2-59be-45ec-9579-e945bbc6fc43" />

  
  <img width="393" height="209" alt="Screenshot 2026-06-19 231640" src="https://github.com/user-attachments/assets/b39f3218-4a51-4550-986d-b1aa451657e5" />

  hasil running
  
  <img width="224" height="340" alt="Screenshot 2026-06-19 231137" src="https://github.com/user-attachments/assets/9e97711c-40cd-4b80-9d31-d24737877486" />

  
  <img width="321" height="146" alt="Screenshot 2026-06-19 231148" src="https://github.com/user-attachments/assets/79783f92-41ef-4dc6-b42f-8ff504d8bdca" />

  
  <img width="329" height="343" alt="Screenshot 2026-06-19 231503" src="https://github.com/user-attachments/assets/cc10c824-74f1-441d-ae51-31662dbb72c7" />


  program no 2
  
  <img width="332" height="132" alt="Screenshot 2026-06-19 231645" src="https://github.com/user-attachments/assets/e9c31a86-36a9-4431-b64f-d068ae7757bd" />

  

  
