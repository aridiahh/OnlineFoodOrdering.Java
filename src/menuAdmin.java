import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class menuAdmin {
    //static customer showMenuu = new customer();
    static Scanner input = new Scanner(System.in);
    static ArrayList<Object> restoList = new ArrayList<Object>();
    static ArrayList<Object> menuList = new ArrayList<Object>();
    static String nama, alamat, idResto, idMenu, namaMenu, harga;

    //untuk menampilkan daftar resto beserta menu yang tersedia
    public static void lihatResto() {
        idRest = new ArrayList<>();
        namaRest = new ArrayList<>();
        alamatRest = new ArrayList<>();
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
            System.out.println("===========================================================");
            System.out.println("|                                                          |");
            System.out.print("   Index: ");
            System.out.println(j);
            System.out.print("   Id Resto: ");
            System.out.println(idRest.toArray()[j].toString().replace("[", "").replace("]", ""));
            System.out.print("   Nama Resto: ");
            System.out.println(namaRest.toArray()[j].toString().replace("[", "").replace("]", ""));
            System.out.print("   Alamat Resto: ");
            System.out.println(alamatRest.toArray()[j].toString().replace("[", "").replace("]", ""));
            System.out.println("|__________________________________________________________|");
            //memanggil fungsi showMenu untuk menampilkan daftar menu yang tersedia untuk resto tertentu
            customer.showMenu(idRest.get(j));
        }
    }

    //untuk menambahkan restoran baru dan menu-menu didalamnya
    public static void tambahResto() {
        idRest = new ArrayList<>();
        namaRest = new ArrayList<>();
        alamatRest = new ArrayList<>();
        int harga;
        //mengambil input id, nama, alamat resto dari user
        System.out.println("===========================================================");
        System.out.println("|                                                          |");
        System.out.print("   Id Restoran: ");
        idResto = input.nextLine();
        System.out.print("   Nama Restoran: ");
        nama = input.nextLine();
        System.out.print("   Alamat Restoran: ");
        alamat = input.nextLine();
        //mengambil input banyak menu yang akan ditambahkan
        System.out.print("   Banyak Menu: ");
        int banyak = Integer.parseInt(input.nextLine());
        System.out.println("|__________________________________________________________|");
        //melakukan perulangan untuk mengambil input setiap menu
        for (int i = 0; i < banyak; i++) {
            System.out.println("===========================================================");
            System.out.println("|                                                          |");
            System.out.print("   Id Menu: ");
            idMenu = input.nextLine();
            System.out.print("   Nama Menu: ");
            namaMenu = input.nextLine();
            System.out.print("   Harga Menu: ");
            harga = Integer.parseInt(input.nextLine());
            System.out.println("|__________________________________________________________|");
            //menambahkan data menu ke dalam list menuList
            menuList.add(Arrays.asList(idResto, idMenu, namaMenu, harga));

        }
        //menambahkan data resto ke dalam list restoList
        restoList.add(Arrays.asList(idResto, nama, alamat));
    }

    static ArrayList<String> idRest, namaRest, alamatRest;
    static ArrayList<Integer> hargaMenu;

    //untuk menghapus data restoran dari list jika ada data tersimpan didalamnya
    public static void hapusResto() {
        if (restoList.size() > 0) {
            System.out.print("  Masukkan Index Resto: ");
            // cari index, dimulai dari 0
            int index = Integer.parseInt(input.nextLine());
            restoList.remove(index);
            System.out.println("    --Data Telah Terhapus--");
        }
    }
}



