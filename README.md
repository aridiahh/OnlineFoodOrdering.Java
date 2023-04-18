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





















