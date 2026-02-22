# Laporan Praktikum Dasar Pemorgraman Jobsheet 1
Nama : Nahzul Balaghoh

NIM : 254107020156

Kelas : TI-1E
# 2.1 Percobaan 1: Deklarasi Class, Atribut dan Method
Program
![img](https://github.com/user-attachments/assets/9b4d61ce-ec10-45bc-8805-fc2ed3e609e5)

Hasil Running 
![img](https://github.com/user-attachments/assets/1b36ff74-33f8-4e60-b4a9-26817d3e472f)


# Pertanyaan 
1. Sebutkan dua karakteristik class atau object!
   
   jawab : Memiliki atribut dan method 
2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!

   jawab : memiliki 4 atribut yakni nama, nim, kelas, ipk
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
   
   jawab : ada 4 method yakni tampilkaninformasi(), ubahKelas(String kelasBaru), updateIPK(double ipkBaru), nilaiKinerja()
4. Program
   ![img](https://github.com/user-attachments/assets/fb6819ae-b37e-4a7d-873d-496fdd71aea0)

5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa, kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
   
   jawab : cara kerjanya adalah dengan mengecek nilai ipk mahasiswa satu persatu dari atas ke bawah jika ipk >= 3.5 maka method nilaiKinerja() mengembalikan nilai bertipe string berupa keterangan "Kinerja sangat baik", jika ipk >= 3.0 maka mengembalikan keterangan "Kinerja baik", jika >=2.0 maka mengembalikan keterangan "kinerja cukup", jika dibawah 2.0 maka mengembalikan keterangan "Kinerja Kurang"

# 2.2 Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method
Program 
![img](https://github.com/user-attachments/assets/6db5de0c-aa9b-492b-a328-39afef779cb7)

Hasil Running
![img](https://github.com/user-attachments/assets/bf7df4ce-36d5-411e-ae48-19e3e887bab3)


# Pertanyaan
1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
   Program
   
   ![img](https://github.com/user-attachments/assets/74035063-ad82-4615-be76-3bce3801a6ea)

   jawab : mhs1

3. Bagaimana cara mengakses atribut dan method dari suatu objek?
   
   jawab : namaObject.namaAtribut , namaObject.namaMethod() 
   
4. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?
   
   jawab: output berubah karena sebelum memanggil tampilInformasi() yang kedua ada dua data mahasiswa yang diubah terlebih dahulu yakni kelas diubah dari "SI 2J" menjadi "SI 2K" menggunakan method ubahKelas() dan ipk diubah daro 3.55 menjadi 3,60 menggunakan method updateIpk() sehingga yang ditampilkan adalah data yang terbaru

# 2.3 Percobaan 3: Membuat Konstruktor
Program 
![img](https://github.com/user-attachments/assets/bb175b7f-6f27-4335-93aa-bfba61183bdb)

![img](https://github.com/user-attachments/assets/6b75803a-1746-48ed-a035-ca32bfaf8fb5)

Hasil Running

![img](https://github.com/user-attachments/assets/468e2c49-98f9-48bf-a72e-661efd5e32f3)


# Pertanyaan 
1. Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!

   jawab:
   ![img](https://github.com/user-attachments/assets/75e929a3-34a7-4d42-8809-a17fcad2458f)


2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut?
   ![img](https://github.com/user-attachments/assets/56f4329f-ed28-4db7-bf7e-40959fe5e3d4)

   jawab : program tersebut melakukan instansiasi bernama mhs2 dan memanggil konstuktor berprameter sekaligus menginisialisasi nilai atribut dari object mhs2
3. Program
   ![img](https://github.com/user-attachments/assets/e9929add-c641-4c03-8d3b-93d152fc3e60)

   Hasil Running
   ![img](https://github.com/user-attachments/assets/23e38c4a-ef75-4f68-8acb-b33068217d30)


4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya!

   jawab : tidak harus, method bisa dipanggil kapan saja dan dalam urutan apapaun kecuali jika hasil dari satu method mempengaruhi method lainnya maka urutan pemanggilannya harus diperhatikan 
   
5. Program 
   ![img](https://github.com/user-attachments/assets/27d71ff6-14e9-411f-b832-66c65bde3529)

   Hasil Running
   
   ![img](https://github.com/user-attachments/assets/b76e4870-d502-4767-a2bf-acd1d77df009)

# 2.4 Latihan Praktikum

## Tugas 1 
   Program 
   ![img](https://github.com/user-attachments/assets/9711a692-6ab5-43a2-9231-3f9bb500bef6)
   ![img](https://github.com/user-attachments/assets/43879beb-6669-4a6a-b2d2-92ce7d04904e)

   Hasil Running
   
   ![img](https://github.com/user-attachments/assets/0aa91e73-ef5e-4c98-9383-25610e26a7ee)

## Tugas 2

   Program 
   ![img](https://github.com/user-attachments/assets/327efcb5-2ef9-47dc-b5a0-66fb0ce72e8d)
   ![img](https://github.com/user-attachments/assets/972d3789-03b9-41ce-aa16-5280220a0f1d)

   Hasil Running

   ![img](https://github.com/user-attachments/assets/952107bf-21cd-4dba-a918-32ddd0f25b9e)






