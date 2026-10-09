# LAPORAN PRAKTIKUM PBO

## Identitas

| Data              | Keterangan                     |
| ----------------- | ------------------------------ |
| Nama              | Satria Mahardika               |
| NPM               | 4525210068                     |
| Kelas             | A                              |
| Program Studi     | Teknik Informatika             |
| Mata Kuliah       | Pemrograman Berorientasi Objek |
| Materi Praktikum  | Construktor, Anggota Statis, dan Konstanta |

---

## 1. Program Java

### 1.1 File `Main.java`

> File `Main.java` berfungsi sebagai kelas utama (*driver class*) yang mengeksekusi program berbasis Java. Di dalam file ini, objek dari kelas `RekeningBank` diinisialisasi dengan menggunakan *constructor*, serta memanggil berbagai method untuk menguji fungsionalitas transaksi (seperti setor tunai, tarik tunai, dan pengecekan saldo) serta mengakses anggota statis maupun konstanta.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan3/img/before/MainJava.png)

* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan3/img/after/MainJava.png)

* **Output setelah pengerjaan:**

![Output Java](/Pertemuan3/img/after/OutputJava.png)

### 1.2 File `RekeningBank.java`

> File `RekeningBank.java` bertindak sebagai cetak biru (*blueprint*) kelas yang menerapkan penggunaan *constructor* untuk mengisi nilai awal objek saat pertama kali dibuat. Selain itu, kelas ini juga mengimplementasikan variabel/anggota statis (*static member*) untuk melacak data yang bersifat bersama antar-objek serta penggunaan konstanta (*final*) untuk nilai yang tidak boleh diubah.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan3/img/before/RekeningBankJava.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan3/img/after/RekeningBankJava.png)


---

## 2. Program PHP

### 2.1 File `Main.php`

> File `Main.php` berperan sebagai skrip utama (*driver script*) untuk menjalankan program pengujian rekening bank di sisi PHP. Skrip ini memuat kelas terkait, membuat instance objek menggunakan *constructor*, dan menampilkan hasil pemrosesan data serta status rekening ke layar.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal PHP](/Pertemuan3/img/before/MainPHP.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir PHP](/Pertemuan3/img/after/MainPHP.png)

* **Output setelah pengerjaan:**

![Output PHP](/Pertemuan3/img/after/OutputPHP.png)

### 2.2 File `RekeningBank.php`

> File `RekeningBank.php` mendefinisikan struktur kelas dalam PHP yang menerapkan konsep *constructor* (melalui method khusus `__construct`), properti dan method statis (*static*), serta konstanta kelas (*const*). Hal ini berguna untuk mengelola aturan transaksi dan informasi rekening secara terstruktur dalam paradigma pemrograman berorientasi objek berbasis PHP.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal PHP](/Pertemuan3/img/before/RekeningBankPHP.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir PHP](/Pertemuan3/img/after/RekeningBankPHP.png)


---

## Kesimpulan

> Praktikum ini memperkuat pemahaman mengenai penggunaan *Constructor* untuk inisialisasi objek secara otomatis, penerapan Anggota Statis (*static members*) yang nilainya dibagikan di tingkat kelas, serta penggunaan Konstanta untuk menjaga nilai tetap tidak berubah. Melalui perbandingan implementasi pada bahasa **Java** dan **PHP**, terlihat bahwa konsep pengelolaan status objek, variabel bersama, dan aturan pembatasan nilai ini dapat diterapkan dengan baik pada kedua bahasa meskipun menggunakan penulisan sintaksis yang berbeda.