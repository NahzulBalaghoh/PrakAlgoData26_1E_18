#  Laporan Praktikum Dasar Pemorgraman Jobsheet 9
Nama : Nahzul Balaghoh

NIM : 254107020156

Kelas : TI-1E

# 2.1 Percobaan 1: Mahasiswa Mengumpulkan Tugas
Program
<img width="614" height="505" alt="Screenshot 2026-05-02 024937" src="https://github.com/user-attachments/assets/ccdcb0e8-4da8-4705-a850-e9db3309349c" />
<img width="736" height="742" alt="Screenshot 2026-05-02 025733" src="https://github.com/user-attachments/assets/f96440af-1850-4b98-869d-73746143124a" />
<img width="790" height="593" alt="Screenshot 2026-05-02 025748" src="https://github.com/user-attachments/assets/5014f197-5c65-4ac2-ae6c-9a8eccf703ec" />
<img width="778" height="814" alt="Screenshot 2026-05-02 025802" src="https://github.com/user-attachments/assets/1b677b68-ccc7-4624-87f5-4d4b2b5f8471" />
<img width="771" height="439" alt="Screenshot 2026-05-02 025815" src="https://github.com/user-attachments/assets/000cb4ab-54c4-4354-8679-534453aac930" />


Hasil Running 
<img width="364" height="895" alt="Screenshot 2026-05-02 022823" src="https://github.com/user-attachments/assets/63f4cdb4-0a91-43f8-9d9f-6a2857be8a7b" />
<img width="263" height="923" alt="Screenshot 2026-05-02 022833" src="https://github.com/user-attachments/assets/dbe63f68-ef5d-4b77-b1b0-373b8ce66911" />


# Pertanyaan 

1.	Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?

Jawab : 

<img width="581" height="104" alt="Screenshot 2026-05-02 030322" src="https://github.com/user-attachments/assets/0885d62e-8526-40f0-b5e3-831b74c9de2c" />
<img width="334" height="748" alt="Screenshot 2026-05-02 030519" src="https://github.com/user-attachments/assets/eab75ea1-9b3b-4ccf-b973-0a4c40d30eb2" />
<img width="265" height="770" alt="Screenshot 2026-05-02 030527" src="https://github.com/user-attachments/assets/2fda0a05-0172-487d-b120-5291540b7094" />


2.	Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!

Jawab : dapat menampung 5 data tugas mahasiswa 

Kode :

<img width="613" height="32" alt="Screenshot 2026-05-02 030627" src="https://github.com/user-attachments/assets/a2827989-36ce-426b-aced-57db7f77902c" />

3.	Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya?

Jawab : diperlukan untuk memastikan masih ada ruang di dalam stack sebelum menambahkan data baru, kalau terhapus dampaknya ketika stack sudah penuh dan ingin menambah data lagi akan terjadi eror array index outofbounds

4.	Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!

Jawab : 

<img width="600" height="183" alt="Screenshot 2026-05-02 030743" src="https://github.com/user-attachments/assets/44952a62-c03b-43ac-bcb0-3ca5aa63942d" />
<img width="802" height="228" alt="Screenshot 2026-05-02 031222" src="https://github.com/user-attachments/assets/f49eaabc-098d-4497-8b59-45ccd8e0f9e1" />
<img width="429" height="166" alt="Screenshot 2026-05-02 031353" src="https://github.com/user-attachments/assets/617769dd-9633-488b-b838-27a693915078" />


5.	Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya!

Jawab : 

<img width="333" height="93" alt="Screenshot 2026-05-02 031615" src="https://github.com/user-attachments/assets/26a9bb40-c5eb-43e5-819d-70e9c0c5f2a7" />
<img width="797" height="223" alt="Screenshot 2026-05-02 032039" src="https://github.com/user-attachments/assets/28b3a2f0-1df0-4a7e-a5ac-f6228a225359" />
<img width="305" height="187" alt="Screenshot 2026-05-02 032150" src="https://github.com/user-attachments/assets/faaecf7e-37c0-48cd-acab-13119196a30e" />


# 2.2 Percobaan 2: Konversi Nilai Tugas ke Biner

Program 

<img width="601" height="316" alt="Screenshot 2026-05-02 035801" src="https://github.com/user-attachments/assets/064bf918-e8db-4e30-8629-914a20b7f8bc" />
<img width="459" height="816" alt="Screenshot 2026-05-02 035813" src="https://github.com/user-attachments/assets/72798a9d-8c97-43ec-9095-3085b6f7621a" />
<img width="579" height="48" alt="Screenshot 2026-05-02 035822" src="https://github.com/user-attachments/assets/41bcc0b4-1d75-4d30-abf4-bdc52611bb77" />


Hasil Running 

<img width="267" height="230" alt="Screenshot 2026-05-02 035702" src="https://github.com/user-attachments/assets/02c96b8b-2339-4da4-b484-503ee12fa496" />


# Pertanyaan
1.	Jelaskan alur kerja dari method konversiDesimalKeBiner!

Jawab : jadi ketika kita memilih menu 2 dan menginputkan nilai, program akan mengambil sisa pembagaian (modulus) lalu disimpan ke stack lalu bgai nilai menjadi 2,  lalu karena stack bersifat LIFO jadi yang di pop pertama adalah yang terakhir masuk sehingga hasilnya 1010111

2.	Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya!

Jawab : hasilnya sama persis, karena untuk bilangan positif kondisi nilai > 0 dan nilai != 0 hasilnya sama aja berhenti ketika mencapai 0 

# 2.4 Latihan Praktikum

Program 

<img width="785" height="387" alt="Screenshot 2026-05-02 042938" src="https://github.com/user-attachments/assets/3209ed76-3ffa-438f-bc10-910833f89529" />
<img width="695" height="743" alt="Screenshot 2026-05-02 042955" src="https://github.com/user-attachments/assets/4ece87e9-d742-4103-beb2-dbbfc78a43b3" />
<img width="776" height="813" alt="Screenshot 2026-05-02 043013" src="https://github.com/user-attachments/assets/e37c692c-8352-4c8c-8262-0b9eeb646d4d" />
<img width="779" height="736" alt="Screenshot 2026-05-02 043050" src="https://github.com/user-attachments/assets/ff899ad5-1014-47cd-bda7-df3a0cc25ea5" />
<img width="783" height="783" alt="Screenshot 2026-05-02 043105" src="https://github.com/user-attachments/assets/861a3ecb-84f8-415e-bd41-80c63772ac37" />


Hasil Running 

<img width="280" height="676" alt="image" src="https://github.com/user-attachments/assets/d4ee25ff-5504-4d97-b9be-4752727d06ba" />
<img width="264" height="776" alt="image" src="https://github.com/user-attachments/assets/c3fad272-5176-4259-be6a-ab076a1728af" />

