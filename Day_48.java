package Coding100Day;

import java.util.Scanner;

public class Day_48 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai Pertama = ");
        int a = input.nextInt();
        System.out.print("Masukan Nilai Kedua = ");
        int b = input.nextInt();
        if (a > b) {
            System.out.println("Angka terbesar = " + a);
        } else {
            System.out.println("Angka terbesar adalah = " + b);
        }

    }
}
