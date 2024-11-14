package Coding100Day;

import java.util.Scanner;

public class Day_74 {

    public static void main(String[] args) {
        /*
        Dalam Java, string method length() adalah metode bawaan yang digunakan untuk mengetahui panjang suatu string, 
        yaitu jumlah karakter yang ada di dalamnya, termasuk spasi, angka, dan simbol.
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Buatlah akun pribadi anda");
        System.out.println("====================================================");
        System.out.print("Buat username = ");
        String user = in.nextLine();
        String pass;
        while (true) {
            System.out.print("Buat password (min. 8 karakter) = ");
            pass = in.nextLine();

            if (pass.length() > 7) {
                System.out.println("====================================================");
                System.out.println("akun berhasil di buat");
                break;
            } else if (pass.length() < 8) {
                System.out.println("pembuatan akun gagal,ikuti petunjuk");
                System.out.println("====================================================");
            }

        }
        System.out.println("Masukan ulang akun anda untuk login");
        System.out.println("====================================================");
        while (true) {
            System.out.print("Masukan username = ");
            String u = in.nextLine();
            System.out.print("Masukan password = ");
            String p = in.nextLine();

            if (u.equals(user) && p.equals(pass)) {
                System.out.println("====================================================");
                System.out.println("Anda berhasil login");
                System.out.println("====================================================");
                break;
            } else {
                System.out.println("====================================================");
                System.out.println("Akun yang anda masukan tidak valid,silahkan login ulang");
                System.out.println("====================================================");

            }
        }
    }
}
