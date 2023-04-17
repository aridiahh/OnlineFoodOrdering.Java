# Tugas 1 Pemrograman Berorentasi Obyek - OnlineFoodOrdering.Java
Program Online Food Ordering merupakan program yang dirancang untuk memenuhi tugas pertama dari mata kuliah `Pemrograman Berorentasi Obyek`. Perancangan program ini dilaksanakan secara individu, atas nama `NI KADEK ARI DIAH LESTARI` dengan NIM `2205551069`.

Program Online Food Ordering tersebut merupakan program penjualan makanan berbasis online yang dapat digunakan untuk memudahkan customer dalam berbelanja makanan tanpa harus berpergian keluar. Didalam program tersebut terdapat 2 tipe user, yaitu admin dan customer. Pada admin memiliki keunggulan yang dimana dapat melihat, menambah, dan menghapus restoran. Sedangkan customer, dapat membuat dan melihat pesanannya.
Selain itu, terdapat pula data restorannya, yang dimana berisikan tentang nama, alamat, menu makanan atau minuman, dan serta harganya. Dan terdapat pula data ordernya, yang berisikan id retoran, id menu, kuantitas setiap menu (jumlah item), jarak ke lokasi antar, dan juga total harganya. Berikut merupakan penjelasan lebih detailnya.

## Bagian Login

![image](https://user-images.githubusercontent.com/113997689/232509975-cd25d5c5-588b-4973-a2fa-543607780e25.png)

Program ini merupakan sebuah class dengan nama `menuLogin` yang mengimport class `Scanner`. Di dalam class `menuLogin` terdapat variabel-variabel yang digunakan pada program, yaitu `clss`, `users`, `input`, dan `pilihan`.

- `clss` bertipe data `cls`, yang mana `cls` merupakan sebuah class yang diinstansiasi dalam variabel `clss`.
- `users` bertipe data `User`, yang mana `User` juga merupakan sebuah class.
- `input` bertipe data `Scanner`, digunakan untuk membaca input dari user.
- `pilihan` bertipe data `int`, digunakan untuk menyimpan pilihan yang dipilih oleh user.

Setelah itu, terdapat penulisan class `menuLogin` dengan method-method yang akan dijalankan pada program.

![image](https://user-images.githubusercontent.com/113997689/232503046-ba307bf0-049b-4536-b5c5-89765d1549c6.png)

Program di atas adalah bagian dari program yang bertujuan untuk mengimplementasikan fitur login pada aplikasi. Pada bagian ini, terdapat sebuah method bernama `login()` yang memiliki tipe data return boolean. Method ini akan mengembalikan nilai true jika user berhasil login dan false jika gagal.
Pertama-tama, program ini akan menginisialisasi objek user dengan username dan password untuk admin dan customer. Kemudian, program akan menampilkan pesan untuk meminta user untuk memasukkan username dan password.
Setelah user memasukkan username dan password, program akan membandingkan data yang dimasukkan dengan data yang telah diinisialisasi sebelumnya. Jika data yang dimasukkan sesuai dengan data admin atau customer, maka variabel `masuk` akan di-set menjadi true. Namun, jika data yang dimasukkan tidak sesuai dengan data admin atau customer, variabel `masuk` akan tetap false.
Selanjutnya, nilai variabel `masuk` akan digunakan pada bagian program lain untuk menentukan akses pengguna pada aplikasi. Jika nilai `masuk` adalah true, pengguna akan diberikan akses ke fitur-fitur tertentu. Namun, jika nilai `masuk` adalah false, pengguna tidak akan diberikan akses ke fitur-fitur tersebut.
Secara keseluruhan, program ini bertujuan untuk memastikan bahwa hanya pengguna yang telah terotentikasi yang dapat mengakses fitur-fitur pada aplikasi tersebut.

![image](https://user-images.githubusercontent.com/113997689/232505408-b42de04d-abd9-4e49-9756-90d07b209ec3.png)

Program di atas adalah bagian dari program yang memproses login user ke dalam sistem. Setelah user memasukkan username dan password, program akan memeriksa apakah data yang dimasukkan benar atau tidak.
Pada bagian kode `if (users.getUsername().equals(username) || users.getUsername_cust().equals(username))`, program memeriksa apakah username yang dimasukkan user sesuai dengan username yang telah diset sebelumnya untuk admin atau customer. Jika sesuai, maka program akan memeriksa password yang dimasukkan oleh user. Jika password yang dimasukkan sesuai dengan password yang telah diset sebelumnya untuk admin atau customer, maka program akan mengeset status user sesuai dengan jenis user yang login dan mengembalikan nilai `true` untuk menandakan bahwa user berhasil login. 
Jika username atau password yang dimasukkan salah, program akan mengembalikan nilai `false`, sehingga user tidak berhasil login. 
Dalam program ini, terdapat 2 jenis user yaitu admin dan customer. Setiap jenis user memiliki username dan password yang berbeda. Dalam program ini, data username dan password di-set secara hard-coded. Setelah user berhasil login, status user akan disimpan dalam atribut `status` pada objek `users`. Atribut ini nantinya akan digunakan untuk menentukan menu yang akan ditampilkan dan aksi-aksi lain yang bisa dilakukan oleh user di dalam sistem.

![image](https://user-images.githubusercontent.com/113997689/232506655-40e0b8b9-9e41-44de-9cd7-c754492b404d.png)

![image](https://user-images.githubusercontent.com/113997689/232507735-9b29d787-2de8-4f03-9ce6-d90d468742b9.png)

Program di atas adalah sebuah method bernama `menu()` yang berisi tampilan menu pilihan untuk user setelah berhasil login. Method ini memiliki kondisi `if else` untuk menentukan apakah user yang login adalah admin atau customer, kemudian menampilkan menu pilihan sesuai dengan status user tersebut. 
Jika status user adalah "Admin", maka akan ditampilkan pilihan menu berikut: 
1. Lihat Resto
2. Tambah Resto
3. Hapus Resto
4. Kembali ke Login

Jika status user adalah "Customer", maka akan ditampilkan pilihan menu berikut:
1. Lihat Resto
2. Buat Pesanan
3. Lihat Pesanan
4. Kembali ke Login

Setelah user memilih opsi, program akan mengeksekusi method terkait yang ada pada class `menuAdmin` untuk opsi pilihan menu yang berkaitan dengan admin atau pada class `customer` untuk opsi pilihan menu yang berkaitan dengan customer. Kemudian, layar akan dihapus dengan menggunakan method `cls.clearScreen()`, dan program akan memanggil kembali method `menu()` untuk menampilkan kembali menu setelah layar bersih. 
Jika user memilih opsi selain dari 1-4, maka program akan menampilkan pesan "Username atau Password yang Diinputkan Salah!" dan memanggil kembali method `menu()` untuk menampilkan menu kembali.


