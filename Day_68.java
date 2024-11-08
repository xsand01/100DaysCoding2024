package Coding100Day;

import java.util.Scanner;

public class Day_68 {
    // Metode non-void dengan return

    public static int penjumlahan(int a, int b) {
        return a + b;

    }

    public static int pengurangan(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  Day_68 tambah = new Day_68();
        System.out.print("Masukan nilai a = ");
        int a = in.nextInt();
        System.out.print("Masukan nilai b = ");
        int b = in.nextInt();
        int hasilTambah = penjumlahan(a, b);
        int hasilKurang = pengurangan(a, b);
        System.out.println("====================================================");

        System.out.println("Hasil penjumlahan = " + hasilTambah + " \n" + "Hasil Pengurangan = " + hasilKurang); // Output: Hasil penjumlahan: 8
    }
}
