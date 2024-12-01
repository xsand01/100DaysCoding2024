package Coding100Day;

import java.util.Scanner;

public class Day_91 {

    public static void main(String[] args) {
        /*
        Buatlah program yang dapat menerima inputan bilangan dengan 
        ketentuan sebagai berikut:
        1. Jika nilai yang diinput adalah bilangan genap, maka program akan 
            menampilkan pesan genap dan kemudian meminta user untuk 
            memasukkan kembali angka.
        2. Jika nilai yang diinput adalah ganjil, maka program akan menampilkan 
            pesan “You and I, end” dan tidak menerima inputan angka lagi
        
         */
        Scanner in = new Scanner(System.in);
        int a;
        while (true) {
        System.out.print("Masukan bilangan bulat = ");
        a = in.nextInt();
            if (a % 2 == 1) {
                System.out.println("You and I,end");
                break;
            } else if (a % 2 == 0) {
                System.out.println("genap");
                

            }
        }
    }
}
