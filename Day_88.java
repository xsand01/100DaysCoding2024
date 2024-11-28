package Coding100Day;

import java.util.Scanner;

public class Day_88 {

    public static void main(String[] args) {
        /*
        Buat sebuah program menggunakan Java yang melakukan hal-hal berikut:
1. Meminta user untuk menginput jumlah mahasiswa yang ingin didata.
2. Meminta user untuk menginput nama mahasiswa satu per satu sebanyak jumlah yang diinputkan sebelumnya.
3. Menyimpan nama-nama mahasiswa ke dalam array.
4. Menampilkan daftar nama mahasiswa setelah semua data diinputkan.
        
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan jumlah mahasiswa yang ingin di input = ");
        int jumlah = in.nextInt();
        in.nextLine();
        String[] nama = new String[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukan nama mahasiswa ke " + (i + 1) + " = ");
            nama[i] = in.nextLine();
        }
        System.out.println("============================================== ");
        System.out.println("nama mahasiswa yang di input = ");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + "." + nama[i]);

        }

    }
}
