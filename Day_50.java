package Coding100Day;

import java.util.Scanner;

public class Day_50 {

    public static void main(String[] args) {
        //Percabangan = if - else if - else
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Total Belanja anda = ");
        int total = input.nextInt();
        if (total >= 100000) {
            int diskon = total * 20 / 100;
            total -= diskon;
            System.out.println("================================");
            System.out.println("Anda mendapat diskon 20%");
        } else if (total >= 50000) {
            int diskon = total * 10 / 100;
            total -= diskon;
            System.out.println("================================");
            System.out.println("Anda mendapatkan diskon 10%");
        } else {
            System.out.println("================================");
            System.out.println("Anda tidak mendapatkan diskon");
        }
        System.out.println("================================");
        System.out.println("Total yang anda bayar = Rp" + total);

    }

}
