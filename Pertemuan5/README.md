# LAPORAN PRAKTIKUM PBO

## Identitas

| Data              | Keterangan                     |
| ----------------- | ------------------------------ |
| Nama              | Satria Mahardika               |
| NPM               | 4525210068                     |
| Kelas             | A                              |
| Program Studi     | Teknik Informatika             |
| Mata Kuliah       | Pemrograman Berorientasi Objek |
| Materi Praktikum  | Polimorfisme             |

---

## 1. Program Java

### 1.1 File `Main.java`

> File `Main.java` berfungsi sebagai kelas utama (*driver class*) yang menjalankan program Java untuk menguji penerapan konsep polimorfisme serta memanggil objek dari berbagai bentuk turunan kelas bangun datar.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan5/img/before/MainJava.png)

* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan5/img/after/MainJava.png)

* **Output setelah pengerjaan:**

![Output Java](/Pertemuan5/img/after/OutputJava.png)

### 1.2 File `AntiPattern.java`

> File `AntiPattern.java` berisi contoh identifikasi struktur kode yang kurang ideal atau melanggar prinsip *best practice* dalam pemrograman, yang kemudian dianalisis untuk diperbaiki.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan4/img/before/AntiPatternJava.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan4/img/after/AntiPatternJava.png)

### 1.3 File `BangunDatar.java`

> File `BangunDatar.java` bertindak sebagai kelas induk abstrak yang mendefinisikan kerangka method umum (seperti perhitungan luas atau keliling) untuk diimplementasikan secara polimorfik oleh kelas-kelas turunannya.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan4/img/before/BangunDatarJava.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan4/img/after/BangunDatarJava.png)

### 1.4 File `Lingkaran.java`

> File `Lingkaran.java` merupakan subkelas turunan dari `BangunDatar` yang mengimplementasikan method khusus secara spesifik untuk menghitung luas dan keliling lingkaran (*method overriding*).

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan4/img/before/LingkaranJava.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan4/img/after/LingkaranJava.png)

### 1.5 File `Persegi.java`

> File `Persegi.java` adalah kelas turunan dari `BangunDatar` yang menerapkan logika spesifik perhitungan geometri persegi melalui pemanfaatan prinsip polimorfisme.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan4/img/before/PersegiJava.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan4/img/after/PersegiJava.png)

---

## 2. Program PHP

### 2.1 File `Main.php`

> File `Main.php` berfungsi sebagai skrip eksekusi utama pada PHP untuk menguji dan menampilkan hasil pemanggilan objek polimorfik serta modul program.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal PHP](/Pertemuan5/img/before/MainPHP.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir PHP](/Pertemuan5/img/after/MainPHP.png)

**Output setelah pengerjaan:**

![Output PHP](/Pertemuan5/img/after/OutputPHP.png)

### 2.2 File `BangunDatar.php`

> File `BangunDatar.php` mendefinisikan kelas induk berbasis PHP yang merangkum atribut dan method dasar geometri untuk mendukung fleksibilitas pemanggilan objek.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal PHP](/Pertemuan5/img/before/BangunDatarPHP.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir PHP](/Pertemuan5/img/after/BangunDatarPHP.png)

### 2.3 File `notifikasi.php`

> File `notifikasi.php` menangani implementasi sistem pengiriman pesan atau pemberitahuan dengan pendekatan berorientasi objek dalam ekosistem PHP.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal PHP](/Pertemuan5/img/before/NotifikasiPHP.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir PHP](/Pertemuan5/img/after/NotifikasiPHP.png)


---

## Kesimpulan

> Praktikum ini memperdalam pemahaman mengenai konsep **Polimorfisme** (kemampuan suatu objek untuk mengambil berbagai bentuk melalui *method overriding* dan *interface/inheritance*) serta pentingnya mengenali serta memperbaiki *anti-pattern* guna menjaga kualitas kode agar lebih bersih dan mudah dikelola. Penerapan konsep ini terbukti konsisten baik saat diimplementasikan menggunakan bahasa pemograman terkompilasi seperti **Java** maupun bahasa penafsiran seperti **PHP**.