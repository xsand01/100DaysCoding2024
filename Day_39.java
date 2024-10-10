package Coding100Day;

import java.util.Scanner;

public class Day_39 {

    public static void main(String[] args) {
        //Operator Penugasan = Pengsian dan Modulus
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai a = ");
        int a = input.nextInt();
        System.out.print("Masukan nilai b = ");
        int b = input.nextInt();
        a %= b;
        System.out.println("Modulus atau Sisa Bagi = " + a);
    }
}
