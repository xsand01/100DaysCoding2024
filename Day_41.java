package Coding100Day;

import java.util.Scanner;

public class Day_41 {

    public static void main(String[] args) {
//Evaluasi
        //  1. Cari Keliling lingkaran = p*r*r dan luas lingkaran =  2 * p * r //
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nilai r = ");
        int r = input.nextInt();  //jari-jari

        //Mencari keliling lingkaran
        double keliling = Math.PI * (r * r);
        System.out.println("Keliling = " + keliling);

        //Mencari luas lingkaran
        double luas = 2 * Math.PI * r;
        System.out.println("Luas = " + luas);

        // 2. Buatlah program dari String ke primitif
        Scanner input2 = new Scanner(System.in);
        System.out.print("Masukan nilai String = ");
        String a = input2.nextLine();

        int b = Integer.parseInt(a);
        System.out.println("Nilai konversi = " + b);

        // 3. tipe Casting
        //otomatis
        int angka1 = 12;
        double angka2 = angka1;
        System.out.println("Casting = " + angka2);
        //manual
        double c = 12.12;
        int d = (int) c;
        System.out.println("Casting = " + d);

        // 4. luas dan keliling persegi
        Scanner input3 = new Scanner(System.in);
        System.out.print("Masukan nilai panjang = ");
        int p = input3.nextInt();
        System.out.print("Masukan nilai lebar = ");
        int l = input3.nextInt();

        int Luas = p * l;
        System.out.println("Luas = " + luas);
        int Keliling = 2 * (p + l);
        System.out.println("Keliling = " + Keliling);

    }
}
