package Coding100Day;

import java.util.Scanner;

public class Day_56 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Suhu Air = ");

        int a = input.nextInt();
        if (a > 100) {
            System.out.println("Air Mendidih");
        } else if (a > 0 && a <= 100) {
            System.out.println("Air dalam keadaan cair");
        } else if (a <= 0) {
            System.out.println("Air Membeku");
        }
    }
}
