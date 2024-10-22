package Coding100Day;

import java.util.Scanner;

public class Day_51 {

    public static void main(String[] args) {
        //Switch Case
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nomor hari (1-7) = ");
        int a = input.nextInt();

        switch (a) {

            case 1:
                System.out.println(" Hari ini adalah hari senin ");
                break;
            case 2:
                System.out.println(" Hari ini adalah hari selasa ");
                break;
            case 3:
                System.out.println(" Hari ini adalah hari rabu ");
                break;
            case 4:
                System.out.println(" Hari ini adalah hari kamis ");
                break;
            case 5:
                System.out.println(" Hari ini adalah hari jumat ");
                break;
            case 6:
                System.out.println(" Hari ini adalah hari sabtu ");
                break;
            case 7:
                System.out.println(" Hari ini adalah hari minggu ");
                break;

        }

    }
}
