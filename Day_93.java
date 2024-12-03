package Coding100Day;

public class Day_93 {

    public static void main(String[] args) {
        int n = 5; // Jumlah baris pola

        // Loop untuk setiap baris
        for (int i = 1; i <= n; i++) {
            // Cetak spasi di awal setiap baris
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Cetak bintang di sisi kiri
            System.out.print("*");

            // Cetak spasi di tengah (kecuali baris pertama)
            if (i > 1) {
                for (int j = 1; j < 2 * (i - 1); j++) {
                    System.out.print(" ");
                }
                // Cetak bintang di sisi kanan
                System.out.print("*");
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}
