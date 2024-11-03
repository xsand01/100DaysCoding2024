package Coding100Day;

import java.util.Scanner;

public class Day_63 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan angka pertama = ");
        int a = in.nextInt();
        System.out.print("Masukan angka kedua = ");
        int b = in.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Bilangan Ganjil = " + i);
            
        }
    }
}
