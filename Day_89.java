package Coding100Day;

import java.util.Scanner;

public class Day_89 {

    public static void main(String[] args) {
        /*
        Soal
1. Buatlah program menggunakan Java dengan ketentuan sebagai berikut:
2. Tanyakan kepada pengguna berapa banyak elemen yang ingin ditambahkan ke dalam array satu dimensi dengan tipe data String.
3. Buat array satu dimensi sesuai dengan jumlah elemen yang dimasukkan oleh pengguna.
4. Minta pengguna untuk mengisi setiap elemen array dengan memasukkan nama-nama teman mereka.
5. Cetak semua elemen array ke layar menggunakan perulangan.
6. Tanyakan kepada pengguna indeks elemen mana yang ingin diubah.
7. Minta pengguna untuk memasukkan nilai baru pada indeks tersebut.
8. Cetak kembali semua elemen array yang sudah diperbarui.

         */
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan elemen yang ingin anda tambahkan ke dalam array = ");
        int jum = in.nextInt();
        in.nextLine();

        String[] ar = new String[jum];
        System.out.println("Masukan nama teman anda =  ");
        for (int i = 0; i < jum; i++) {
            System.out.print((i + 1) + ".");
            ar[i] = in.nextLine();

        }
        for (int i = 0; i < jum; i++) {
            System.out.println("nama mahasiswa ke " + (i + 1) + " = " + ar[i]);

        }
        System.out.println("======================================================");
        System.out.print("Apakah ada yang mau di revisi,kalo ada yang ke berapa = ");
        int rev = in.nextInt();
        in.nextLine();

        System.out.println("Masukan index ganti nya = ");
        String gan = in.nextLine();

        if (rev >= 0 && rev <= ar.length) {
            ar[rev - 1] = gan;

            for (int i = 0; i < jum; i++) {
                System.out.println("Nama mahasiswa ke " + (i + 1) + " = " + ar[i]);

            }
        }
    }
}
