package Coding100Day;

import java.util.Scanner;

public class Day_52 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama Siswa = ");
        String nama = input.nextLine();
        System.out.print("Masukan Nilai Siswa = ");
        int nilai = input.nextInt();
        int kkm = 75;
        String hasil = nilai >= kkm ? "Lulus" : "Tidak Lulus";
        System.out.println("Nilai siswa = " + hasil);
        System.out.println("Siswa atas nama " + nama + " di nyatakan " + hasil);

    }
}
