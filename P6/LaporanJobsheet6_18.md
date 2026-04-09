# Laporan Praktikum Dasar Pemorgraman Jobsheet 5
Nama : Nahzul Balaghoh

NIM : 254107020156

Kelas : TI-1E

# 6.2 Searching/ Pencarian Menggunakan Algoritma Sequential Search

Program 

<img width="849" height="649" alt="image" src="https://github.com/user-attachments/assets/825a6364-3e8c-4779-9ae9-622d60276f27" />
<img width="741" height="946" alt="image" src="https://github.com/user-attachments/assets/d4ac460d-9f5c-4208-9664-64638b7ac831" />


Hasil Running

<img width="434" height="538" alt="image" src="https://github.com/user-attachments/assets/b5169a52-c579-4a6f-9acf-b9dfa2094727" />
<img width="469" height="667" alt="image" src="https://github.com/user-attachments/assets/df024740-4e03-4bc1-8fc1-3ab88f1ec194" />


# Pertanyaan

1.	Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!

Jawab: 
tampilPosisi berfungsi untuk menampilkan posisi/indeks dari data yang ditemukan di dalam array. Outputnya hanya berupa informasi letak data, contohnya: "Data mahasiswa dengan IPK 3.5 ditemukan pada indeks 2". Jadi fokusnya adalah memberitahu di mana data tersebut berada.Sedangkan tampilDataSearch berfungsi untuk menampilkan detail informasi lengkap dari mahasiswa yang ditemukan, yaitu NIM, Nama, Kelas, dan IPK. Fokusnya adalah memberitahu apa isi dari data yang ditemukan tersebut.

2.	Jelaskan fungsi break pada kode program di bawah ini!

   <img width="264" height="113" alt="image" src="https://github.com/user-attachments/assets/a98c5043-b81d-462f-b3a6-905ca0b12072" />


Jawab:
break berfungsi untuk menghentikan perulangan secara paksa pada saat data yang dicari sudah ditemukan. Jadi begitu IPK yang dicari cocok dengan salah satu elemen array, program langsung keluar dari perulangan tanpa perlu menelusuri sisa elemen yang ada. Ini membuat proses pencarian menjadi lebih efisien karena tidak membuang waktu memeriksa data yang tidak perlu lagi diperiksa.

3.	Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?

Jawab:
Variabel pos berfungsi sebagai penunjuk lokasi data yang ditemukan di dalam array listMhs. Jika data ditemukan, pos akan berisi angka indeks tempat data tersebut berada, kemudian indeks ini digunakan untuk mengakses listMhs[pos] sehingga detail data mahasiswa bisa ditampilkan. Jika data tidak ditemukan, pos akan tetap bernilai -1 yang menjadi tanda bagi program untuk menampilkan pesan bahwa data tidak ditemukan, sehingga program tidak akan mencoba mengakses array di indeks yang tidak valid.

4.	Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan.

Jawab:
Yang akan ditampilkan adalah data pertama yang ditemukan, yaitu data dengan indeks terkecil. Hal ini terjadi karena perulangan berjalan mulai dari j = 0 ke atas, sehingga data yang berada di indeks paling awal akan ditemukan lebih dulu. Begitu ditemukan, langsung dieksekusi break sehingga perulangan berhenti dan data di indeks berikutnya yang memiliki IPK sama tidak akan pernah dicapai.

5.	Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?

Jawab:
Jika break dihapus, perulangan akan terus berjalan sampai elemen terakhir meskipun data sudah ditemukan sebelumnya. Akibatnya jika terdapat lebih dari satu data dengan IPK yang sama, variabel posisi akan terus ditimpa setiap kali menemukan data yang cocok, sehingga pada akhirnya posisi akan menyimpan indeks dari data terakhir yang cocok, bukan data pertama.

# 6.3. Searching/ Pencarian Menggunakan Algoritma Binary Search

Program 

<img width="541" height="335" alt="image" src="https://github.com/user-attachments/assets/7705f886-e3a9-4f2f-8f67-c085ba854a23" />

<img width="774" height="209" alt="image" src="https://github.com/user-attachments/assets/539a61cd-d130-46ce-a1ea-11902a220ea8" />


Hasil Running

<img width="424" height="555" alt="image" src="https://github.com/user-attachments/assets/68faa859-7852-4ca5-b144-496ee59cff98" />
<img width="479" height="692" alt="image" src="https://github.com/user-attachments/assets/7cb62075-d433-4307-9ec6-331c77bed829" />


# Pertanyaan 
1. Tunjukkan pada kode program yang mana proses divide dijalankan!

Jawab:
<img width="201" height="30" alt="image" src="https://github.com/user-attachments/assets/ad661939-ea20-4003-814b-b6feaad54477" />


2. Tunjukkan pada kode program yang mana proses conquer dijalankan!

Jawab:
<img width="268" height="48" alt="image" src="https://github.com/user-attachments/assets/7ef638a7-55ae-4d9c-a561-1cb4ca161269" />


3. Apa fungsi left, right, dan mid?

Jawab :
left adalah batas indeks paling kiri dari bagian array yang sedang diperiksa. Nilai awalnya adalah 0 (indeks pertama array).
right adalah batas indeks paling kanan dari bagian array yang sedang diperiksa. Nilai awalnya adalah jumMhs - 1 (indeks terakhir array).
mid adalah indeks tengah yang dihitung dari left + right. Elemen di posisi mid inilah yang dibandingkan dengan nilai yang dicari. Jika cocok, pencarian selesai. Jika tidak, pencarian dilanjutkan ke bagian kiri atau kanan tergantung hasil perbandingan.

4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian?

Jawab:
Program masih bisa berjalan tetapi hasilnya tidak dapat dijamin benar. Binary search memiliki syarat utama yaitu data harus sudah dalam keadaan terurut terlebih dahulu. Jika data tidak urut, logika pembagian ke kiri atau kanan menjadi tidak valid karena asumsi bahwa elemen di sebelah kiri lebih kecil dan sebelah kanan lebih besar tidak terpenuhi, sehingga data yang sebenarnya ada bisa saja dinyatakan tidak ditemukan.

5.	Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai

Jawab: 
Hasilnya tidak sesuai / tidak ditemukan. Hal ini dikarenakan logika kodenya saat ini dibuat untuk data Ascending (kecil ke besar).

6.	Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam array.

Jawab:
Binary search menentukan data tidak ditemukan ketika kondisi right >= left sudah tidak terpenuhi lagi, artinya seluruh bagian array sudah diperiksa habis dan tidak ada elemen yang cocok. Pada saat itulah program mengeksekusi return -1. Nilai -1 ini kemudian diterima oleh tampilPosisi dan tampilDataSearch sebagai sinyal bahwa data tidak ada, lalu ditampilkan pesan "tidak ditemukan". Proses ini terjadi karena setiap kali perbandingan gagal, rentang pencarian terus dipersempit hingga akhirnya left melampaui right dan tidak ada lagi elemen yang bisa diperiksa.

7.	Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard.
Jawab:
<img width="605" height="297" alt="image" src="https://github.com/user-attachments/assets/49e2b779-5fd6-48fe-8c2a-421bab7a8e85" />
















