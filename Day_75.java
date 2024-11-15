package Coding100Day;

import java.util.Scanner;

public class Day_75 {

    /*
    Metode toLowerCase() di Java mengubah semua huruf dalam string menjadi huruf kecil. 
    Metode ini mengembalikan salinan baru dari string tanpa mengubah string aslinya.
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Kalimat = ");
        String a = in.nextLine();

        String b = a.toLowerCase();
        System.out.println("Setelah di ubah ke huruf kecil = " + b);

    }
}
