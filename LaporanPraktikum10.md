#  Laporan Praktikum Dasar Pemorgraman Jobsheet 10
Nama : Nahzul Balaghoh

NIM : 254107020156

Kelas : TI-1E

#  2.1 Percobaan 1 : Operasi Dasar Queue

Praktikum 

<img width="646" height="892" alt="Screenshot 2026-05-11 151623" src="https://github.com/user-attachments/assets/d4f97900-fb65-431c-883d-a68beed65175" />
<img width="504" height="884" alt="Screenshot 2026-05-11 151638" src="https://github.com/user-attachments/assets/56d8cd1f-124c-47bb-94c8-d2477ffe1fed" />
<img width="482" height="813" alt="Screenshot 2026-05-11 151648" src="https://github.com/user-attachments/assets/b31ecfcf-4cc2-48ad-a5b9-4b443588119f" />

Hasil running 
<img width="383" height="689" alt="Screenshot 2026-05-11 151604" src="https://github.com/user-attachments/assets/dd10d26a-d44e-49e1-b08d-a4b55265b78f" />

# Pertanyaan 
1.	Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?

Jawab : front dan rear bernilai -1 sebagai tanda bahwa queue masih kosong dan belum ada elemen yang menempati indeks array manapun.

2.	Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!

Jawab : Ketika rear sudah berada di indeks terakhir array (max - 1), daripada keluar batas array, rear dikembalikan ke indeks 0. Tujuannya agar slot yang sudah kosong (karena dequeue) di bagian depan array bisa dipakai ulang, sehingga array tidak terbuang sia-sia.

3.	Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!

Jawab : Ketika front sudah di posisi indeks terakhir dan perlu maju ke elemen berikutnya, front dibungkus kembali ke indeks 0 agar tetap dalam batas array.

4.	Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?

Jawab : Karena elemen pertama yang valid tidak selalu berada di indeks 0. Elemen terdepan selalu ada di posisi front. Jika dimulai dari i = 0, kita bisa mencetak data yang sudah di-dequeue atau data sampah. Dengan i = front, kita mencetak tepat dari elemen pertama yang masih ada di antrian.

5.	Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!

Jawab : Ketika i mencapai indeks terakhir (max - 1), ekspresi (max - 1 + 1) % max = 0, sehingga i kembali ke 0. Ini memungkinkan loop menelusuri seluruh elemen queue meskipun posisinya "melingkar" di array.

6.	Tunjukkan potongan kode program yang merupakan queue overflow!

Jawab : <img width="336" height="63" alt="Screenshot 2026-05-11 165406" src="https://github.com/user-attachments/assets/d7fbea11-d401-4f2a-9f42-6b791a74d911" />


7.	Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!

Jawab : <img width="444" height="424" alt="Screenshot 2026-05-11 170144" src="https://github.com/user-attachments/assets/8efe247e-734f-4bf7-8a57-db8097275491" />


# 2.2. Percobaan 2 : Antrian Layanan Akademik

Program 
<img width="613" height="333" alt="Screenshot 2026-05-11 164356" src="https://github.com/user-attachments/assets/cea73140-f28c-439a-953d-f410ebe50771" />
<img width="493" height="904" alt="Screenshot 2026-05-11 164411" src="https://github.com/user-attachments/assets/6725e26b-cd48-4e09-bab4-71dcefa5557e" />
<img width="612" height="942" alt="Screenshot 2026-05-11 164421" src="https://github.com/user-attachments/assets/79f6f3e8-b73e-47d5-850d-3c38f552a691" />
<img width="330" height="71" alt="Screenshot 2026-05-11 164449" src="https://github.com/user-attachments/assets/3dd47f59-c57b-4b18-96ad-3597b72093e8" />
<img width="563" height="835" alt="Screenshot 2026-05-11 164503" src="https://github.com/user-attachments/assets/ba09345e-fcc4-433e-b674-84ec24f508b9" />


Hasil running 
<img width="284" height="734" alt="Screenshot 2026-05-11 164333" src="https://github.com/user-attachments/assets/2b6ccf90-ea53-4634-ab4f-b74d7278906b" />
<img width="500" height="453" alt="Screenshot 2026-05-11 164346" src="https://github.com/user-attachments/assets/80edaa4a-a993-4814-8042-fd09c4942801" />

# Pertanyaan 
Lakukan modifikasi program dengan menambahkan method baru bernama LihatAkhir pada class AntrianLayanan yang digunakan untuk mengecek antrian yang berada di posisi belakang. Tambahkan pula daftar menu 6. Cek Antrian paling belakang pada class LayananAkademikSIAKAD sehingga method LihatAkhir dapat dipanggil!

Jawab : 
<img width="605" height="163" alt="image" src="https://github.com/user-attachments/assets/10b4ba78-303f-4077-85de-8dde2dcf38f1" />
<img width="646" height="661" alt="Screenshot 2026-05-11 171403" src="https://github.com/user-attachments/assets/7cbb316b-c814-4735-a5a9-8d6820996689" />


# Tugas 

Program 
<img width="616" height="345" alt="Screenshot 2026-05-11 173710" src="https://github.com/user-attachments/assets/79e89980-56ac-4c45-8e61-83847a440dac" />
<img width="565" height="718" alt="Screenshot 2026-05-11 173811" src="https://github.com/user-attachments/assets/77d0a1dd-1828-4d79-a5a7-1457951af30b" />
<img width="802" height="785" alt="Screenshot 2026-05-11 173831" src="https://github.com/user-attachments/assets/d6beed4d-05e3-45eb-9019-2ee9bdaf2ffd" />
<img width="563" height="644" alt="Screenshot 2026-05-11 173844" src="https://github.com/user-attachments/assets/210af3dc-22bd-4b63-9d47-f1164d3ae7e1" />
<img width="723" height="877" alt="Screenshot 2026-05-11 174608" src="https://github.com/user-attachments/assets/291a2445-a8e2-4ffc-bf53-b6be988bf022" />
<img width="773" height="460" alt="Screenshot 2026-05-11 174622" src="https://github.com/user-attachments/assets/f7ea0fc5-d2d4-4714-824e-fea6987fac4f" />

Hasil running 
<img width="296" height="927" alt="Screenshot 2026-05-11 181700" src="https://github.com/user-attachments/assets/bc110d8e-fa8b-477d-8bd7-9c1a3a54da9e" />
<img width="288" height="975" alt="Screenshot 2026-05-11 181723" src="https://github.com/user-attachments/assets/32c418ab-cc9d-4ce2-8270-4dcc5afdfba9" />
<img width="322" height="966" alt="Screenshot 2026-05-11 181740" src="https://github.com/user-attachments/assets/a077e535-2b18-4577-8331-e7d541b2397a" />

