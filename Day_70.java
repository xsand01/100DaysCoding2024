package Coding100Day;

import java.util.Scanner;

public class Day_69 {
//Method Parameter

    public static int perkalian(int a, int b) {
        return a * b;

    }

    public static int pembagian(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai a = ");
        int a = in.nextInt();
        System.out.print("Masukan nilai b = ");
        int b = in.nextInt();
        int hasilKali = perkalian(a, b);
        int hasilBagi = pembagian(a, b);
        System.out.println("====================================================");

        System.out.println("Hasil penjumlahan = " + hasilKali + " \n" + "Hasil Pengurangan = " + hasilBagi); // Output: Hasil penjumlahan: 8
    }

}
