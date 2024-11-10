package Coding100Day;

import java.util.Scanner;

public class Day_70 {
//Method Static 

    /*  Static method pada Java adalah metode yang dideklarasikan dengan kata kunci static, 
    sehingga bisa dipanggil tanpa harus membuat objek dari kelas tersebut. 
    Metode ini hanya dapat mengakses variabel dan metode lain yang juga bersifat static dan sering digunakan 
    untuk fungsi yang tidak bergantung pada data spesifik suatu objek, seperti fungsi utility. 
    Contoh umum static method adalah metode main dalam Java, yang memungkinkan
    program dijalankan langsung oleh Java Virtual Machine (JVM) tanpa membuat objek.
     */
    public static int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan angka untuk menentukan sisa bagi nya");
        System.out.println("=============================================");
        System.out.print("Masukan angka pertama = ");
        int a = in.nextInt();
        System.out.print("Masukan angka kedua = ");
        int b = in.nextInt();

        int hasil = modulus(a, b);
        System.out.println("==============================================");
        System.out.println("Sisa bagi dari " + a + " dan " + b + " adalah = " + hasil);
    }

}
