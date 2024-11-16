package Coding100Day;

import java.util.Scanner;

public class Day_77 {

    public static void main(String[] args) {
        /* String Method equals()
        Dalam Java, metode equals pada kelas String digunakan untuk membandingkan isi (konten) dari dua string.
        Metode ini akan mengembalikan nilai true jika kedua string memiliki konten yang sama, dan false jika berbeda.
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Username : ");
        String username = in.nextLine();
        System.out.print("Password : ");
        String password = in.nextLine();

        //Login untuk admin 
        String admin = "admin";
        String pass = "12345";

        //Login untuk pengguna
        String pengguna = "user";
        String passpengguna = "userlogin";

        if (admin.equals(username) && pass.equals(password)) {
            System.out.println("Login berhasil!, selamat datang, admin");
        } else if (pengguna.equals(username) && passpengguna.equals(password)) {
            System.out.println("Login berhasil!, selamat datang, pengguna");
        } else if (admin.equals(username) && !pass.equals(password)) {
            System.out.println("Password untuk admin salah");
        } else {
            System.out.println("Login gagal!, masukan password dan username dengan benar");

        }

    }
}
