package Coding100Day;

import java.util.Scanner;

public class Day_99 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("===============KALKULATOR SEDERHANA===============");
        System.out.println("==================================================");
        System.out.print("Masukan angka pertama = ");
        int a = in.nextInt();
        System.out.println("Masukan operasi yang ingin anda pilih");
        System.out.print("| + | - | x | / | % | =  ");
        String op = in.next();
        System.out.print("Masukan angka kedua = ");
        int b = in.nextInt();

        if (op.equalsIgnoreCase("+")) {
            int hasil = a + b;
            System.out.println("Hasil : " + hasil);
        } else if (op.equalsIgnoreCase("-")) {
            int hasil = a - b;
            System.out.println("Hasil : " + hasil);
        } else if (op.equalsIgnoreCase("x")) {
            int hasil = a * b;
            System.out.println("Hasil : " + hasil);
        } else if (op.equalsIgnoreCase("/")) {
            int hasil = a / b;
            System.out.println("Hasil : " + hasil);
        } else if (op.equalsIgnoreCase("%")) {
            int hasil = a % b;
            System.out.println("Hasil : " + hasil);
        } else {
            System.out.println("invalid input");

        }
    }

}
