# LAPORAN PRAKTIKUM PBO

## Identitas

| Data              | Keterangan                     |
| ----------------- | ------------------------------ |
| Nama              | Satria Mahardika               |
| NPM               | 4525210068                     |
| Kelas             | A                              |
| Program Studi     | Teknik Informatika             |
| Mata Kuliah       | Pemrograman Berorientasi Objek |
| Materi Praktikum  | Inheritance             |

---

## 1. Program Java

### 1.1 File `Main.java`

> File `Main.java` berfungsi sebagai kelas utama (*driver class*) yang mengeksekusi program berbasis Java untuk menguji konsep pewarisan (*inheritance*). Di dalam file ini, objek dari subkelas pegawai (*PegawaiTetap* dan *PegawaiKontrak*) diinstansiasi dengan memanfaatkan atribut dan method yang diturunkan dari kelas induk (*Pegawai*), serta menampilkan hasil perhitungan gaji serta informasi pegawai ke konsol.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan4/img/before/MainJava.png)

* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan4/img/after/MainJava.png)

* **Output setelah pengerjaan:**

![Output Java](/Pertemuan4/img/after/OutputJava.png)

### 1.2 File `Pegawai.java`

> File `Pegawai.java` bertindak sebagai kelas induk (*superclasses*) yang mendefinisikan atribut dasar umum (seperti nama dan NIP) serta method dasar yang nantinya akan diwarisi oleh kelas-kelas turunannya guna menerapkan prinsip *code reusability*.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan4/img/before/PegawaiJava.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan4/img/after/PegawaiJava.png)

### 1.3 File `PegawaiKontrak.java`

> File `PegawaiKontrak.java` merupakan subkelas (*subclass*) dari kelas `Pegawai` yang mengkhususkan diri untuk menangani data pegawai dengan status kontrak. File ini mengimplementasikan pewarisan serta penyesuaian (*method overriding*) terkait perhitungan gaji atau tunjangan khusus pegawai kontrak.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan4/img/before/PegawaiKontrakJava.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan4/img/after/PegawaiKontrakJava.png)

### 1.4 File `PegawaiTetap.java`

> File `PegawaiTetap.java` bertindak sebagai subkelas lain dari `Pegawai` yang dikhususkan untuk menangani pegawai berstatus tetap. Kelas ini mewarisi atribut dari induknya dan menambahkan atau menyesuaikan atribut serta logika perhitungan gaji pokok dan tunjangan tetap.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal Java](/Pertemuan4/img/before/PegawaiTetapJava.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir Java](/Pertemuan4/img/after/PegawaiTetapJava.png)


---

## 2. Program PHP

### 2.1 File `Main.php`

> File `Main.php` berfungsi sebagai skrip eksekusi utama pada sisi PHP untuk menguji implementasi hirarki kelas pegawai. Skrip ini memuat kelas-kelas terkait, membuat objek dari kelas turunan pegawai tetap maupun kontrak, serta mencetak informasi hasil proses data ke layar.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal PHP](/Pertemuan4/img/before/MainPHP.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir PHP](/Pertemuan4/img/after/MainPHP.png)

* **Output setelah pengerjaan:**

![Output PHP](/Pertemuan4/img/after/OutputPHP.png)

### 2.2 File `Pegawai.php`

> File `Pegawai.php` mendefinisikan kelas dasar (*superclass*) dalam PHP yang merangkum properti dan method umum pegawai, yang kemudian diturunkan ke subkelas-subkelas spesifik untuk membangun struktur hierarki objek yang rapi dan terorganisir.

### Bukti Pengerjaan

* **Before / Kondisi awal:**

![Kondisi awal PHP](/Pertemuan4/img/before/PegawaiPHP.png)


* **After / Kondisi setelah pengerjaan:**

![Kondisi akhir PHP](/Pertemuan4/img/after/PegawaiPHP.png)


---

## Kesimpulan

> Praktikum ini memberikan pemahaman mendalam tentang konsep *Inheritance* (Pewarisan) dalam Pemrograman Berorientasi Objek, di mana sebuah kelas dapat mewarisi atribut dan method dari kelas induknya untuk menghindari duplikasi kode (*code reusability*). Melalui implementasi studi kasus kepegawaian menggunakan bahasa **Java** dan **PHP**, terlihat bahwa konsep pewarisan ini berjalan secara konsisten pada kedua bahasa untuk membangun struktur kelas bertingkat yang fleksibel dan mudah dikembangkan.