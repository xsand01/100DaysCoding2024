package Coding100Day;

import java.util.Scanner;

public class Day_49 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama Siswa = ");
        String nama = input.nextLine();
        System.out.print("Masukan Nilai Siswa = ");
        int a = input.nextInt();
        System.out.print("Masukan Nilai KKM = ");
        int kkm = input.nextInt();
        System.out.println("=================================================================");
        if (a >= kkm) {
            System.out.println("Siswa atas nama " + nama + " Di nyatakan lulus ujian ");
        } else if (a < kkm) {
            System.out.println("Siswa atas nama " + nama + " Di nyatakan tidak lulus ujian ");
        }

    }

}
