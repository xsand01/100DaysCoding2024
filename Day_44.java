package Coding100Day;

import java.util.Scanner;

public class Day_44 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Masukan nilai true/false pada kolom di bawah ");
        System.out.print("Masukan Nilai a = ");
        boolean a = input.nextBoolean();
        System.out.print("Masukan Nilai b = ");
        boolean b = input.nextBoolean();
        System.out.println("Hasil = " + (a && b));

    }
}
