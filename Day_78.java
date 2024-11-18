package Coding100Day;

import java.util.Scanner;

public class Day_78 {

    // String Method : equalsIgnoreCase() 
    /*Metode equalsIgnoreCase() pada Java adalah salah satu metode bawaan dari kelas String yang digunakan
    untuk membandingkan dua string tanpa memperhatikan perbedaan antara huruf besar dan huruf kecil. 
    Dengan kata lain, perbandingan yang dilakukan metode ini bersifat case-insensitive.*/

 /*soal : 
    Buat program
1. Minta inputan jari jari lingkaran
2. Jika jari jari = 7, nilai phi = 22/7, jika tidak maka nilai phi = 3.14
3. Kemudian program akan meminta inputan lagi, jika yang di input adalah "lingkaran" maka program 
    akan memproses rumus lingkaran (phi*1/4*diameter²) dan memprint hasilnya. 
    Jika yang di input adalah "luas" maka program akan menjalankan rumus lingkaran (phi*r²) dan memprint hasilnya, 
    dan jika tidak keduanya maka program berhenti.*/
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai jari jari lingkaran : ");
        double r = in.nextDouble();
        Double phi = (r == 7) ? 22.0 / 7 : 3.14;
        {
            System.out.println("Phi = " + phi);
        }
        System.out.print("Masukan yang ingin anda hitung = ");
        String a = in.next();
        if ("lingkaran".equalsIgnoreCase(a)) {
            double diameter = 2 * r;
            double hasil = phi * 1 / 4 * diameter * diameter;
            System.out.println("Hasil dari menghitung lingkaran = " + hasil);
        } else if ("luas".equalsIgnoreCase(a)) {
            double hasil = phi * r * r;
            System.out.println("Hasil dari menghitung luas = " + hasil);
        } else {
            System.out.println("input tidak di kenali,program berhenti");

        }
    }

}
