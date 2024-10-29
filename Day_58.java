package Coding100Day;

import java.util.Scanner;

public class Day_58 {

    //Looping : while Decrement 
    /*
    Looping while dengan decrement di Java berarti melakukan perulangan sambil mengurangi 
    nilai variabel setiap kali iterasi berlangsung hingga kondisi berhenti terpenuhi
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka Pertama(terbesar > terkecil) = ");
        int a = input.nextInt();
        System.out.print("Masukan Angka Batas = ");
        int b = input.nextInt();
        while (a >= b) {
            System.out.println(a);
            a--;

        }

    }
}
