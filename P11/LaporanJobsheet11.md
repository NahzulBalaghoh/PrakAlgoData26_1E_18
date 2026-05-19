#  Laporan Praktikum Dasar Pemorgraman Jobsheet 11
Nama : Nahzul Balaghoh

NIM : 254107020156

Kelas : TI-1E

#  2.1 Pembuatan Single Linked List 

Program 
<img width="686" height="490" alt="Screenshot 2026-05-17 213711" src="https://github.com/user-attachments/assets/f290e522-d177-4b72-9eea-afdb5f766f53" />
<img width="658" height="231" alt="Screenshot 2026-05-17 213719" src="https://github.com/user-attachments/assets/8b98e6d3-8c05-41d8-bfc9-fc3792eb85ec" />
<img width="548" height="752" alt="Screenshot 2026-05-17 213732" src="https://github.com/user-attachments/assets/17970b87-6c32-43e6-b8d7-ff00e5ba1909" />
<img width="551" height="572" alt="Screenshot 2026-05-17 213745" src="https://github.com/user-attachments/assets/75f47f50-ff5c-44ae-9daf-9b2476d38073" />
<img width="726" height="350" alt="Screenshot 2026-05-17 213755" src="https://github.com/user-attachments/assets/ec9af467-26fb-4cac-a7fa-2824b1e3f96c" />


Hasil running 
<img width="649" height="249" alt="Screenshot 2026-05-19 195137" src="https://github.com/user-attachments/assets/e316e528-39a5-4685-b96d-19797059f9b0" />


# Pertanyaan 
1.	Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?

Jawab: karena sll.print() dipanggil sebelum data apapun ditambahkan ke linked list

2.	Jelaskan kegunaan variable temp secara umum pada setiap method!

Jawab: variable tmp adalah pointer sementara yang digunakan untuk menelusuri node – node dalam linked list tanpa mengubah posisi head atau tail

3.	Lakukan modifikasi agar data dapat ditambahkan dari keyboard!

Jawab: <img width="610" height="677" alt="Screenshot 2026-05-17 232216" src="https://github.com/user-attachments/assets/2649897a-ffba-403c-a787-aae52c0e500d" />


# 2.2. Modifikasi Elemen pada Single Linked List

Program

<img width="663" height="787" alt="Screenshot 2026-05-18 000917" src="https://github.com/user-attachments/assets/103e491e-f2c2-448d-a33e-cd5df6312f3b" />
<img width="630" height="631" alt="Screenshot 2026-05-18 000927" src="https://github.com/user-attachments/assets/e4b129e3-27e0-4672-a467-3e3218a88747" />
<img width="820" height="612" alt="Screenshot 2026-05-18 000943" src="https://github.com/user-attachments/assets/db1c78f4-9cd9-4c7d-87a1-bf617da7121b" />


Hasil running 
<img width="511" height="197" alt="Screenshot 2026-05-19 195228" src="https://github.com/user-attachments/assets/d0350ce4-bb39-4ce8-a176-553daa9351b2" />


# Pertanyaan 

1.	Mengapa digunakan keyword break pada fungsi remove? Jelaskan!

Jawab:  keyword break digunakan untuk menghentikan perulangan while segera setelah node yang dicari ditemukan dan dihapus 

2.	Jelaskan kegunaan kode dibawah pada method remove

<img width="480" height="268" alt="Screenshot 2026-05-18 004015" src="https://github.com/user-attachments/assets/019bca3c-3a25-4757-a1f8-c69143407a80" />


Jawab: gunanya adalah untuk memotong node target dari rantai node sebelumnya langsung menunjuk ke node setelahnya node yang dihapus  lalu mengechek apakah node yang dihapus adalah node terakhir, jika iya update tail ke node sebelumnya karena node terakhir sudah dihapus 

# Tugas 

Program 

<img width="632" height="464" alt="Screenshot 2026-05-18 003830" src="https://github.com/user-attachments/assets/befb1ade-915b-4aea-99c4-91f4eaeb6b69" />
<img width="541" height="240" alt="Screenshot 2026-05-18 003837" src="https://github.com/user-attachments/assets/6f74172f-4795-4223-ba73-57ce2e61dcbe" />
<img width="616" height="781" alt="Screenshot 2026-05-18 003847" src="https://github.com/user-attachments/assets/a092f861-9122-4a51-9535-2cb4c5233810" />
<img width="622" height="771" alt="Screenshot 2026-05-18 003857" src="https://github.com/user-attachments/assets/e6eea81e-84eb-483c-a56f-ba832ea2850c" />
<img width="609" height="929" alt="Screenshot 2026-05-19 200007" src="https://github.com/user-attachments/assets/b82f4ca8-5af9-4d67-a39a-abef45ead5bd" />
<img width="587" height="681" alt="Screenshot 2026-05-18 003926" src="https://github.com/user-attachments/assets/1466e91e-01f1-4cb4-be9e-05846cfb0a8b" />


Hasil running 

<img width="311" height="869" alt="Screenshot 2026-05-18 003746" src="https://github.com/user-attachments/assets/0b3b9c8b-d3cb-4383-ac42-641589afbffb" />

<img width="346" height="963" alt="Screenshot 2026-05-18 003801" src="https://github.com/user-attachments/assets/cb489a29-4218-4b0b-8ee1-f13680c24f31" />

<img width="333" height="950" alt="Screenshot 2026-05-18 003816" src="https://github.com/user-attachments/assets/f6c9c913-cdf9-492f-a560-a30abfc3a3b3" />
