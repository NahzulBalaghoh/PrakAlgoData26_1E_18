# Laporan Praktikum Dasar Pemorgraman Jobsheet 5
Nama : Nahzul Balaghoh

NIM : 254107020156

Kelas : TI-1E

# 5.2 Praktikum 1 - Mengimplementasikan Sorting menggunakan object

Program 

<img width="484" height="801" alt="image" src="https://github.com/user-attachments/assets/a587bf99-2fb2-4c86-8be7-359cd5d4b5f6" />
<img width="883" height="449" alt="image" src="https://github.com/user-attachments/assets/f1c01b91-e087-4399-adeb-adc20aab4f57" />
<img width="711" height="480" alt="image" src="https://github.com/user-attachments/assets/7425d0e5-a043-49b7-b31c-17906e946c02" />
<img width="798" height="701" alt="image" src="https://github.com/user-attachments/assets/795e63a1-15f3-4490-81f3-4707a760f2ae" />
<img width="694" height="414" alt="image" src="https://github.com/user-attachments/assets/e3fefa19-edc2-4cae-9e1d-43c6572c0d2b" />
<img width="783" height="1028" alt="image" src="https://github.com/user-attachments/assets/e7efe1c9-911d-4362-ae70-72bf54dacb0a" />

Hasil Runing

<img width="600" height="191" alt="image" src="https://github.com/user-attachments/assets/69c52085-238a-4b10-aadb-11bb342de503" />
<img width="633" height="294" alt="image" src="https://github.com/user-attachments/assets/e9c0bc5d-78a0-4aa9-9564-493ae043575b" />
<img width="619" height="383" alt="image" src="https://github.com/user-attachments/assets/114a9afb-0ae9-48fb-9c83-4201f6a31cba" />

# Pertanyaan 

1.	Jelaskan fungsi kode program berikut
<img width="341" height="200" alt="image" src="https://github.com/user-attachments/assets/8c4b2c53-7b56-4f9b-84f5-c17d5f5590ad" />
Jawab 

Kode tersebut berfungsi untuk menukar posisi dua elemen yang berdekatan jika elemen kiri lebih besar dari elemen kanan. Tujuannya agar elemen yang lebih kecil bergeser ke kiri, sehingga array tersusun secara ascending (menaik).

2.	Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!

Jawab 

<img width="642" height="258" alt="image" src="https://github.com/user-attachments/assets/4f0ffeaa-427e-45f8-997a-996c67e10846" />


3.	Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan

<img width="358" height="50" alt="image" src="https://github.com/user-attachments/assets/535fdae1-c4a9-4094-a934-6578aa7313a6" />


Jawab 

Kondisi ini memiliki dua syarat yang harus terpenuhi sekaligus yakni Memastikan indeks j tidak keluar batas kiri array (tidak minus), Selama elemen di posisi j masih lebih besar dari elemen yang sedang disisipkan (temp) sehingga perulangan terus berjalan selama masih ada elemen di sebelah kiri dan elemen tersebut lebih besar dari nilai yang ingin disisipkan. Jika salah satu kondisi tidak terpenuhi, perulangan berhenti dan posisi penyisipan sudah ditemukan.

4.	Pada Insertion sort, apakah tujuan dari perintah

<img width="228" height="44" alt="image" src="https://github.com/user-attachments/assets/5fe929eb-722f-4487-a58d-99d4005e60c5" />

Jawab 

Perintah ini bertujuan untuk menggeser elemen satu posisi ke kanan, guna membuat ruang kosong bagi elemen yang akan disisipkan. Jadi elemen-elemen yang lebih besar dari temp digeser ke kanan satu per satu, hingga ditemukan posisi yang tepat untuk menyisipkan nilai temp.

# 5.3 Praktikum 2- (Sorting Menggunakan Array of Object)

Program 
 
<img width="975" height="1001" alt="image" src="https://github.com/user-attachments/assets/4de15f93-9219-499f-87e4-09e063e876ec" />
<img width="975" height="1193" alt="image" src="https://github.com/user-attachments/assets/1b6f5561-86c3-4f03-bab6-c43401b1b6aa" />
<img width="975" height="806" alt="image" src="https://github.com/user-attachments/assets/27cd0847-289b-4883-a363-e47ab0106a2f" />
 
Hasil Running
<img width="549" height="904" alt="image" src="https://github.com/user-attachments/assets/d2a58a25-65bc-4d73-bd19-64767ef5afbf" />
<img width="799" height="875" alt="image" src="https://github.com/user-attachments/assets/7b6e8581-72cb-46f2-a8d6-5335e7e87a2e" />

# Petanyaan 

1.	Perhatikan perulangan di dalam bubbleSort() di bawah ini:

<img width="531" height="77" alt="image" src="https://github.com/user-attachments/assets/d32f81f3-bf87-46eb-9e91-2ea9edbfecfc" />


a. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
b. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?

Jawab 
a.	Karena perulangan i merepresentasikan jumlah tahap (pass) pada Bubble Sort.
b.	Karena setiap selesai satu tahap ke-i, elemen di bagian akhir array sudah terurut dan tidak perlu dibandingkan lagi.
c.	Perulangan i berlangsung 49 kali, dan 49 tahap

2.	Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk! 

Jawab 
 
# 5.3.5 Mengurutkan Data Mahasiswa Berdasarkan IPK (Selection Sort)

Program 
<img width="975" height="1106" alt="image" src="https://github.com/user-attachments/assets/1af372e6-f577-499f-b9cd-a9282c486233" />
<img width="944" height="639" alt="image" src="https://github.com/user-attachments/assets/f1933892-ab1a-4b27-93a8-229acf587ae8" />
<img width="975" height="1007" alt="image" src="https://github.com/user-attachments/assets/0aa522fa-c69b-474a-8842-ecf27e52b7d4" />
 
Hasil Running
 
<img width="708" height="1062" alt="image" src="https://github.com/user-attachments/assets/b51494d0-7fc6-4fff-81b1-eafc94c29092" />
<img width="820" height="903" alt="image" src="https://github.com/user-attachments/assets/b41f7ff3-884a-49db-9c82-646fbe433484" />


# Pertanyaan 

1.	Di dalam method selection sort, terdapat baris program seperti di bawah ini:

<img width="606" height="217" alt="image" src="https://github.com/user-attachments/assets/e30f26e8-1abe-44b4-ada1-735b78b59ee7" />


Untuk apakah proses tersebut, jelaskan!
Kode tersebut berfungsi untuk mencari indeks elemen dengan nilai IPK terkecil dari posisi i hingga akhir array. Setelah blok kode ini selesai, idxMin akan menyimpan indeks elemen dengan IPK terkecil yang kemudian akan ditukar dengan elemen pada posisi i.

# 5.4 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort

Program 
 
<img width="859" height="484" alt="image" src="https://github.com/user-attachments/assets/6b56ff27-5d81-46d7-9bec-2e726ad0a3e3" />
<img width="975" height="233" alt="image" src="https://github.com/user-attachments/assets/85a93eb2-7014-4cba-a2ba-858148c9237e" />

Hasil Running
 
<img width="742" height="1031" alt="image" src="https://github.com/user-attachments/assets/f3a77734-fcf6-4419-a587-4862cc398acb" />
<img width="837" height="897" alt="image" src="https://github.com/user-attachments/assets/2bfdae12-ef52-42c8-8297-d6cd187753d0" />

# Pertanyaan 

1.	Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.

Jawab 

<img width="684" height="378" alt="image" src="https://github.com/user-attachments/assets/8799caae-57b1-4050-ab3c-f6ef1564cac4" />


# 5.5 Latihan Prkatium 

Program 

<img width="975" height="646" alt="image" src="https://github.com/user-attachments/assets/856231fc-2c6f-4bab-b214-6ef5ae23fe70" />
<img width="879" height="1062" alt="image" src="https://github.com/user-attachments/assets/507a6a5d-3ccf-4c4f-9cbd-2be2d594084e" />
<img width="886" height="890" alt="image" src="https://github.com/user-attachments/assets/d67a89ec-6931-43a4-bba4-5f6f9c30ff14" />
<img width="975" height="1124" alt="image" src="https://github.com/user-attachments/assets/3e3d85a8-e8ae-4789-90df-a8447a2eeab3" />
<img width="975" height="1042" alt="image" src="https://github.com/user-attachments/assets/9518e654-96d3-4148-9c58-a7f794fdd1f1" />
 
Hasil Running 
 
<img width="701" height="1054" alt="image" src="https://github.com/user-attachments/assets/27137fdd-31f3-4af3-b7ba-c134acff1b3b" />
<img width="678" height="894" alt="image" src="https://github.com/user-attachments/assets/bebeaf3b-26d3-440a-941c-37ff5e346cbc" />
<img width="803" height="1012" alt="image" src="https://github.com/user-attachments/assets/a493300f-10bc-49e0-88fe-256f99dcac51" />
<img width="728" height="984" alt="image" src="https://github.com/user-attachments/assets/c953babf-e03f-4680-bc64-99263846089d" />

 
 
