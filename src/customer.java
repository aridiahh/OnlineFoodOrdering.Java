import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class customer {
    static ArrayList<Object> orderList = new ArrayList<Object>();
    static ArrayList<String> idRest, namaRest, alamatRest;
    static ArrayList<Object> restoList = new ArrayList<Object>();
    static ArrayList<Object> menuList = new ArrayList<Object>();

    //untuk dapat melihat daftar resto yang ada
    public static void lihatResto() {
        /*
            looping untuk mengambil setiap elemen
            dari restoList dan memasukkannya ke dalam list
             idRest, namaRest, dan alamatRest
         */
        for (int i = 0; i < restoList.size(); i++) {
            StringTokenizer stringtok = new StringTokenizer(restoList.toArray()[i].toString().replace("[", "").replace("]", ""), ",");
            idRest.add(stringtok.nextToken());
            namaRest.add(stringtok.nextToken());
            alamatRest.add(stringtok.nextToken());
        }

        /*
            looping untuk menampilkan
            idRest, namaRest, alamatRest,
            dan menu untuk setiap restoran
         */
        for (int j = 0; j < idRest.size(); j++) {
            System.out.print("Index: ");
            System.out.println(j);
            System.out.print("Id Resto: ");
            System.out.println(idRest.toArray()[j].toString().replace("[", "").replace("]", ""));
            System.out.print("Nama Resto: ");
            System.out.println(namaRest.toArray()[j].toString().replace("[", "").replace("]", ""));
            System.out.print("Alamat Resto: ");
            System.out.println(alamatRest.toArray()[j].toString().replace("[", "").replace("]", ""));
            //memanggil fungsi showMenu untuk menampilkan daftar menu yang tersedia untuk resto tertentu
            showMenu(idRest.get(j));
        }
    }


    /*
        Untuk menampilkan menu-menu dari sebuah resto.
        Parameter idResto berisi id resto yang akan
        ditampilkan menu-menunya. Fungsi akan mengambil
        elemen dari menuList dan memeriksa apakah idResto
        sama dengan id resto di menu tersebut. Jika sama,
        fungsi akan menampilkan id menu, nama menu, dan
        harga menu.
     */
    public static void showMenu(String idResto) {
        StringTokenizer stringtok = null;
        for (int i = 0; i < menuList.size(); i++) {
            stringtok = new StringTokenizer(menuList.toArray()[i].toString().replace("[", "").replace("]", ""), ",");
            if (idResto.equals(stringtok.nextToken())) {
                System.out.print("Id Menu: ");
                System.out.println(stringtok.nextToken());
                System.out.print("Nama Menu: ");
                System.out.println(stringtok.nextToken());
                System.out.print("Harga Menu: ");
                System.out.println(stringtok.nextToken());
                System.out.println("========================================================\n");
            }
        }
    }

    //fungsi untuk menambah pesanan
    public static void tambahPesanan() {
        //mengambil jarak secara acak
        int jarak = (int) (Math.random()*3) + 2;
        //meminta input id resto dari user
        System.out.print("Masukan id resto: ");
        Scanner input = new Scanner(System.in); // Tambahkan inisialisasi Scanner
        String idResto = input.nextLine(); // Ubah menjadi variabel lokal
        //menampilkan daftar menu yang tersedia untuk resto tertentu
        showMenu(idResto);
        //inisialisasi variabel untuk menyimpan informasi menu yang dipesan
        int[] harga = new int[100];
        int[] sub_total = new int[100];
        int[] kuantitas = new int[100];
        String[] menu = new String[100];
        String[] id = new String[100];
        String[] id_menu = new String[100];
        int total = 0;

        // proses pemesanan
        /*
            mengambil informasi harga, nama, dan id menu
            yang tersedia untuk resto tertentu dari menuList
        */
        StringTokenizer stringtok = null;
        for (int i = 0; i < menuList.size(); i++) {
            stringtok = new StringTokenizer(menuList.get(i).toString().replace("[", "").replace("]", ""), ",");
            if (idResto.equals(stringtok.nextToken())) {
                id[i] = stringtok.nextToken().trim();
                menu[i] = stringtok.nextToken().trim();
                harga[i] = Integer.parseInt(stringtok.nextToken().trim());
            }
        }

        /*
            meminta input id menu dan kuantitas menu
            yang dipesan dari user dan menghitung
            sub-total harga dari pesanan
        */
        System.out.print("Banyak Pesanan: ");
        int banyak = Integer.parseInt(input.nextLine());
        for (int i = 0; i < banyak; i++) {
            System.out.print("Masukkan id menu: ");
            id_menu[i] = input.nextLine();
            System.out.print("Kuantitas: ");
            kuantitas[i] = Integer.parseInt(input.nextLine());
            boolean menuFound = false; // tambahkan variabel boolean untuk mengecek apakah id_menu[i] ditemukan dalam id[]
            for (int j = 0; j < menuList.size(); j++) { // tambahkan loop untuk mencari harga dan nama menu yang sesuai dengan id_menu[i]
                stringtok = new StringTokenizer(menuList.get(j).toString().replace("[", "").replace("]", ""), ",");
                String currId = stringtok.nextToken().trim();
                String currMenu = stringtok.nextToken().trim();
                int currHarga = Integer.parseInt(stringtok.nextToken().trim());
                if (id_menu[i].equals(currId)) {
                    sub_total[i] = kuantitas[i] * currHarga;
                    System.out.println("Sub Total: " + sub_total[i]);
                    menuFound = true; // set menuFound menjadi true jika id_menu[i] ditemukan
                    break; // keluar dari loop karena sudah ditemukan harga dan nama menu yang sesuai
                }
            }
            if (!menuFound) {
                System.out.println("Menu dengan id " + id_menu[i] + " tidak ditemukan."); // tambahkan pesan error jika id_menu[i] tidak ditemukan
            }
            total += sub_total[i];
            //menambahkan informasi pesanan ke dalam orderList
            orderList.add(Arrays.asList(jarak, idResto, id_menu[i], kuantitas[i], sub_total[i]));
        }
        //menampilkan total harga dari pesanan
        System.out.println("Total Pemesanan: " + total);
    }

    // Untuk menampilkan daftar pesanan yang ada
    public static void lihatPesanan() {
        for (Object order : orderList) {
            String orderStr = order.toString();
            StringTokenizer stringtok = new StringTokenizer(orderStr.replace("[", "").replace("]", ""), ",");
            // Menampilkan jarak antara pelanggan dengan restoran
            System.out.print("Jarak: ");
            System.out.println(stringtok.nextToken());
            // Menampilkan id restoran
            System.out.print("Id Resto: ");
            System.out.println(stringtok.nextToken());
            // Menampilkan id menu yang dipesan
            System.out.print("Id Menu: ");
            System.out.println(stringtok.nextToken());
            // Menampilkan kuantitas pesanan
            System.out.print("Kuantitas: ");
            System.out.println(stringtok.nextToken());
            // Menampilkan total harga pesanan
            System.out.print("Total Harga: ");
            System.out.println(stringtok.nextToken());
        }
        // Menampilkan jumlah pesanan
        System.out.println("      Jumlah Pesanan: " + orderList.size());
    }
}
