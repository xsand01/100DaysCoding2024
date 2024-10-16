package Coding100Day;

import java.util.Scanner;

public class Day_45 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka pertama = ");
        int a = input.nextInt();
        System.out.print("Masukan angka kedua = ");
        int b = input.nextInt();
        boolean hasil = (a >= 10 || b >= 10);
        System.out.println("Apakah salah satu lebih besar atau sama dengan 10 = " + hasil);

    }

}
