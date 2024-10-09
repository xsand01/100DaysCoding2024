package Coding100Day;

import java.util.Scanner;

public class Day_38 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Perkalian");
        System.out.println("================================");
        System.out.print("Masukan angka a = ");
        int a = input.nextInt();
        System.out.print("Masukan angka b = ");
        int b = input.nextInt();
        a *= b;
        System.out.println("Hasil perkalian = " + a);

        System.out.println("================================");
        System.out.println("Pembagian");
        System.out.println("================================");
        System.out.print("Masukan angka a = ");
        int angka1 = input.nextInt();
        System.out.print("Masukan angka b = ");
        int angka2 = input.nextInt();
        angka1 /= angka2;
        System.out.println("Hasil Pembagian = "+angka1);

    }
}

