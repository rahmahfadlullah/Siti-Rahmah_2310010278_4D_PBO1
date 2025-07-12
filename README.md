# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data **perpustakaan** menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa judul dan informasi buku, dan memberikan output berupa informasi detail dari buku tersebut seperti tahun terbit, kategori, jenis media, dan status pinjam.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Perpustakaan`, `PerpustakaanDetail`, dan `PerpustakaanBeraksi` adalah contoh dari class.

```java
public class Perpustakaan {
    ...
}

public class PerpustakaanDetail extends Perpustakaan {
    ...
}

public class PerpustakaanBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarBuku[i] = new PerpustakaanDetail(...);` adalah contoh pembuatan object.

```java
daftarBuku[i] = new PerpustakaanDetail(...);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `judul`, `pengarang`, dan `tahunTerbit` adalah contoh atribut.

```java
String judul;
String pengarang;
int tahunTerbit;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Perpustakaan` dan `PerpustakaanDetail`.

```java
public Perpustakaan(String judul, String pengarang, int tahunTerbit, String kodeBuku, String kategori, String jenisMedia, String kodeRegistrasi) {
    this.judul = judul;
    this.pengarang = pengarang;
    this.tahunTerbit = tahunTerbit;
    this.kodeBuku = kodeBuku;
    this.kategori = kategori;
    this.jenisMedia = jenisMedia;
    this.kodeRegistrasi = kodeRegistrasi;
}

public PerpustakaanDetail(...) {
    super(...);
    this.statusDipinjam = statusDipinjam;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setJudul` dan `setStatusDipinjam` adalah contoh method mutator.

```java
public void setJudul(String judul) {
    this.judul = judul;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getJudul`, `getPengarang`, `getKodeBuku`, dan `isStatusDipinjam` adalah contoh method accessor.

```java
public String getJudul() {
    return judul;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `judul` dan `statusDipinjam` dienkapsulasi.

```java
private String judul;
private boolean statusDipinjam;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PerpustakaanDetail` mewarisi `Perpustakaan` dengan sintaks `extends`.

```java
public class PerpustakaanDetail extends Perpustakaan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi. Pada kode ini, method `displayInfo()` di `PerpustakaanDetail` merupakan override dari method `displayInfo()` di `Perpustakaan`.

```java
@Override
public String displayInfo() {
    String status = isStatusDipinjam() ? "Sedang Dipinjam" : "Tersedia";
    return super.displayInfo() + "\nStatus          : " + status;
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam menentukan kategori dan jenis media.

```java
String kategori = switch (kodeKategori) {
    case "01" -> "Novel";
    case "02" -> "Pelajaran";
    case "03" -> "Komik";
    default -> "Tidak Diketahui";
};
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```java
for (int i = 0; i < daftarBuku.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```java
Scanner input = new Scanner(System.in);
System.out.println("Judul Buku: ");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PerpustakaanDetail[] daftarBuku = new PerpustakaanDetail[2];` adalah contoh penggunaan array.

```java
PerpustakaanDetail[] daftarBuku = new PerpustakaanDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```java
try {
    ...
} catch (NumberFormatException e) {
    System.out.println("Input angka tidak valid: " + e.getMessage());
}
```

## Usulan nilai

|  No | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |    10   |
|  10 | Seleksi        |    5    |
|  11 | Perulangan     |    5    |
|  12 | IO Sederhana   |    10   |
|  13 | Array          |    15   |
|  14 | Error Handling |    15   |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Siti Rahmah
NPM : 2310010278
