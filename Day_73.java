package Coding100Day;

import java.util.Scanner;

public class Day_73 {

    public static void main(String[] args) {
        /*Metode charAt() dalam Java adalah metode bawaan yang digunakan 
        untuk mendapatkan karakter pada indeks tertentu dalam sebuah String. 
        Metode ini mengembalikan karakter berdasarkan posisi indeks yang dimulai
        dari 0 (indeks pertama).
         */
        Scanner in = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.print("Masukan Karakter (String) = ");
        String a = in.nextLine();
        System.out.println("===============================================================");
        System.out.println("Untuk pemanggilan karakter di mulai dari 0 untuk karakter pertama");
        System.out.print("Masukan karakter ke berapa yang mau di panggil = ");
        int b = in.nextInt();
        if (b >= 0 && b < a.length()) {
            char hasil = a.charAt(b);
            System.out.println("===============================================================");
            System.out.println("Karakter ke " + b + " adalah = " + hasil);

        } else {
            System.out.println("===============================================================");
            System.out.println("output yang anda masukan di luar jangkauan");

        }

    }

}
