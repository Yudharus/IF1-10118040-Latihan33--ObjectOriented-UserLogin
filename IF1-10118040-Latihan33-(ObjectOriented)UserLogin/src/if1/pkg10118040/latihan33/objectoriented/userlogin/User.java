/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118040.latihan33.objectoriented.userlogin;

/**
 *
 * @author asus
 * NAMA     : Moch Yudha Rusdian
 * KELAS    : IF-1
 * NIM      : 10118040
 * Deskripsi Program : Program ini untuk membuat data akun.
 */
public class User {
     private static String username;
    private static String password;
    private boolean statusAkun;

    private boolean cekAkun(String parUserName, String parPassword){
        username = "TiasGT";
        password = "TGT";
        if (parPassword.equals(password) && parUserName.equals(username)) {
            statusAkun = true;
        } else {
            statusAkun = false;
        }
        return statusAkun;
    }

    private void hasilLogin(boolean status, String parUserName){
        if (status==true) {
            System.out.println("\n******HALLO "+parUserName.toUpperCase()+"******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }else {
            System.out.println("\nOoops, Username atau Password anda salah");
        }
    }

    public void pengecekkanLogin(String parUserName, String parPassword){
        cekAkun(parUserName,parPassword);
        hasilLogin(statusAkun,parUserName);
    }

}
