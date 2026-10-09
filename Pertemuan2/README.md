# LAPORAN PRAKTIKUM PBO

## Identitas

| Data              | Keterangan                     |
| ----------------- | ------------------------------ |
| Nama              | Satria Mahardika               |
| NPM               | 4525210068                     |
| Kelas             | A                              |
| Program Studi     | Teknik Informatika             |
| Mata Kuliah       | Pemrograman Berorientasi Objek |
| Materi Praktikum  | Class, Object and Encapsulation|

---

## 1. Program Java

### 1.1 File `Main.java`

> File `Main.java` berfungsi sebagai kelas penggerak (*driver class*) yang memiliki method `main`. Di dalam kelas ini, objek dari kelas `Mahasiswa` diinstansiasi, diberikan nilai atribut (melalui constructor atau method setter), dan kemudian dipanggil method-nya untuk menampilkan informasi data mahasiswa ke konsol.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan2/img/before/MainJava.png)

* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan2/img/after/MainJava.png)

* **Output setelah pengerjaan:**

![Output Java](/Pertemuan2/img/after/OutputJava.png)

### 1.2 File `Mahasiswa.java`

> File `Mahasiswa.java` bertindak sebagai *blueprint* (kerangka cetak biru) untuk objek mahasiswa. Kelas ini mendefinisikan atribut-atribut dasar (seperti nama, NPM, dan kelas), constructor untuk inisialisasi awal, serta penerapan konsep enkapsulasi menggunakan *access modifier* (`private`) yang dilengkapi dengan method *getter* dan *setter* untuk mengontrol akses data secara aman.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan2/img/before/MahasiswaJava.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan2/img/after/MahasiswaJava.png)


---

## 2. Program PHP

### 2.1 File `Main.php`

> File `Main.php` bertindak sebagai *script* eksekusi utama pada implementasi PHP. Script ini bertanggung jawab untuk memuat (*include/require*) definisi kelas `Mahasiswa`, melakukan proses instansiasi objek, memberikan nilai properti, serta mencetak hasil output ke peramban atau terminal.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal PHP](/Pertemuan2/img/before/MainPHP.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir PHP](/Pertemuan2/img/after/MainPHP.png)

* **Output setelah pengerjaan:**

![Output PHP](/Pertemuan2/img/after/OutputPHP.png)

### 2.2 File `Mahasiswa.php`

> File `Mahasiswa.php` mendefinisikan struktur *class* `Mahasiswa` dalam bahasa PHP. Di dalamnya berisi deklarasi properti objek, fungsi *constructor* untuk pengisian data awal, serta method pendukung guna menerapkan paradigma pemrograman berorientasi objek berbasis bahasa pemrograman skrip (*scripting language*).

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal PHP](/Pertemuan2/img/before/MahasiswaPHP.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir PHP](/Pertemuan2/img/after/MahasiswaPHP.png)


---

## Kesimpulan

> Praktikum ini memberikan pemahaman mendalam mengenai implementasi konsep dasar Pemrograman Berorientasi Objek (PBO), yang meliputi pembuatan *class* sebagai cetak biru, pembentukan *object* dari *class* tersebut, serta penerapan prinsip *encapsulation* untuk melindungi data atribut. Melalui perbandingan pengerjaan menggunakan bahasa **Java** dan **PHP**, dapat disimpulkan bahwa prinsip logika PBO bersifat universal dan konsisten, meskipun terdapat perbedaan sintaksis dasar antara bahasa yang dikompilasi (*compiled language*) seperti Java dan bahasa penafsiran (*interpreted language*) seperti PHP.