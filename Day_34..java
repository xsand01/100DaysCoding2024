package Coding100Day;

import java.util.Scanner;

public class Day_34 {

    public static void main(String[] args) {
        //Input dari keyboard (Scanner)

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama = ");
        String nama = input.nextLine();
        System.out.print("Masukan Umur = ");
        int umur = input.nextInt();
        System.out.print("Masukan Tinggi Badan = ");
        double tb = input.nextDouble();
        System.out.print("Masukan Berat Badan = ");
        double bb = input.nextDouble();
        System.out.println("===================================================");
        System.out.println("Nama " + nama + " berumur " + umur + " Tahun memiliki tinggi badan " + tb + " cm " + " dan memiliki Berat Badan " + bb + " kg ");

    }
}
  
