package Coding100Day;

import java.util.Scanner;

public class Day_62 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("======================================");
            System.out.print("Masukan Angka Negatif untuk berhenti = ");
            int angka = in.nextInt();

            if (angka < 0) {

                System.out.println("Anda memasukan angka negatif(program di hentikan)");
                System.out.println("======================================");
                break;
            } else if (angka == 0) {
                System.out.println("Anda memasukan angka nol");
            } else {
                System.out.println("Anda memasukan angka positif = " + angka);
            }

        }
    }
}
