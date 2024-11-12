package Coding100Day;
import java.util.Scanner;
public class Day_72 {
   
       /* Metode rekursif dalam pemrograman adalah metode yang memanggil dirinya sendiri
        untuk menyelesaikan suatu masalah. Metode rekursif biasanya 
        digunakan ketika suatu masalah dapat dipecah menjadi sub-masalah 
        yang lebih kecil dan mirip dengan masalah aslinya.*/ 
  public static int hitungFaktorial(int n) {
        // Kondisi Basis: jika n adalah 0 atau 1, kembalikan 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Panggilan Rekursif: n * faktorial(n - 1)
        return n * hitungFaktorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukan angka untuk di faktorialkan = ");
        int angka = in.nextInt();
        int hasil = hitungFaktorial(angka);
        System.out.println("Faktorial dari " + angka + " adalah: " + hasil);
    }
}
















