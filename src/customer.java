import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class customer {
    static ArrayList<Object> orderList = new ArrayList<Object>();
    static ArrayList<String> idRest, namaRest, alamatRest;
    // static ArrayList<Integer> hargaMenu;
    static customer showMenuu = new customer();
    static ArrayList<Object> restoList = new ArrayList<Object>();
    static String nama, alamat, idResto;
    static ArrayList<Object> menuList = new ArrayList<Object>();
    static String namaMenu, idMenu;
    static Scanner input = new Scanner(System.in);

    //untuk dapat melihat daftar resto yang ada
    public static void lihatResto() {
        /*
            looping untuk mengambil setiap elemen
            dari restoList dan memasukkannya ke dalam list
             idRest, namaRest, dan alamatRest
         */
        for (int i = 0; i < restoList.size(); i++) {
            StringTokenizer stringtok = new StringTokenizer(
                    restoList.toArray()[i].toString().replace("[", "").replace("]", ""), ",");
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


    //untuk menampilkan menu-menu dari sebuah resto
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

    public static void tambahPesanan() {
        int jarak = (int) (Math.random()*3) + 2;
        System.out.print("Masukan id resto: ");
        idResto = input.nextLine();
        showMenu(idResto);
        int[] harga = new int[100];
        int[] sub_total = new int[100];
        int[] kuantitas = new int[100];
        String[] menu = new String[100];
        String[] id = new String[100];
        String[] id_menu = new String[100];
        int total = 0;
        // proses pemesanan
        StringTokenizer stringtok = null;
        for (int i = 0; i < menuList.size(); i++) {
            stringtok = new StringTokenizer(menuList.toArray()[i].toString().replace("[", "").replace("]", ""), ",");
            if (idResto.equals(stringtok.nextToken())) {
                id[i] = stringtok.nextToken().trim();
                menu[i] = stringtok.nextToken().trim();
                harga[i] = Integer.parseInt(stringtok.nextToken().trim());
            }
        }
        System.out.print("Banyak Pesanan: ");
        int banyak = Integer.parseInt(input.nextLine());
        for (int i = 0; i < banyak; i++) {
            System.out.print("Masukkan id menu: ");
            id_menu[i] = input.nextLine();
            System.out.print("Kuantitas: ");
            kuantitas[i] = Integer.parseInt(input.nextLine());
            if (id_menu[i].equals(id[i])) {
                sub_total[i] = kuantitas[i] * harga[i];
                System.out.println("Sub Total: "+sub_total[i]);
            }
            total += sub_total[i];
            orderList.add(Arrays.asList(jarak, idResto, id_menu[i], kuantitas[i], sub_total[i]));
        }
        System.out.println("Total Pemesanan: " + total);

    }

    //untuk menampilkan daftar pesanan yang ada
    public static void lihatPesanan() {
        StringTokenizer stringtok = null;
        for (int i = 0; i < orderList.size(); i++) {
            stringtok = new StringTokenizer(orderList.toArray()[i].toString().replace("[", "").replace("]", ""), ",");
            //menampilkan jarak antara pelanggan dan restoran
            System.out.print("Jarak: ");
            System.out.println(stringtok.nextToken());
            //menampilkan id restoran
            System.out.print("Id Resto: ");
            System.out.println(stringtok.nextToken());
            //menampilkan id menu yang dipesan
            System.out.print("Id Menu: ");
            System.out.println(stringtok.nextToken());
            //menampilkan kuantitas pesanan
            System.out.print("Kuantitas: ");
            System.out.println(stringtok.nextToken());
            //menampilkan total harga pesanan
            System.out.print("Total Harga: ");
            System.out.println(stringtok.nextToken());
        }
        //menampilkan daftar pesanan dalam bentuk string
        System.out.println(orderList.toString());
        //menampilkan jumlah pesanan
        System.out.println(orderList.size());
    }
}
