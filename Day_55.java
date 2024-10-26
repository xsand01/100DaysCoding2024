package Coding100Day;

import java.util.Scanner;

public class Day_55 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Range Angka Menggunakan Decrement(setiap angka di kurang satu/menurun)");
        System.out.print("Masukan Angka awal = ");
        int angka = input.nextInt();
        System.out.print("Masukan Batas Angka = ");
        int b = input.nextInt();

        for (int d = angka; d >= b; d--) {
            System.out.println(" Hasil = " + d);
        }

    }

}
