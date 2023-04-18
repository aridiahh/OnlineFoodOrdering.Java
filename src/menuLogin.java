import java.util.Scanner;

public class menuLogin {
    static User users = new User();
    static Scanner input = new Scanner(System.in);
    static int pilihan;

    // method login
    public static boolean login() {
        boolean masuk = false;
        //set username dan password yang mana ditujukkan untuk admin
        users.setUsername("admin");
        users.setPassword("admin123");

        //set username dan password yang mana ditujukkan untuk customer
        users.setUsername_cust("customer1");
        users.setPassword_cust("customer456");

        String username, password;
        //meminta agar user untuk memasukkan username dan passwordnya
        System.out.println(" __________________________________________________________");
        System.out.println("|                        L O G I N                         |");
        System.out.println("| Silahkan masukkan username dan password terlebih dahulu. |");
        System.out.println("|==========================================================|");
        System.out.print("  Masukkan username: ");
        username = input.nextLine();
        System.out.print("  Masukkan password: ");
        password = input.nextLine();
        System.out.println("|__________________________________________________________|");

        //memeriksa apakah username dan password yang diinputkan user adalah benar
        if (users.getUsername().equals(username) || users.getUsername_cust().equals(username)) {
            if (users.getPassword().equals(password)) {
                users.setStatus("Admin");
                masuk = true;
            } else if (users.getPassword_cust().equals(password)) {
                users.setStatus("Customer");
                masuk = true;
            }
        }

        //kembalikan nilai apakah user berhasil untuk masuk atau tidaK
        return masuk;
    }

    // Ditampilkan jika users berhasil login
    public static void menu() {
        // Akan tampil jika user adalah admin
        if (users.getStatus().equals("Admin")){
            System.out.println(" __________________________________________________________");
            System.out.println("|                    M E N U  A D M I N                    |");
            System.out.println("|              Silahkan Pilih Opsi Di Bawah Ini.           |");
            System.out.println("|==========================================================|");
            System.out.println("| 1. Lihat Resto                                           |");
            System.out.println("| 2. Tambah Resto                                          |");
            System.out.println("| 3. Hapus Resto                                           |");
            System.out.println("| 4. Kembali ke Login                                      |");
            System.out.println("| 5. Keluar                                                |");
            System.out.println("|__________________________________________________________|");
            System.out.print("  Pilihan(1/2/3/4): ");
            pilihan = Integer.parseInt(input.nextLine());
            if (pilihan == 1) {
                menuAdmin.lihatResto(); //melihat resto apa saja yang ada
            } else if (pilihan == 2) {
                menuAdmin.tambahResto(); //menambahkan resto yang lain (baru)
            } else if (pilihan == 3) {
                menuAdmin.hapusResto(); //menghapus resto yang admin ingin hapus
            } else if (pilihan == 4) {
                login(); //kembali ke menu login
            } else if (pilihan == 5) {
                System.exit(0); //keluar
            } else {
                System.out.println("Username atau Password yang Diinputkan Salah!");
                menu(); //ke menu dari Admin maupun Customer
            }

            // Akan tampil jika user adalah customer
        } else if (users.getStatus().equals("Customer")) {
            System.out.println(" __________________________________________________________");
            System.out.println("|                 M E N U  C U S T O M E R                 |");
            System.out.println("|             Silahkan Pilih Opsi Di Bawah Ini.            |");
            System.out.println("|==========================================================|");
            System.out.println("| 1. Lihat Resto                                           |");
            System.out.println("| 2. Buat Pesanan                                          |");
            System.out.println("| 3. Lihat Pesanan                                         |");
            System.out.println("| 4. Kembali ke Login                                      |");
            System.out.println("| 5. Keluar                                                |");
            System.out.println("|__________________________________________________________|");
            System.out.print("  Pilihan(1/2/3/4/5): ");
            pilihan = Integer.parseInt(input.nextLine());
            if (pilihan == 1) {
                menuAdmin.lihatResto(); //melihat resto apa saja yang ada
            } else if (pilihan == 2) {
                customer.tambahPesanan(); //untuk dapat menambah pesanan
            } else if (pilihan == 3) {
                customer.lihatPesanan(); //melihat pesanan yang disediakan
            } else if (pilihan == 4) {
                login(); //kembali ke menu login
            } else if (pilihan == 5) {
                System.exit(0); //keluar
            } else {
                System.out.println("Username atau Password yang Diinputkan Salah!");
                menu(); //ke menu dari Admin maupun Customer
            }
        }
    }
}