package Coding100Day;

import java.util.Scanner;

public class Day_42 {

    public static void main(String[] args) {
        //Operator perbandingan = sama dengan dan tidak sama dengan
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka a = ");
        int a = input.nextInt();
        System.out.print("Masukan Angka b = ");
        int b = input.nextInt();
        //Sama Dengan
        System.out.println(" Apakah sama dengan = " + (a == b));
        //Tidak Sama Dengan 
        System.out.println(" Apakah tidak sama dengan = " + (a != b));
    }
}
