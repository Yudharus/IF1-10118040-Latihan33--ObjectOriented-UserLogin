/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118040.latihan33.objectoriented.userlogin;

import java.util.Scanner;

/**
 *
 * @author asus
 * NAMA     : Moch Yudha Rusdian
 * KELAS    : IF-1
 * NIM      : 10118040
 * Deskripsi Program : Program ini untuk membuat data akun.
 */
public class IF110118040Latihan33ObjectOrientedUserLogin {
        private static String usName;
        private static String passWord;
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username = ");
        usName = scn.next();

        System.out.print("Masukkan Password = ");
        passWord = scn.next();

        User cek = new User();
        cek.pengecekkanLogin(usName,passWord);

    }
}
    
 
    

