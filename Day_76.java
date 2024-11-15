package Coding100Day;

import java.util.Scanner;

public class Day_76 {

    public static void main(String[] args) {
        /*
        Dalam Java, metode toUpperCase() digunakan untuk mengubah semua huruf dalam sebuah string menjadi huruf kapital. 
        Metode ini tersedia dalam kelas String. Berikut adalah contoh penggunaannya:
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan kalimat untuk mengubahnya menjadi huruf kecil dan besar = ");
        String a = in.nextLine();

        String b = a.toLowerCase(); //mengubah otomatis huruf menjadi kecil
        String c = a.toUpperCase();//mengubah otomatis huruf menjadi kapital

        System.out.println("Huruf kecil = " + b);
        System.out.println("Huruf besar = " + c);

    }
}
