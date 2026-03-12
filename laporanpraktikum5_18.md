# Laporan Praktikum Dasar Pemrograan Jobsheet 5
Nama : Nahzul Balaghoh

NIM : 254107020156

Kelas : TI-1E

# 5.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

program 

<img width="564" height="649" alt="Screenshot 2026-03-12 014936" src="https://github.com/user-attachments/assets/2d2e5d8b-8be3-4214-ba7f-fbc715f3d6fe" />

hasil run

<img width="308" height="69" alt="Screenshot 2026-03-12 014917" src="https://github.com/user-attachments/assets/f690bace-e2e1-4d15-a35f-593386080675" />


# pertanyaan 

1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!

  jawab : bagian if adalah sebagai base case, dimana kalau n = 1 maka fungsi akan langsung mereturn 1, sedangkan bagian else adalah fungsi rekrusif dimana kalau n belum = 1 maka fungsi akan memanggil dirinya sendiri dengan nilai n-1 hingga menyentuh base case

2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!

  jawab : bisa 

<img width="281" height="200" alt="Screenshot 2026-03-12 020119" src="https://github.com/user-attachments/assets/24028dbb-1181-439d-9f54-01f479a9cce2" />


3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !

  jawab : fakto *= i merupakan proses iteratif dihitung dari i = 1 sampai i = n, yang ada di method BF sedangkan int fakto = n * faktorialDC(n-1) merupakan proses rekursif dimana setiap pemanggilan fungsi menunggu return value dari pemanggilan berikutnya dulu sebelum bisa di hitung, yang ada di method DC

4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!

  jawab : faktorialBF menggunakan proses iteratif sehingga lebih efisien karena menggunakan lebih sedikit memori dan cocok untuk data yang kecil, faktorialDC menggunakan proses rekursif dimana memecah masalahbesar menjadi masalah kecil lalu hasilnya digabung saat mereturn ke atas namun menghabiskan lebih banyak memori karena terjadi pemanggilan fungsi berkali kali


# 5.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer

program 

<img width="520" height="606" alt="Screenshot 2026-03-12 024404" src="https://github.com/user-attachments/assets/b0e50829-3b25-405b-83fe-5e724865638e" />

<img width="582" height="616" alt="Screenshot 2026-03-12 024421" src="https://github.com/user-attachments/assets/f5960a02-01db-40fa-a85b-d8851627cd41" />

hasil run

<img width="309" height="287" alt="Screenshot 2026-03-12 024350" src="https://github.com/user-attachments/assets/26574479-9d8e-4279-a22a-2a22516381c0" />


# pertanyaan 

1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!

  jawab : pangkatBF menggunakan proses iteratif dimana  a akan langsung dikalikan sebanyak n kali menggunakan loop satu persatu sedangkan pangkatDC  menggunakan proses rekursif dimana cara kerjanya adalah memecah masalah menjadi kecil kecil dengan membagi pangkat menjadi n/2, lalu dikalikan kembali

2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!

  jawab : ya 

<img width="413" height="107" alt="Screenshot 2026-03-12 030033" src="https://github.com/user-attachments/assets/9cb3f039-3244-4690-813a-24993c889bd1" />

3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter?

  jawab : kurang relevan karena class pangkat sudah punya atribut nilai dan pangkat yang menyimpan data yang sama, bisa, 

<img width="328" height="145" alt="Screenshot 2026-03-12 035616" src="https://github.com/user-attachments/assets/293cdabd-5fe0-4f50-826b-9b0408b3b66c" />


4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!

  jawab : cara kerja pangkatBF() adalah dengan mengakalikan a dengan dirinya sendiri sebanyak n kali menggunakan loop, sehingga semakin besar n maka semakin lama prosesnya. Sedangkan pangkatDC() adalah dengan memecah pangkat menjadi setengahnya (n/2) disetiap rekursi, lalu menggabungkan hasilnya dengan perkalian, sehingga jauh lebih efisien untuk nilai n yang besar 

# 5.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer

program 

<img width="457" height="575" alt="Screenshot 2026-03-12 043734" src="https://github.com/user-attachments/assets/918ab02e-361a-4bf2-8d1b-266cec535a7f" />

<img width="579" height="435" alt="Screenshot 2026-03-12 043747" src="https://github.com/user-attachments/assets/1c576fdb-4724-409e-8295-1d951bea3600" />

hasil run

<img width="448" height="177" alt="Screenshot 2026-03-12 043811" src="https://github.com/user-attachments/assets/4d7b9801-bffc-45fe-8ba5-137aea15e6a0" />


# pertanyaan 

1. Kenapa dibutuhkan variable mid pada method TotalDC()?

  jawab : karena mid adalah titik tengah array yang digunakan untuk membelah array menjadi 2 bagian di setiap rekursi
   
2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?

<img width="352" height="60" alt="image" src="https://github.com/user-attachments/assets/e070b68c-1444-4bb1-921d-918ac4ab871b" />

  jawab : lsum digunakan untuk menjumlahkan semua elemen di bagian kiri dari index l sampai mid, sedangkan rsum digunakan untuk menjumlahkan semua elemen di bagian kanan dari index  mid+1 sampai r

3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?

<img width="172" height="31" alt="image" src="https://github.com/user-attachments/assets/9606f6eb-2c4f-460a-8129-629f158cf6dc" />

  jawab : karena return lsum + rsum merupakan tahap combine atau menggabungkan hasil dari bagian kiri dan kanan yang sudah dihitung

4. Apakah base case dari totalDC()?

  jawab :  base casenya adalah ketika l == r

5. Tarik Kesimpulan tentang cara kerja totalDC()

  jawab : cara kerja totalDC() adalah dengan menggunakan 3 tahap Devide & Counquer, dimana tahap pertama adalah tahap devide yakni membelah hingga tersisa 1 elemen, lalu tahap selanjutnya adalah conquer yakni mengembalikan nilai masing masing elemen ketika menyentuk base case, dan tahap terakhir adalah combine yakni menggabungkan hasil dari bawah ke atas hingga mendapatkan total keseluruhan

# 4.5 Latihan Praktikum

program 

<img width="725" height="879" alt="image" src="https://github.com/user-attachments/assets/c8901c18-727d-478f-8b5c-163a457036ed" />

<img width="774" height="600" alt="image" src="https://github.com/user-attachments/assets/5197085f-cc7e-4a4c-844c-6c0e91f68053" />

hasil run

<img width="503" height="252" alt="image" src="https://github.com/user-attachments/assets/4b0342d2-d418-4986-adb0-a5feec36fefc" />





