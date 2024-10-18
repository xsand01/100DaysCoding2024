package Coding100Day;

import java.util.Scanner;

public class Day_47 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int kkm = 75;
        System.out.println(" Nilai KKM sebagai syarat tidak mengulang adalah " + kkm);
        System.out.println("====================================================");
        System.out.print("Masukan nama siswa = ");
        String nama = input.nextLine();
        System.out.print("Masukan Nilai Siswa = ");
        int a = input.nextInt();
        
        if (a >= kkm) {
            System.out.println("Siswa atas nama " + nama + " di nyatakan lulus ");

        }
        System.out.println("====================================================");
        boolean b = a < kkm;
        System.out.println("Apakah siswa tersebut mengulang = " + b);
        System.out.println("====================================================");
    }

}
