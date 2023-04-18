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

### Output

![image](https://user-images.githubusercontent.com/113997689/232642852-b32b4d3f-a9c9-496a-994d-aace51064182.png)

Gambar diatas merupakan hasil output yang muncul pertama kali ketika kode program dijalankan. Terdapat perintah untuk memasukkan username dan password dengan tepat. Username dan password yang dimasukkan disesuaikan dengan keinginan user mau login sebagai admin ataupun customer. Jika username atau password yang dimasukkan adalah salah, maka akan muncul sebuah pernyataan seperti gambar dibawah ini.

![image](https://user-images.githubusercontent.com/113997689/232643092-a4c63342-b7c1-48d8-abe2-5d4269bf39f0.png)

Gambar dibawah ini merupakan hasil login jika user berhasil masuk sebagai admin. User admin disajikan beberapa pilihan menu admin, diantaranya dapat melihat resto, menambah resto, menghapus resto, kembali ke login, dan keluar.

![image](https://user-images.githubusercontent.com/113997689/232642257-a3d87662-5646-4ad8-8337-19afcd548c16.png)

Gambar dibawah ini merupakan hasil login jika user berhasil masuk sebagai customer. User customer disajikan beberapa pilihan menu customer, diantaranya dapat melihat resto, membuat pesanan, melihat pesanan, kembali ke login, dan juga keluar.

![image](https://user-images.githubusercontent.com/113997689/232642463-7eb43eac-f6e7-4cae-b0de-490dfa8b5cf2.png)

## Bagian Admin

![image](https://user-images.githubusercontent.com/113997689/232640796-51b544b6-2ef5-4757-8303-63fb9695efc7.png)

Kode program Java di atas merupakan bagian dari suatu sistem yang berfungsi untuk mengelola pesanan makanan di beberapa restoran. Lebih spesifiknya, kode ini digunakan untuk menampilkan daftar restoran beserta menu yang tersedia.

Berikut adalah penjelasan lebih detail mengenai kode tersebut:

1. Deklarasi dan inisialisasi ArrayList: Pada awal kode, terdapat deklarasi dan inisialisasi tiga buah ArrayList, yaitu `idRest`, `namaRest`, dan `alamatRest`. Ketiga ArrayList ini digunakan untuk menyimpan informasi mengenai ID restoran, nama restoran, dan alamat restoran.

2. Looping untuk mengambil elemen dari `restoList`: Selanjutnya, terdapat looping `for` yang digunakan untuk mengambil setiap elemen dari `restoList` dan memasukkannya ke dalam tiga buah ArrayList yang telah dideklarasikan sebelumnya. `restoList` mungkin merupakan suatu kumpulan data yang berisi informasi mengenai restoran, seperti ID restoran, nama restoran, dan alamat restoran.

3. StringTokenizer untuk memisahkan informasi: Dalam looping tersebut, terdapat penggunaan `StringTokenizer` untuk memisahkan informasi mengenai restoran yang terdapat dalam setiap elemen `restoList`. `StringTokenizer` digunakan untuk memisahkan informasi yang ada dalam bentuk string menjadi beberapa token berdasarkan delimiter tertentu, dalam hal ini adalah tanda koma (`,`). Setelah informasi dipisahkan, token-token tersebut akan dimasukkan ke dalam ArrayList yang sesuai (yaitu `idRest`, `namaRest`, dan `alamatRest`) dengan menggunakan metode `add()`.

4. Replace karakter `[` dan `]`: Sebelum memasukkan informasi ke dalam ArrayList, terdapat juga penggunaan `replace()` untuk menghapus karakter `[` dan `]` pada string yang diambil dari `restoList`. Hal ini dilakukan untuk membersihkan string dari karakter yang tidak diinginkan sebelum memasukkan informasinya ke dalam ArrayList.

Dengan demikian, kode di atas digunakan untuk mengambil informasi mengenai restoran yang ada dalam `restoList` dan memasukkannya ke dalam ArrayList `idRest`, `namaRest`, dan `alamatRest` sehingga informasi tersebut dapat digunakan untuk menampilkan daftar restoran beserta menu yang tersedia.

![image](https://user-images.githubusercontent.com/113997689/232640830-cdeb5c54-9040-474e-bab3-ff35774390f7.png)

Kode program Java di atas merupakan lanjutan dari kode sebelumnya, dan masih berhubungan dengan sistem yang digunakan untuk mengelola pesanan makanan di beberapa restoran. Kode tersebut berfungsi untuk menampilkan informasi mengenai restoran, termasuk ID restoran, nama restoran, alamat restoran, dan menu yang tersedia untuk setiap restoran.

Berikut adalah penjelasan lebih detail mengenai kode tersebut:

1. Looping untuk menampilkan informasi restoran: Terdapat looping `for` yang digunakan untuk menampilkan informasi restoran untuk setiap restoran yang ada dalam ArrayList `idRest`, `namaRest`, dan `alamatRest`. Looping ini menggunakan variabel `j` sebagai indeks untuk mengakses setiap elemen dalam ArrayList. Setiap informasi restoran ditampilkan dengan menggunakan metode `System.out.println()` untuk mencetak ke layar.

2. Cetak informasi restoran: Dalam setiap iterasi looping, informasi yang akan ditampilkan meliputi: index restoran, ID restoran, nama restoran, dan alamat restoran. Informasi tersebut diambil dari ArrayList `idRest`, `namaRest`, dan `alamatRest` dengan menggunakan metode `toArray()[j].toString().replace("[", "").replace("]", "")`. Metode `toArray()` digunakan untuk mengubah ArrayList menjadi array, dan selanjutnya `j` digunakan sebagai indeks untuk mengakses elemen yang sesuai dalam array tersebut. Kemudian, metode `toString()` digunakan untuk mengubah elemen array menjadi string, dan metode `replace()` digunakan untuk menghapus karakter `[` dan `]` yang mungkin ada dalam string tersebut.

3. Memanggil fungsi `showMenu()`: Setelah mencetak informasi mengenai restoran, kode juga memanggil fungsi `showMenu()` dengan menggunakan `customer.showMenu(idRest.get(j))`. Fungsi ini mungkin merupakan suatu fungsi yang akan menampilkan daftar menu yang tersedia untuk restoran yang memiliki ID sesuai dengan yang diambil dari ArrayList `idRest` pada setiap iterasi looping.

Dengan demikian, kode di atas digunakan untuk menampilkan informasi mengenai restoran, termasuk ID restoran, nama restoran, alamat restoran, dan menu yang tersedia untuk setiap restoran yang ada dalam ArrayList `idRest`, `namaRest`, dan `alamatRest`.

![image](https://user-images.githubusercontent.com/113997689/232641194-c18c966f-514d-4c68-956f-ff1372e6e7f6.png)

Kode program Java di atas merupakan bagian dari sistem yang digunakan untuk mengelola data restoran dalam suatu list. Kode tersebut berfungsi untuk menghapus data restoran dari list jika data tersebut telah tersimpan di dalamnya.

Berikut adalah penjelasan lebih rinci mengenai kode tersebut:

1. Deklarasi ArrayList: Terdapat deklarasi tiga buah ArrayList dengan tipe data String yaitu `idRest`, `namaRest`, dan `alamatRest`. ArrayList ini kemungkinan digunakan untuk menyimpan informasi mengenai ID, nama, dan alamat dari restoran yang ada.

2. Fungsi `hapusResto()`: Ini adalah suatu fungsi yang digunakan untuk menghapus data restoran dari list. Fungsi ini memiliki beberapa langkah kerja sebagai berikut:
   - Mengecek jumlah data dalam `restoList`: Pada baris pertama dalam fungsi, terdapat kondisi `if` yang digunakan untuk memeriksa apakah `restoList`, yang kemungkinan merupakan ArrayList yang berisi data restoran, memiliki jumlah data yang lebih dari 0. Jika jumlah data lebih dari 0, artinya terdapat data restoran yang tersimpan dalam list.
   - Mengambil input index restoran yang akan dihapus: Jika jumlah data restoran lebih dari 0, maka pengguna akan diminta untuk memasukkan index restoran yang akan dihapus melalui metode `input.nextLine()`. Input ini kemungkinan diberikan oleh pengguna melalui suatu interface pengguna yang telah didefinisikan sebelumnya.
   - Menghapus data restoran: Setelah input index restoran diterima, kode akan menggunakan metode `remove(index)` untuk menghapus data restoran dari `restoList` berdasarkan index yang diinputkan oleh pengguna. Dengan demikian, data restoran yang ada pada index tersebut akan dihapus dari list.
   - Menampilkan pesan konfirmasi: Setelah data restoran dihapus, kode akan mencetak pesan "Data Telah Terhapus" sebagai konfirmasi bahwa data telah berhasil dihapus.

Dengan demikian, kode di atas digunakan untuk menghapus data restoran dari list jika data tersebut telah tersimpan di dalamnya, dan memberikan konfirmasi bahwa data telah terhapus setelah proses penghapusan selesai.

![image](https://user-images.githubusercontent.com/113997689/232641410-c2766359-bf5a-4314-8189-6ca3e398a5a2.png)

Kode program Java di atas merupakan bagian dari sistem yang digunakan untuk mengelola data restoran dalam suatu list. Kode tersebut berfungsi untuk menambahkan data restoran ke dalam list. Berikut adalah penjelasan lebih rinci mengenai kode tersebut:

1. Deklarasi ArrayList: Terdapat deklarasi tiga buah ArrayList dengan tipe data String yaitu `idRest`, `namaRest`, dan `alamatRest`. ArrayList ini kemungkinan digunakan untuk menyimpan informasi mengenai ID, nama, dan alamat dari restoran yang akan ditambahkan ke dalam list.

2. Variabel lokal `harga`: Terdapat deklarasi variabel lokal `harga` yang kemungkinan digunakan untuk menyimpan informasi mengenai harga menu restoran yang akan ditambahkan. Namun, nilai variabel ini tidak digunakan dalam kode yang diberikan.

3. Input data restoran dari pengguna: Kode pada bagian ini digunakan untuk mengambil input data restoran dari pengguna melalui suatu antarmuka pengguna. Terdapat penggunaan `input.nextLine()` untuk membaca input yang diberikan oleh pengguna. Data yang diinputkan oleh pengguna meliputi ID restoran, nama restoran, alamat restoran, dan jumlah menu yang akan ditambahkan.

4. Menyimpan data restoran ke dalam ArrayList: Setelah data restoran diinputkan oleh pengguna, kode akan menggunakan metode `add()` untuk menyimpan data tersebut ke dalam masing-masing ArrayList yang telah dideklarasikan sebelumnya, yaitu `idRest`, `namaRest`, dan `alamatRest`. Data restoran akan disimpan di akhir ArrayList, sehingga akan menjadi data baru dalam list.

5. Input jumlah menu: Kode pada bagian ini digunakan untuk mengambil input jumlah menu yang akan ditambahkan oleh pengguna. Jumlah menu ini akan digunakan dalam bagian selanjutnya untuk mengambil input menu-menu yang akan ditambahkan ke dalam restoran yang baru saja ditambahkan ke dalam list.

6. Menampilkan konfirmasi: Setelah data restoran dan jumlah menu diinputkan oleh pengguna, kode akan mencetak pesan konfirmasi bahwa data restoran telah ditambahkan ke dalam list.

Dengan demikian, kode di atas digunakan untuk mengambil input data restoran dari pengguna, menyimpan data tersebut ke dalam ArrayList, dan memberikan konfirmasi bahwa data telah berhasil ditambahkan ke dalam list.

![image](https://user-images.githubusercontent.com/113997689/232641585-effc06e4-5935-4d98-93ec-c54d70a4d43a.png)

Kode program Java di atas merupakan bagian lanjutan dari kode program sebelumnya. Kode tersebut berfungsi untuk mengambil input data menu dari pengguna dan menambahkan data menu tersebut ke dalam list `menuList`. Berikut adalah penjelasan lebih rinci mengenai kode tersebut:

1. Perulangan untuk mengambil input setiap menu: Terdapat penggunaan perulangan `for` untuk mengambil input data menu dari pengguna. Perulangan akan berjalan sebanyak `banyak` kali, dimana `banyak` merupakan jumlah menu yang diinputkan oleh pengguna sebelumnya. Variabel `i` digunakan sebagai counter perulangan, dimulai dari 0 hingga `banyak-1`.

2. Input data menu dari pengguna: Kode pada bagian ini digunakan untuk mengambil input data menu dari pengguna melalui suatu antarmuka pengguna. Terdapat penggunaan `input.nextLine()` untuk membaca input yang diberikan oleh pengguna. Data yang diinputkan oleh pengguna meliputi ID menu, nama menu, dan harga menu.

3. Menyimpan data menu ke dalam list `menuList`: Setelah data menu diinputkan oleh pengguna, kode akan menggunakan metode `add()` untuk menyimpan data tersebut ke dalam list `menuList`. Data menu akan disimpan dalam bentuk ArrayList menggunakan metode `Arrays.asList()`. ArrayList tersebut akan berisi tiga elemen yaitu ID resto (`idResto`), ID menu (`idMenu`), dan nama menu (`namaMenu`).

4. Menambahkan data resto ke dalam list `restoList`: Setelah data menu-menu diinputkan oleh pengguna dan disimpan ke dalam `menuList`, kode akan menggunakan metode `add()` untuk menyimpan data resto ke dalam list `restoList`. Data resto akan disimpan dalam bentuk ArrayList menggunakan metode `Arrays.asList()`. ArrayList tersebut akan berisi tiga elemen yaitu ID resto (`idResto`), nama resto (`nama`), dan alamat resto (`alamat`).

Dengan demikian, kode di atas digunakan untuk mengambil input data menu dari pengguna, menyimpan data menu tersebut ke dalam list `menuList`, dan menyimpan data resto ke dalam list `restoList`.

### Output

![tambah resto](https://user-images.githubusercontent.com/113997689/232644249-d3d79398-3afc-4f3c-91e8-12ea83b79a05.png)

![tambah resto 2](https://user-images.githubusercontent.com/113997689/232644268-37da8941-4bec-43e8-ba92-7b832ee83ff6.png)

Kedua gambar diatas ini merupakan hasil dari user admin jika memilih opsi yang kedua yaitu menambahkan resto. Penambahan resto dilakukan sebanyak 2 resto dengan menginputkan id resto, nama resto, alamat restok, banyak menu resto, id menu resto, nama menu resto, dan juga harga menu restonya tersebut.

![lihat resto](https://user-images.githubusercontent.com/113997689/232643931-50394606-f8c5-48b4-bb3e-8438b4edf828.png)

Gambar diatas merupakan hasil dari user admin jika memilih opsi yang pertama yaitu lihat resto. Terdapat 2 resto yang muncul.

![hapus resto](https://user-images.githubusercontent.com/113997689/232644696-6f3b2c6d-7cdb-4c55-b987-c1eeb6eceadf.png)

![hapus resto 2](https://user-images.githubusercontent.com/113997689/232644719-9773cda9-e141-445d-956c-0182f99bebda.png)

Kedua gambar diatas ini merupakan hasil dari user admin jika memilih opsi yang ketiga. Awalnya terdapat 2 data resto, kemudian user admin memilih opsi ketiga dan memasukkan index resto yaitu 1, maka resto yang berindex 1 tersebut menjadi terhapus. Hasilnya sesuai seperti pada gambar ke 2. Dan sekarang hanya tersisa 1 resto saja.

## Bagian User

![image](https://user-images.githubusercontent.com/113997689/232705507-d81e31e3-93ff-4939-9717-9cd2ed026c8c.png)

Kode di atas adalah contoh implementasi dari sebuah kelas bernama "User" dalam bahasa pemrograman Java. Kelas ini memiliki beberapa atribut dan metode yang digunakan untuk mengakses dan mengatur nilai atribut-atribut tersebut.

1. Atribut
Kelas "User" memiliki beberapa atribut yang dideklarasikan sebagai variabel privat, yaitu:
- "username" (bertipe String): digunakan untuk menyimpan nilai username pengguna.
- "password" (bertipe String): digunakan untuk menyimpan nilai password pengguna.
- "status" (bertipe String): digunakan untuk menyimpan status pengguna.
- "username_cust" (bertipe String): digunakan untuk menyimpan nilai username pelanggan.
- "password_cust" (bertipe String): digunakan untuk menyimpan nilai password pelanggan.

Semua atribut di atas bersifat privat, artinya hanya dapat diakses dan diubah nilainya dari dalam kelas "User" sendiri.

2. Getter dan Setter
Kelas "User" juga memiliki beberapa metode getter dan setter yang digunakan untuk mengakses dan mengatur nilai atribut-atribut tersebut. Getter adalah metode yang digunakan untuk mengambil nilai dari atribut, sedangkan setter adalah metode yang digunakan untuk mengatur atau mengubah nilai atribut.

- Getter dan setter untuk atribut "username_cust".
Metode "getUsername_cust()" digunakan untuk mengambil nilai dari atribut "username_cust" dan mengembalikan nilai tersebut. Metode "setUsername_cust(String username_cust)" digunakan untuk mengatur atau mengubah nilai atribut "username_cust" dengan nilai yang diberikan sebagai argumen.

- Getter dan setter untuk atribut "password_cust".
Metode "getPassword_cust()" digunakan untuk mengambil nilai dari atribut "password_cust" dan mengembalikan nilai tersebut. Metode "setPassword_cust(String password_cust)" digunakan untuk mengatur atau mengubah nilai atribut "password_cust" dengan nilai yang diberikan sebagai argumen.

3. Penggunaan
Dengan adanya getter dan setter untuk atribut "username_cust" dan "password_cust", kita dapat mengakses dan mengatur nilai atribut-atribut tersebut dari objek "User" yang telah dibuat. Contohnya sebagai berikut:

Dengan demikian, kita dapat mengakses dan mengatur nilai dari atribut "username_cust" dan "password_cust" melalui metode getter dan setter yang telah didefinisikan dalam kelas "User". Penggunaan getter dan setter ini membantu dalam menjaga encapsulation atau pengkapsulan, yaitu prinsip dalam pemrograman berorientasi objek yang menjaga keberlanjutan dan konsistensi dari data dalam objek.

![image](https://user-images.githubusercontent.com/113997689/232705809-eb03194b-94d4-4acf-8233-e2babbe0db3a.png)

Getter dan Setter untuk atribut "username".  Metode "getUsername()" digunakan untuk mengambil nilai dari atribut "username" dan mengembalikan nilai tersebut. Metode "setUsername(String username)" digunakan untuk mengatur atau mengubah nilai atribut "username" dengan nilai yang diberikan sebagai argumen.

Getter dan Setter untuk atribut "password". Metode "getPassword()" digunakan untuk mengambil nilai dari atribut "password" dan mengembalikan nilai tersebut. Metode "setPassword(String password)" digunakan untuk mengatur atau mengubah nilai atribut "password" dengan nilai yang diberikan sebagai argumen.

Getter dan Setter untuk atribut "status". Metode "getStatus()" digunakan untuk mengambil nilai dari atribut "status" dan mengembalikan nilai tersebut. Tidak ada metode setter yang didefinisikan untuk atribut "status" dalam kode tersebut, artinya nilai atribut "status" tidak dapat diubah melalui metode setter.

![image](https://user-images.githubusercontent.com/113997689/232709035-43eed889-f482-4f16-9812-877d518cc96d.png)

Kode di atas adalah bagian dari metode "main" dalam sebuah program Java. Metode "main" adalah metode yang akan dijalankan pertama kali saat kita menjalankan sebuah program Java, dan merupakan titik awal eksekusi dari program tersebut.

Dalam kode di atas, terdapat beberapa langkah yang dijelaskan sebagai berikut:

1. Mengevaluasi kondisi pada baris "if (menuLogin.login())":
   Kode "menuLogin.login()" digunakan untuk memanggil suatu metode bernama "login()" dari kelas atau objek "menuLogin" (asumsi bahwa "menuLogin" adalah suatu objek atau kelas yang telah didefinisikan sebelumnya). Hasil yang dikembalikan oleh metode "login()" akan dievaluasi sebagai suatu kondisi boolean (true atau false) dalam pernyataan "if".

2. Jika kondisi pada langkah (1) bernilai true:
   Jika hasil evaluasi kondisi pada langkah (1) adalah true, maka program akan masuk ke dalam blok pernyataan "if". Dalam blok ini, terdapat sebuah perulangan "while (true)" yang akan terus berjalan selama kondisi "true". Dalam perulangan ini, akan dipanggil metode "menu()" dari objek "menuLogin" secara berulang, yang mungkin berisi logika atau tampilan untuk menampilkan menu pilihan kepada pengguna.

3. Jika kondisi pada langkah (1) bernilai false:
   Jika hasil evaluasi kondisi pada langkah (1) adalah false, maka program akan melanjutkan ke blok pernyataan "else". Dalam blok ini, akan dicetak pesan "Username atau Password yang Diinputkan Salah!" menggunakan metode "System.out.println()". Pesan ini akan ditampilkan kepada pengguna jika metode "login()" mengembalikan nilai false, yang mengindikasikan bahwa username atau password yang diinputkan tidak valid.

Ringkasnya, kode di atas menggambarkan alur eksekusi sebuah program Java yang memanggil metode "login()" dari objek "menuLogin" untuk melakukan proses login. Jika login berhasil (mengembalikan nilai true), maka program akan menampilkan menu pilihan kepada pengguna dalam perulangan yang berjalan terus menerus. Jika login gagal (mengembalikan nilai false), maka program akan mencetak pesan kesalahan.

## Bagian Customer

![image](https://user-images.githubusercontent.com/113997689/232711465-5027ce88-1d1a-4c1d-8d6f-d6dcdf85a529.png)

Kode di atas adalah bagian awal dari sebuah program Java yang berisi beberapa import statement dan deklarasi beberapa kelas dan variabel. Berikut adalah penjelasan lebih rinci tentang kode tersebut:

1. Import Statement:
   - `import java.util.ArrayList;`: Mengimport kelas ArrayList dari paket java.util. ArrayList adalah salah satu implementasi dari antarmuka List di Java yang digunakan untuk menyimpan kumpulan objek dengan ukuran yang dapat berubah-ubah.
   - `import java.util.Arrays;`: Mengimport kelas Arrays dari paket java.util. Arrays adalah kelas utilitas yang menyediakan metode untuk memanipulasi array, seperti mengurutkan, mencari, dan mengisi array.
   - `import java.util.Scanner;`: Mengimport kelas Scanner dari paket java.util. Scanner digunakan untuk membaca masukan dari pengguna melalui konsol atau aliran masukan lainnya.
   - `import java.util.StringTokenizer;`: Mengimport kelas StringTokenizer dari paket java.util. StringTokenizer digunakan untuk memecah suatu string menjadi token-token yang dipisahkan oleh delimiter tertentu.

2. Deklarasi Kelas:
   - `public class customer {`: Mendeklarasikan kelas customer. Kelas ini kemungkinan besar berfungsi untuk mengelola data pelanggan dan pesanan dalam sebuah aplikasi.

3. Deklarasi Variabel:
   - `static ArrayList<Object> orderList = new ArrayList<Object>();`: Mendeklarasikan variabel orderList sebagai objek ArrayList yang dapat menyimpan objek dari tipe data apa pun. Variabel ini digunakan untuk menyimpan daftar pesanan.
   - `static ArrayList<String> idRest, namaRest, alamatRest;`: Mendeklarasikan variabel idRest, namaRest, dan alamatRest sebagai objek ArrayList yang dapat menyimpan objek dari tipe data String. Variabel ini kemungkinan digunakan untuk menyimpan data mengenai restoran, seperti ID, nama, dan alamat restoran.
   - `static ArrayList<Object> restoList = new ArrayList<Object>();`: Mendeklarasikan variabel restoList sebagai objek ArrayList yang dapat menyimpan objek dari tipe data apa pun. Variabel ini digunakan untuk menyimpan daftar restoran.
   - `static ArrayList<Object> menuList = new ArrayList<Object>();`: Mendeklarasikan variabel menuList sebagai objek ArrayList yang dapat menyimpan objek dari tipe data apa pun. Variabel ini digunakan untuk menyimpan daftar menu makanan atau minuman.

Kode di atas adalah bagian awal dari sebuah program Java yang berisi deklarasi kelas customer dan beberapa variabel untuk menyimpan data pelanggan, pesanan, restoran, dan menu. Namun, untuk memahami secara keseluruhan tentang fungsionalitas program, perlu melihat bagian kode yang lebih lanjut.

![image](https://user-images.githubusercontent.com/113997689/232712081-7fd72972-4f4d-4577-8279-81aa0e057ada.png)

Kode di atas adalah suatu metode dengan nama `lihatResto()` yang bertujuan untuk menampilkan daftar restoran yang ada. Berikut adalah penjelasan lebih rinci tentang kode tersebut:

1. Looping:
   - `for (int i = 0; i < restoList.size(); i++) {`: Menggunakan looping `for` untuk mengiterasi setiap elemen dalam `restoList`, yang merupakan objek ArrayList yang menyimpan daftar restoran. Looping ini akan berjalan sebanyak jumlah elemen yang ada dalam `restoList`.

2. Objek StringTokenizer:
   - `StringTokenizer stringtok = new StringTokenizer(restoList.toArray()[i].toString().replace("[", "").replace("]", ""), ",");`: Mendeklarasikan objek StringTokenizer dengan nama `stringtok`. Objek ini digunakan untuk memecah string yang mengandung informasi mengenai restoran menjadi token-token yang dipisahkan oleh karakter koma (",").
   - `restoList.toArray()[i].toString().replace("[", "").replace("]", "")`: Mengambil elemen ke-i dari `restoList` menggunakan `toArray()` dan mengonversikannya menjadi string dengan `toString()`. Selanjutnya, menghapus karakter "[" dan "]" dari string tersebut menggunakan `replace("[", "")` dan `replace("]", "")`.

3. Penyimpanan Data:
   - `idRest.add(stringtok.nextToken());`: Menyimpan token pertama dari `stringtok` ke dalam ArrayList `idRest`. Token pertama dianggap sebagai ID restoran.
   - `namaRest.add(stringtok.nextToken());`: Menyimpan token kedua dari `stringtok` ke dalam ArrayList `namaRest`. Token kedua dianggap sebagai nama restoran.
   - `alamatRest.add(stringtok.nextToken());`: Menyimpan token ketiga dari `stringtok` ke dalam ArrayList `alamatRest`. Token ketiga dianggap sebagai alamat restoran.

Dengan demikian, setiap elemen dalam `restoList` akan dipisahkan menjadi ID restoran, nama restoran, dan alamat restoran menggunakan objek StringTokenizer, dan data tersebut akan disimpan dalam tiga ArrayList yang terpisah, yaitu `idRest`, `namaRest`, dan `alamatRest`. Tujuan dari kode ini adalah untuk mengambil informasi mengenai restoran dari `restoList` dan menyimpannya dalam tiga ArrayList yang berbeda, sehingga informasi tersebut dapat ditampilkan atau digunakan dalam bagian selanjutnya dari program.

![image](https://user-images.githubusercontent.com/113997689/232712445-6e653402-d5a6-4fef-82f4-fd034a56566f.png)

Kode di atas merupakan suatu loop untuk menampilkan informasi tentang restoran yang ada, termasuk ID restoran, nama restoran, alamat restoran, dan daftar menu yang tersedia untuk setiap restoran. Berikut adalah penjelasan lebih rinci tentang kode tersebut:

1. Looping:
   - `for (int j = 0; j < idRest.size(); j++) {`: Menggunakan looping `for` untuk mengiterasi setiap elemen dalam `idRest`, yang merupakan objek ArrayList yang menyimpan daftar ID restoran. Looping ini akan berjalan sebanyak jumlah elemen yang ada dalam `idRest`, yang mengindikasikan jumlah restoran yang ada.

2. Menampilkan Informasi Restoran:
   - `System.out.print("Index: ");`: Menampilkan label "Index: " tanpa karakter baru (new line).
   - `System.out.println(j);`: Menampilkan nilai variabel `j` sebagai indeks restoran, diikuti dengan karakter baru (new line).
   - `System.out.print("Id Resto: ");`: Menampilkan label "Id Resto: " tanpa karakter baru (new line).
   - `System.out.println(idRest.toArray()[j].toString().replace("[", "").replace("]", ""));`: Menampilkan ID restoran yang tersimpan dalam ArrayList `idRest` menggunakan indeks `j`. Menggunakan `toArray()` dan `toString()` untuk mengonversi elemen dalam `idRest` menjadi string, dan kemudian menghapus karakter "[" dan "]" dari string tersebut menggunakan `replace("[", "")` dan `replace("]", "")`.
   - `System.out.print("Nama Resto: ");`: Menampilkan label "Nama Resto: " tanpa karakter baru (new line).
   - `System.out.println(namaRest.toArray()[j].toString().replace("[", "").replace("]", ""));`: Menampilkan nama restoran yang tersimpan dalam ArrayList `namaRest` menggunakan indeks `j`. Menggunakan `toArray()` dan `toString()` untuk mengonversi elemen dalam `namaRest` menjadi string, dan kemudian menghapus karakter "[" dan "]" dari string tersebut menggunakan `replace("[", "")` dan `replace("]", "")`.
   - `System.out.print("Alamat Resto: ");`: Menampilkan label "Alamat Resto: " tanpa karakter baru (new line).
   - `System.out.println(alamatRest.toArray()[j].toString().replace("[", "").replace("]", ""));`: Menampilkan alamat restoran yang tersimpan dalam ArrayList `alamatRest` menggunakan indeks `j`. Menggunakan `toArray()` dan `toString()` untuk mengonversi elemen dalam `alamatRest` menjadi string, dan kemudian menghapus karakter "[" dan "]" dari string tersebut menggunakan `replace("[", "")` dan `replace("]", "")`.

3. Memanggil Fungsi `showMenu()`:
   - `showMenu(idRest.get(j));`: Memanggil fungsi `showMenu()` dengan argumen `idRest.get(j)`, yang mengambil ID restoran dari ArrayList `idRest` menggunakan indeks `j`. Fungsi `showMenu()` kemungkinan merupakan suatu bagian lain dalam program yang bertanggung jawab untuk menampilkan daftar menu yang tersedia untuk restoran tertentu berdasarkan ID restoran yang diberikan.

Dengan demikian, loop ini akan menampilkan informasi tentang setiap restoran, termasuk ID restoran, nama restoran, alamat restoran, dan daftar menu yang tersedia untuk setiap restoran berdasarkan data yang tersimpan dalam ArrayList.

![image](https://user-images.githubusercontent.com/113997689/232712967-297fa07e-ae30-4ed9-90ea-a073fc4479a2.png)

Kode di atas merupakan suatu fungsi dalam suatu program yang bertujuan untuk menampilkan menu-menu dari sebuah restoran berdasarkan ID restoran yang diberikan sebagai parameter. Berikut adalah penjelasan lebih rinci tentang kode tersebut:

1. Fungsi `showMenu()`:
   - `public static void showMenu(String idResto) {`: Mendefinisikan sebuah fungsi bernama `showMenu()` dengan tipe pengembalian `void` (tidak mengembalikan nilai) dan menerima satu parameter bertipe `String` yang disebut `idResto`, yang akan digunakan untuk mengidentifikasi restoran yang akan ditampilkan menu-menunya.

2. Looping:
   - `for (int i = 0; i < menuList.size(); i++) {`: Menggunakan looping `for` untuk mengiterasi setiap elemen dalam `menuList`, yang kemungkinan merupakan suatu objek ArrayList atau list yang menyimpan daftar menu-menu restoran.
   
3. Parsing Data Menu:
   - `stringtok = new StringTokenizer(menuList.toArray()[i].toString().replace("[", "").replace("]", ""), ",");`: Menggunakan objek `StringTokenizer` untuk mem-parsing data menu yang ada dalam `menuList`. `menuList.toArray()[i]` mengakses elemen menu pada indeks `i` dalam `menuList`, kemudian menggunakan `toString()` untuk mengonversi elemen tersebut menjadi string. `replace("[", "").replace("]", "")` digunakan untuk menghapus karakter "[" dan "]" dari string tersebut agar hanya sisa data menu yang terpisah oleh koma (",").
   
4. Memeriksa ID Restoran:
   - `if (idResto.equals(stringtok.nextToken())) {`: Menggunakan `equals()` untuk memeriksa apakah `idResto` yang diberikan sama dengan nilai token pertama yang diambil dari `StringTokenizer` (`stringtok.nextToken()`), yang seharusnya berisi ID restoran pada data menu yang sedang diperiksa. Jika kedua nilai ID sama, maka blok kode di dalam if akan dijalankan.
   
5. Menampilkan Informasi Menu:
   - `System.out.print("Id Menu: ");`: Menampilkan label "Id Menu: " tanpa karakter baru (new line).
   - `System.out.println(stringtok.nextToken());`: Menampilkan nilai token kedua yang diambil dari `StringTokenizer`, yang seharusnya berisi ID menu pada data menu yang sedang diperiksa.
   - `System.out.print("Nama Menu: ");`: Menampilkan label "Nama Menu: " tanpa karakter baru (new line).
   - `System.out.println(stringtok.nextToken());`: Menampilkan nilai token ketiga yang diambil dari `StringTokenizer`, yang seharusnya berisi nama menu pada data menu yang sedang diperiksa.
   - `System.out.print("Harga Menu: ");`: Menampilkan label "Harga Menu: " tanpa karakter baru (new line).
   - `System.out.println(stringtok.nextToken());`: Menampilkan nilai token keempat yang diambil dari `StringTokenizer`, yang seharusnya berisi harga menu pada data menu yang sedang diperiksa.
   - `System.out.println("========================================================\n");`: Menampilkan karakter garis pemisah sebagai pemisah antara menu-menu yang ditampilkan untuk setiap restoran, untuk memberikan tampilan yang lebih terstruktur dan rapi.
   
![image](https://user-images.githubusercontent.com/113997689/232713929-0aa365d8-8c73-49f5-a2fa-962e08edc05e.png)

Program di atas merupakan sebuah fungsi dalam sebuah sistem pemesanan makanan di suatu restoran. Fungsi ini digunakan untuk menampilkan daftar pesanan yang ada dalam orderList, yang merupakan suatu list yang berisi data-data pesanan yang telah dibuat sebelumnya.

Berikut adalah penjelasan lebih rinci mengenai bagian-bagian dari fungsi ini:

1. Looping for-each: `for (Object order : orderList)` digunakan untuk melakukan iterasi terhadap setiap elemen dalam orderList. Dalam setiap iterasi, elemen pesanan (order) diambil dan diolah.

2. Mengubah objek menjadi string: `String orderStr = order.toString()` digunakan untuk mengubah objek pesanan menjadi string, sehingga data-data pesanan dapat diakses dengan mudah menggunakan StringTokenizer.

3. StringTokenizer: `StringTokenizer stringtok = new StringTokenizer(orderStr.replace("[", "").replace("]", ""), ",")` digunakan untuk memecah string pesanan menjadi token-token yang dipisahkan oleh karakter koma (','). String pesanan dihilangkan tanda kurung siku ('[' dan ']') yang tidak diperlukan agar hanya data-data pesanan yang diakses.

4. Menampilkan data pesanan: Selanjutnya, data-data pesanan seperti jarak antara pelanggan dengan restoran, id restoran, id menu yang dipesan, kuantitas pesanan, dan total harga pesanan ditampilkan menggunakan System.out.print() dan System.out.println().

5. Menampilkan jumlah pesanan: Terakhir, jumlah total pesanan (orderList.size()) ditampilkan sebagai informasi tambahan.

![image](https://user-images.githubusercontent.com/113997689/232714899-fcab10c4-2f26-48fe-9674-44081a70d546.png)

Program di atas merupakan suatu fungsi dalam sistem pemesanan makanan di restoran. Fungsi ini bertujuan untuk menambahkan pesanan baru ke dalam sistem. Berikut adalah penjelasan lebih rinci mengenai bagian-bagian dari fungsi ini:

1. Mengambil jarak secara acak: `int jarak = (int) (Math.random()*3) + 2` digunakan untuk menghasilkan angka acak antara 2 dan 4 (inklusif) sebagai representasi jarak antara pelanggan dengan restoran. Angka ini dihasilkan menggunakan fungsi `Math.random()` yang menghasilkan angka acak antara 0 dan 1, kemudian dikalikan dengan 3, ditambahkan 2, dan dikonversi menjadi tipe data integer (int) untuk mendapatkan angka acak antara 2 dan 4.

2. Meminta input id resto dari user: `System.out.print("Masukan id resto: ");` dan `Scanner input = new Scanner(System.in);` digunakan untuk menampilkan pesan kepada pengguna untuk memasukkan id resto yang ingin dipesan. Kemudian, `Scanner` digunakan untuk mengambil input dari pengguna dan menyimpannya dalam variabel lokal `idResto`.

3. Menampilkan daftar menu yang tersedia untuk resto tertentu: `showMenu(idResto);` digunakan untuk memanggil fungsi `showMenu()` yang telah didefinisikan sebelumnya, dengan argumen idResto yang telah diinputkan oleh pengguna. Fungsi `showMenu()` akan menampilkan daftar menu yang tersedia untuk restoran dengan id yang sesuai.

4. Inisialisasi variabel untuk menyimpan informasi menu yang dipesan: `int[] harga`, `int[] sub_total`, `int[] kuantitas`, `String[] menu`, `String[] id`, dan `String[] id_menu` digunakan untuk menyimpan informasi-informasi terkait pesanan yang akan ditambahkan, seperti harga menu, sub-total harga, kuantitas pesanan, nama menu, id pesanan, dan id menu yang dipesan. Variabel `total` digunakan untuk menyimpan total harga dari seluruh pesanan yang akan ditambahkan.

![image](https://user-images.githubusercontent.com/113997689/232715477-fa7a3f0b-1e28-4a34-adea-a775bcfc1354.png)

Program di atas merupakan bagian dari proses pemesanan dalam sistem pemesanan makanan di restoran. Bagian ini bertujuan untuk mengambil informasi harga, nama, dan id menu yang tersedia untuk restoran tertentu dari `menuList`. Berikut adalah penjelasan lebih rinci mengenai bagian-bagian dari program ini:

1. `StringTokenizer stringtok = null;` digunakan untuk mendeklarasikan objek `StringTokenizer` dengan nama variabel `stringtok` dan diinisialisasi dengan nilai `null`. Objek `StringTokenizer` digunakan untuk memisahkan string menjadi token-token yang dipisahkan oleh suatu delimiter.

2. `for (int i = 0; i < menuList.size(); i++) { ... }` digunakan untuk melakukan iterasi terhadap `menuList`, yang merupakan daftar menu yang tersedia dalam sistem. `menuList` adalah suatu koleksi atau list yang berisi informasi mengenai menu-menu yang tersedia, seperti id restoran, id menu, nama menu, dan harga menu.

3. `stringtok = new StringTokenizer(menuList.get(i).toString().replace("[", "").replace("]", ""), ",");` digunakan untuk menginisialisasi objek `stringtok` dengan string yang diperoleh dari `menuList` pada indeks i. String ini kemudian dihilangkan tanda kurung siku ([ dan ]) menggunakan metode `replace()` untuk menghapus karakter "[" dan "]" dari string, dan dipecah menjadi token-token yang dipisahkan oleh tanda koma (",") menggunakan objek `StringTokenizer`.

4. `if (idResto.equals(stringtok.nextToken())) { ... }` digunakan untuk membandingkan id restoran yang diinputkan oleh pengguna (`idResto`) dengan token pertama yang diperoleh dari `stringtok`, yang merupakan id restoran dari menu yang sedang diiterasi. Jika kedua id restoran tersebut sama, maka informasi menu seperti id, nama, dan harga akan diambil dari token-token selanjutnya menggunakan metode `nextToken()` dan disimpan dalam variabel `id`, `menu`, dan `harga` pada indeks yang sama dengan indeks iterasi saat ini.

5. `id[i] = stringtok.nextToken().trim();`, `menu[i] = stringtok.nextToken().trim();`, dan `harga[i] = Integer.parseInt(stringtok.nextToken().trim());` digunakan untuk menyimpan informasi menu yang ditemukan dari `menuList` ke dalam variabel `id`, `menu`, dan `harga` pada indeks yang sama dengan indeks iterasi saat ini (`i`). Metode `trim()` digunakan untuk menghapus spasi di awal dan akhir string, dan `Integer.parseInt()` digunakan untuk mengubah string harga menjadi tipe data integer.

Dengan demikian, bagian ini mengambil informasi harga, nama, dan id menu yang tersedia untuk restoran tertentu dari `menuList` dan menyimpannya dalam variabel-variabel terkait, sehingga informasi ini dapat digunakan dalam proses selanjutnya dalam sistem pemesanan makanan.

![image](https://user-images.githubusercontent.com/113997689/232715771-57b6a3a7-2549-420a-ba1c-6982500b46bb.png)

Program ini adalah bagian dari proses pemesanan dalam suatu sistem yang menerima input pesanan dari pengguna. Berikut adalah penjelasan dari program ini:

1. Mengambil input jumlah pesanan dari pengguna dengan menggunakan `System.out.print("Banyak Pesanan: ");` untuk menampilkan pesan ke layar agar pengguna memasukkan jumlah pesanan yang diinginkan, dan `int banyak = Integer.parseInt(input.nextLine());` untuk mengambil input angka jumlah pesanan yang dimasukkan oleh pengguna.

2. Membaca input id menu, kuantitas, dan menghitung sub total harga pesanan untuk setiap pesanan yang dimasukkan oleh pengguna. Loop `for (int i = 0; i < banyak; i++)` digunakan untuk mengulangi proses pemasukan data pesanan sebanyak jumlah pesanan yang diinputkan oleh pengguna.

3. Di dalam loop, program menggunakan `System.out.print("Masukkan id menu: ");` untuk menampilkan pesan ke layar agar pengguna memasukkan id menu yang diinginkan, dan `id_menu[i] = input.nextLine();` untuk mengambil input id menu yang dimasukkan oleh pengguna dan menyimpannya dalam array `id_menu` pada indeks ke-i.

4. Program selanjutnya menggunakan `System.out.print("Kuantitas: ");` untuk menampilkan pesan ke layar agar pengguna memasukkan kuantitas pesanan yang diinginkan, dan `kuantitas[i] = Integer.parseInt(input.nextLine());` untuk mengambil input kuantitas pesanan yang dimasukkan oleh pengguna dan menyimpannya dalam array `kuantitas` pada indeks ke-i.

5. Setelah itu, program menggunakan variabel boolean `menuFound` untuk melakukan pencarian id menu yang sesuai dengan id yang dimasukkan oleh pengguna dalam array `menuList`. Loop `for (int j = 0; j < menuList.size(); j++)` digunakan untuk mengulangi pencarian menu dalam `menuList`.

6. Di dalam loop pencarian, program menggunakan `StringTokenizer` untuk memisahkan data menu dalam `menuList` yang dipisahkan oleh tanda koma (',') dan mengambil nilai id, nama, dan harga menu yang ada. Kemudian, program membandingkan id menu yang dimasukkan oleh pengguna dengan id menu yang ada dalam `menuList` menggunakan `id_menu[i].equals(currId)`.

7. Jika id menu yang dimasukkan oleh pengguna ditemukan dalam `menuList`, program menghitung sub total harga pesanan untuk menu tersebut dengan mengalikan kuantitas dengan harga menu (`sub_total[i] = kuantitas[i] * currHarga;`) dan menampilkan informasi sub total harga ke layar dengan `System.out.println("Sub Total: " + sub_total[i]);`.

8. Jika id menu yang dimasukkan oleh pengguna tidak ditemukan dalam `menuList`, program akan menampilkan pesan error ke layar dengan `System.out.println("Menu dengan id " + id_menu[i] + " tidak ditemukan.");`.

9. Setelah itu, program akan menambahkan informasi pesanan ke dalam `orderList` menggunakan `orderList.add(Arrays.asList(jarak, idResto, id_menu[i], kuantitas[i], sub_total[i]));`.

10. Program juga menghitung total harga dari seluruh pesanan yang dimasukkan oleh pengguna dengan `total += sub_total[i];`.

11. Setelah loop selesai, program akan menampilkan total harga dari semua pesanan.


















