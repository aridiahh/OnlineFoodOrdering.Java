import java.util.ArrayList;

public class User {
    //deklarasi atribut
    private String username, password, status;
    private String username_cust, password_cust;
    static cls clearScreen = new cls();
    //static menuLogin loginn = new menuLogin();
    //static menuLogin menuu = new menuLogin();
    static ArrayList<String> idRest, namaRest, alamatRest;
    //Getter dan setter untuk atribut username_cust
    public String getUsername_cust() {
        return username_cust;
    }

    public void setUsername_cust(String username_cust) {
        this.username_cust = username_cust;
    }

    //Getter dan setter untuk atribut password_cust
    public String getPassword_cust() {
        return password_cust;
    }

    public void setPassword_cust(String password_cust) {
        this.password_cust = password_cust;
    }

    //Getter dan setter untuk atribut username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //Getter dan setter untuk atribut password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Getter dan setter untuk atribut status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static void main(String[] args) {
        idRest = new ArrayList<>();
        namaRest = new ArrayList<>();
        alamatRest = new ArrayList<>();
        //idRestMen = new ArrayList<>();
        //namaMenu2 = new ArrayList<>();
        //hargaMenu = new ArrayList<>();
        //idMenu2 = new ArrayList<>();

        if (menuLogin.login()) {
            while (true) {
                menuLogin.menu();
            }
        } else {
            System.out.println("Username atau Password yang Diinputkan Salah!");
        }
    }
}