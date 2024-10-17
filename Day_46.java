package Coding100Day;

import java.util.Scanner;

public class Day_46 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai (true/false)");
        System.out.println("=================================");
        System.out.print("Apakah hari ini sedang hujan = ");
        boolean a = input.nextBoolean();
        boolean hasil = !a;
        System.out.println("Apakah kita boleh keluar rumah = " + hasil);
        

    }
}
