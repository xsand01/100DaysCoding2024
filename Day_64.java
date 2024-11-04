package Coding100Day;

public class Day_64 {

    public static void main(String[] args) {
        label: // label untuk loop luar
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i + j == 7) {
                    System.out.println("Ditemukan kombinasi: i = " + i + ", j = " + j);
                    break label; // keluar dari kedua loop
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
                System.out.println("Program di hentikan");
    }
}
