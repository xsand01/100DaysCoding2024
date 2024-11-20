package Coding100Day;

public class Day_80 {

    public static void main(String[] args) {
        /*
Metode trim() dalam Java digunakan untuk menghapus spasi (whitespace) yang ada di awal dan akhir sebuah string. 
Namun, metode ini tidak menghapus spasi di tengah-tengah string.*/
        String a = "  Halo Nama Saya Kurnia Sandy  ";
        System.out.println("Sebelum trim : " + a);

        String after = a.trim();
        System.out.println("Setelah trim : " + after);
    }
}
