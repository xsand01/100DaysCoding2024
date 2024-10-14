package Coding100Day;

import java.util.Scanner;

public class Day_43 {

    public static void main(String[] args) {
        //Operator perbandingan = lebih besar atau sama dengan dan lebih kecil atau sama dengan
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka a = ");
        int a = input.nextInt();
        System.out.print("Masukan angka b = ");
        int b = input.nextInt();
        System.out.println("Apakah a lebih besar atau sama dengan b = " + (a >= b));
        System.out.println("Apakah a lebih kecil atau sama dengan b = " + (a <= b));
    }

}
