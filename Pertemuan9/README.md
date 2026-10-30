# LAPORAN PRAKTIKUM PBO

## Identitas

| Data              | Keterangan                     |
| ----------------- | ------------------------------ |
| Nama              | Satria Mahardika               |
| NPM               | 4525210068                     |
| Kelas             | A                              |
| Program Studi     | Teknik Informatika             |
| Mata Kuliah       | Pemrograman Berorientasi Objek |
| Materi Praktikum  | Package, Namespace, dan Build Tool |

---

## 1. Program Java

### 1.1 File `App.java` / `Main.java`

> File `App.java` (atau `Main.java`) berfungsi sebagai kelas utama (*driver class*) yang menjalankan program Java untuk menguji implementasi relasi antar objek, penerapan struktur data, serta penggunaan layanan perpustakaan.

### Bukti Pengerjaan

- **Before / Kondisi awal:**

![Kondisi awal Java](img/before/App.java.png)

- **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](img/after/App.java.png)

- **Output setelah pengerjaan:**

![Output Java](img/after/OutputJava.png)

---

### 1.2 File `Anggota.java`

> File `Anggota.java` bertindak sebagai kelas entitas yang mendefinisikan atribut serta informasi terkait anggota perpustakaan.

### Bukti Pengerjaan

- **Before / Kondisi awal:**

![Kondisi awal Java](img/before/Anggota.java.png)

- **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](img/after/Anggota.java.png)

---

### 1.3 File `Buku.java`

> File `Buku.java` adalah kelas entitas yang mendefinisikan kontrak method dan atribut terkait pengelolaan data buku serta memastikan keterhubungan antar objek dalam sistem.

### Bukti Pengerjaan

- **Before / Kondisi awal:**

![Kondisi awal Java](img/before/Buku.java.png)

- **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](img/after/Buku.java.png)

---

### 1.4 File `Peminjaman.java`

> File `Peminjaman.java` merepresentasikan transaksi peminjaman buku oleh anggota dengan mencatat relasi antara anggota, buku, dan durasi peminjaman.

### Bukti Pengerjaan

- **Before / Kondisi awal:**

![Kondisi awal Java](img/before/Peminjaman.java.png)

- **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](img/after/Peminjaman.java.png)

---

### 1.5 File `PerpustakaanService.java`

> File `PerpustakaanService.java` merupakan kelas layanan yang mengimplementasikan logika bisnis sistem perpustakaan serta mengelola koleksi data peminjaman dan operasi perpustakaan.

### Bukti Pengerjaan

- **Before / Kondisi awal:**

![Kondisi awal Java](img/before/PerpustakaanService.java.png)

- **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](img/after/PerpustakaanService.java.png)

---

### 1.6 File `Format.java`

> File `Format.java` pada paket utilitas berfungsi untuk membantu penformatan output teks atau tanggal agar tampilan informasi konsisten.

### Bukti Pengerjaan

- **Before / Kondisi awal:**

![Kondisi awal Java](img/before/Format.java.png)

- **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](img/after/Format.java.png)

---

## 2. Program PHP

### 2.1 File `Main.php` / `main.php`

> File `main.php` berfungsi sebagai skrip penggerak utama pada PHP untuk mengeksekusi dan menguji struktur relasi program serta menampilkan hasilnya ke layar.

### Bukti Pengerjaan

- **After / Kondisi setelah pengerjaan:**

![Kondisi akhir PHP](img/after/main.php.png)

- **Output setelah pengerjaan:**

![Output PHP](img/after/OutputPhp.png)

---

### 2.2 File `Anggota.php`

> File `Anggota.php` mendefinisikan struktur kelas entitas anggota perpustakaan pada versi PHP.

### Bukti Pengerjaan

- **After / Kondisi setelah pengerjaan:**

![Kondisi akhir PHP](img/after/Anggota.php.png)

---

### 2.3 File `Buku.php`

> File `Buku.php` mendefinisikan atribut dan metode pengelolaan buku pada versi PHP.

### Bukti Pengerjaan

- **After / Kondisi setelah pengerjaan:**

![Kondisi akhir PHP](img/after/Buku.php.png)

---

### 2.4 File `Peminjaman.php`

> File `Peminjaman.php` mengelola relasi objek antara anggota dan buku pada transaksi peminjaman versi PHP.

### Bukti Pengerjaan

- **After / Kondisi setelah pengerjaan:**

![Kondisi akhir PHP](img/after/Peminjaman.php.png)

---

### 2.5 File `PerpustakaanService.php`

> File `PerpustakaanService.php` menangani logika layanan transaksi dan manajemen koleksi sistem perpustakaan pada skrip PHP.

### Bukti Pengerjaan

- **After / Kondisi setelah pengerjaan:**

![Kondisi akhir PHP](img/after/PerpustakaanService.php.png)

---

### 2.6 File `Format.php` / `Bab.php`

> File `Format.php` dan `Bab.php` merangkum kelas utilitas serta struktur pendukung pemodelan relasi objek versi PHP berdasarkan rancangan UML Class Diagram.

### Bukti Pengerjaan

- **After / Kondisi setelah pengerjaan Format.php:**

![Kondisi akhir PHP](img/after/Format.php.png)

- **After / Kondisi setelah pengerjaan Bab.php:**

![Kondisi akhir PHP](img/after/Bab.php.png)

---

## Kesimpulan

> Pada praktikum ini proyek Sistem Perpustakaan direstrukturisasi menjadi proyek Maven (Java) dan Composer (PHP). Pada Java, baris package di setiap berkas harus sama persis dengan jalur foldernya (src/main/java/id/ac/univpancasila/perpustakaan/...), dan kelas antar-package dipakai melalui import. Pada PHP, namespace Perpustakaan\ dipetakan ke folder src/ oleh autoload PSR-4, sehingga seluruh require_once manual cukup digantikan satu baris vendor/autoload.php.