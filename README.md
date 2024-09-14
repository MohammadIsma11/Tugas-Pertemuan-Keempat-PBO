# Tugas Pertemuan 4 - Pemrograman Berorientasi Objek (PBO)

## Deskripsi Tugas
Pada pertemuan ke-4 mata kuliah Pemrograman Berorientasi Objek (PBO), tugas ini mencakup pembahasan mengenai konsep **CRUD**, **DDL**, **DML**, serta penanganan pengecualian (**Exception**) di Java dengan penggunaan **throws** dan **try-catch**. Berikut penjelasan lengkap dari konsep-konsep tersebut:

---

## DDL (Data Definition Language)
**DDL** adalah sekumpulan perintah SQL yang digunakan untuk mendefinisikan dan mengelola **struktur** basis data. DDL digunakan untuk membuat, mengubah, dan menghapus tabel, indeks, serta objek-objek lain dalam basis data. Beberapa perintah DDL yang umum adalah:
- **`CREATE`**: Membuat tabel atau objek lainnya dalam basis data.
- **`ALTER`**: Mengubah struktur tabel atau objek lainnya.
- **`DROP`**: Menghapus tabel atau objek dari basis data.
- **`TRUNCATE`**: Menghapus semua data dalam tabel, tetapi tetap mempertahankan strukturnya.

## DML (Data Manipulation Language)
**DML** adalah sekumpulan perintah SQL yang digunakan untuk **memanipulasi data** di dalam tabel. DML berfokus pada operasi seperti memasukkan data baru, mengambil data, memperbarui data yang ada, dan menghapus data dari tabel. Beberapa perintah DML yang umum adalah:
- **`INSERT`**: Menambahkan data ke dalam tabel.
- **`SELECT`**: Mengambil data dari tabel.
- **`UPDATE`**: Memperbarui data dalam tabel.
- **`DELETE`**: Menghapus data dari tabel.

## CRUD (Create, Read, Update, Delete)
**CRUD** adalah istilah yang digunakan untuk menggambarkan empat operasi utama dalam aplikasi yang bekerja dengan basis data. Operasi CRUD berkaitan langsung dengan perintah DML dalam SQL. Berikut penjelasannya:
- **Create**: Menambahkan data baru ke dalam database (dalam SQL menggunakan `INSERT`).
- **Read**: Mengambil data dari database (dalam SQL menggunakan `SELECT`).
- **Update**: Memperbarui data yang ada di database (dalam SQL menggunakan `UPDATE`).
- **Delete**: Menghapus data dari database (dalam SQL menggunakan `DELETE`).

## Exception Handling di Java
Penanganan **exception** (pengecualian) adalah mekanisme penting dalam Java untuk menangani kesalahan yang mungkin terjadi saat program berjalan. Exception bisa terjadi dalam berbagai situasi, seperti ketika mencoba membagi angka dengan nol, atau ketika mencoba mengakses elemen di luar batas array.

### Throws
Kata kunci **`throws`** digunakan untuk mendeklarasikan bahwa sebuah method dapat melempar pengecualian. Pengecualian ini harus ditangani oleh pemanggil method, baik dengan menggunakan `try-catch` atau dengan meneruskannya lebih lanjut.

### Try-Catch
Blok **`try-catch`** digunakan untuk menangkap pengecualian yang terjadi saat program berjalan. Blok `try` mencoba menjalankan kode yang mungkin menyebabkan pengecualian, sedangkan blok `catch` menangkap pengecualian tersebut dan menangani kesalahan yang terjadi.

## Penutup
Pada tugas ini, kita telah mempelajari:
- **DDL dan DML** sebagai bagian dari SQL untuk mengelola struktur dan data dalam basis data.
- **CRUD** sebagai operasi dasar dalam aplikasi yang bekerja dengan data.
- Cara menangani **exception** di Java menggunakan **throws** dan **try-catch**.

Semoga penjelasan ini membantu dalam memahami materi pertemuan ke-4 PBO.
