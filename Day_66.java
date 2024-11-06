package Coding100Day;

import java.util.Scanner;

public class Day_66 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("PERSEGI(inputkan nilai yang sama pada baris dengan kolom )");
        System.out.print("Masukan Baris = ");
        int baris = in.nextInt();
        System.out.print("Masukan Kolom = ");
        int kolom = in.nextInt();
        System.out.println(" ");
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {

                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("PERSEGI PANJANG (inputkan nilai baris lebih kecil dari pada nilai kolom)");
        System.out.print("Masukan Baris = ");
        int baris1 = in.nextInt();
        System.out.print("Masukan Kolom = ");
        int kolom1 = in.nextInt();
        System.out.println(" ");
        for (int k = 1; k <= baris1; k++) {
            for (int p = 1; p <= kolom1; p++) {
                System.out.print("* ");

            }
            System.out.println(" ");
        }

    }

}
