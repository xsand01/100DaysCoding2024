package Coding100Day;

import java.util.Scanner;

public class Day_97 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan batas angka: ");
        int limit = in.nextInt();
        System.out.print("Bilangan prima dari 2 - " + limit + " = ");
        for (int i = 2; i <= limit; i++) {
            boolean prima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prima = false;

                }
            }
            if (prima == true) {
                System.out.print(i + " ");
            }

        }
        System.out.println("");
    }
}
