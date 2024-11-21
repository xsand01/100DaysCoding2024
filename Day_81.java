package Coding100Day;

import java.util.Scanner;

public class Day_81 {

    public static void main(String[] args) {
        /*Dalam Java, String.valueOf() adalah sebuah metode yang
          digunakan untuk mengonversi berbagai tipe data menjadi string.*/
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Nama : ");
        String a = in.nextLine();
        System.out.print("Masukan Umur : ");
        int b = in.nextInt();
        System.out.print("Masukan Tinggi Badan : ");
        double c = in.nextDouble();

        String d = String.valueOf(b);
        String e = String.valueOf(c);

        System.out.println("Halo " + a + ", anda berumur " + d + " tahun, dan tinggi badan anda adalah " + e + "cm");

    }

}
