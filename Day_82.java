package Coding100Day;

import java.util.Scanner;

public class Day_82 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*Math.ceil()
Fungsi: Membulatkan angka ke atas ke bilangan bulat terdekat.
Tipe Kembalian: double.*/
        System.out.println("Math.cheil");
        System.out.println("====================================================");
        System.out.print("Masukan bilangan desimal = ");
        double a = in.nextDouble();
        System.out.println("Hasil dari Math.cheil  = " + Math.ceil(a));

        /*Math.floor()
Fungsi: Membulatkan angka ke bawah ke bilangan bulat terdekat.
Tipe Kembalian: double.
         */
        System.out.println("Math.floor");
        System.out.println("====================================================");
        System.out.print("Masukan bilangan desimal = ");
        double b = in.nextDouble();
        System.out.println("Hasil dari Math.flor = " + Math.floor(b));

        /*Math.round()
Fungsi: Membulatkan angka ke bilangan bulat terdekat (aturan pembulatan biasa).
Tipe Kembalian:
Jika argumen bertipe float, hasilnya bertipe int.
Jika argumen bertipe double, hasilnya bertipe long.
         */
        System.out.println("Math.round");
        System.out.println("====================================================");
        System.out.print("Masukan bilangan Desimal = ");
        float c = in.nextFloat();
        System.out.println("Hasil dari Math.round = " + Math.round(c));

    }

}
