package Coding100Day;

import java.util.Scanner;

public class Day_98 {

    public static void main(String[] args) {
        // Day 98 
        //Total penjumlahan bilangan genap dari x ke y 
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai awal = ");
        int a = in.nextInt();
        System.out.print("Masukan nilai batas = ");
        int b = in.nextInt();
        int tam = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                tam += i;
            }

        }
        System.out.println("Hasil = " + tam);
    }
}
