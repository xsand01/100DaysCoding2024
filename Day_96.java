package Coding100Day;

public class Day_96 {

    public static void main(String[] args) {
        // Membuat pola segitiga 
        int n = 5;
        // Bagian atas (segitiga atas)
        for (int i = 1; i <= n; i++) {
            // Cetak spasi
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Cetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bagian bawah (segitiga terbalik)
        for (int i = n - 1; i >= 1; i--) {
            // Cetak spasi
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Cetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
