package Coding100Day;

import java.util.Scanner;

public class Day_40 {

    //Operator Perbandigan = lebih besar dan lebih kecil
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka a = ");
        int a = input.nextInt();
        System.out.print("Masukan angka b = ");
        int b = input.nextInt();
        System.out.println("Apakah a lebih besar dari b = " + (a > b));
        System.out.println("Apakah a kebih kecil dari b = " + (a < b));

    }
}
