package Coding100Day;

import java.util.Scanner;

public class Day_95 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Membuat segituga siku dan sebaliknya 
        System.out.print("Masukan bilangan bulat untuk menentukan ukuran segitiga siku = ");
        int u = in.nextInt();
        System.out.println("");
        System.out.println("(Segitiga siku-siku)");
        System.out.println("");
        for (int i = 0; i < u; i++) {
            System.out.print("* ");
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");
        }
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("(sebaliknya)");
        System.out.println("");
        for (int j = u; j > 0; j--) {
            System.out.print("* ");
            for (int k = j; k > 1; k--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
