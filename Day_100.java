package Coding100Day;

import java.time.LocalTime;
import java.util.Scanner;

public class Day_100 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalTime sekarang = LocalTime.now();
        System.out.println("=================================================");
        System.out.print("Masukan Nama Anda = ");
        String nama = in.nextLine();
        System.out.println("=================================================");
        if (sekarang.isBefore(LocalTime.of(12, 0))) {

            System.out.println("Selamat pagi " + nama + " Program anda telah selesai ");
            System.out.println("=================================================");
        } else if (sekarang.isBefore(LocalTime.of(17, 0))) {

            System.out.println("Selamat siang " + nama + " Program anda telah selesai ");
            System.out.println("=================================================");
        } else {

            System.out.println("Selamat malam " + nama + " Program anda telah selesai ");
            System.out.println("=================================================");
        }
    }
}
