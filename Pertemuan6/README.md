# LAPORAN PRAKTIKUM PBO

## Identitas

| Data              | Keterangan                     |
| ----------------- | ------------------------------ |
| Nama              | Satria Mahardika               |
| NPM               | 4525210068                     |
| Kelas             | A                              |
| Program Studi     | Teknik Informatika             |
| Mata Kuliah       | Pemrograman Berorientasi Objek |
| Materi Praktikum  | Abstract, Class Interface, Enum|

---

## 1. Program Java

### 1.1 File `Main.java`

> File `Main.java` berfungsi sebagai kelas utama (*driver class*) yang menjalankan program Java untuk menguji implementasi kelas abstrak, penerapan *interface* ganda (`Movable` dan `Fuelable`), serta penggunaan tipe data `Enum` (`TipeBahanBakar`) pada objek kendaraan.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan6/img/before/MainJava.png)

* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan6/img/after/MainJava.png)

* **Output setelah pengerjaan:**

![Output Java](/Pertemuan6/img/after/OutputJava.png)

### 1.2 File `Fuelable.java`

> File `Fuelable.java` adalah sebuah antarmuka (*interface*) yang mendefinisikan kontrak method terkait pengelolaan bahan bakar untuk memastikan kelas yang mengimplementasikannya memiliki fungsi pengisian bahan bakar.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan6/img/before/FuelableJava.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan6/img/after/FuelableJava.png)

### 1.3 File `Kendaraan.java`

> File `Kendaraan.java` bertindak sebagai kelas abstrak (*abstract class*) induk yang menetapkan kerangka dasar dan method abstrak yang wajib diimplementasikan oleh kelas-kelas suburnya.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan6/img/before/KendaraanJava.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan6/img/after/KendaraanJava.png)

### 1.4 File `Mobil.java`

> File `Mobil.java` merupakan kelas konkret turunan dari `Kendaraan` yang mengimplementasikan *interface* `Movable` dan `Fuelable`, serta mendefinisikan secara spesifik perilaku dan atribut mobil.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan6/img/before/MobilJava.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan6/img/after/MobilJava.png)

### 1.5 File `Movable.java`

> File `Movable.java` adalah *interface* pendukung yang menetapkan kontrak perilaku bergerak bagi objek kendaraan yang menerapkannya.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan6/img/before/MovableJava.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan6/img/after/MovableJava.png)

### 1.6 File `TipeBahanBakar.java`

> File `TipeBahanBakar.java` mendefinisikan tipe enumerasi (*Enum*) untuk mengelompokkan konstanta pilihan jenis bahan bakar kendaraan secara aman dan terstruktur.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan6/img/before/TipeBahanBakarJava.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan6/img/after/TipeBahanBakarJava.png)


---

## 2. Program PHP

### 2.1 File `Main.php`

> File `Main.php` berfungsi sebagai skrip penggerak utama pada PHP untuk mengeksekusi dan menguji struktur abstraksi program serta menampilkan hasilnya ke layar.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal PHP](/Pertemuan6/img/before/MainPHP.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir PHP](/Pertemuan6/img/after/MainPHP.png)

**Output setelah pengerjaan:**

![Output PHP](/Pertemuan6/img/after/OutputPHP.png)

### 2.2 File `abstraksi.php`

> File `abstraksi.php` merangkum implementasi kelas abstrak dan antarmuka (*interface*) versi PHP untuk membangun cetak biru objek dengan tingkat fleksibilitas yang tinggi.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal PHP](/Pertemuan6/img/before/AbstraksiPHP.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir PHP](/Pertemuan6/img/after/AbstraksiPHP.png)


---

## Kesimpulan

> Praktikum ini memperluas pemahaman tentang penerapan **Abstract Class** dan **Interface** untuk menyusun kontrak arsitektur program yang konsisten, serta penggunaan **Enum** guna mengelola data konstanta yang terbatas secara lebih aman. Seluruh konsep lanjutan ini terbukti dapat diterapkan dengan baik baik dalam lingkungan pemrograman berorientasi objek berbasis kompilasi seperti **Java** maupun penafsiran skrip seperti **PHP**.