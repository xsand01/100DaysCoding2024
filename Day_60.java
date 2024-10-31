package Coding100Day;

public class Day_60 {

//looping = do_while
/*
    Loop do-while pada Java adalah struktur perulangan yang akan mengeksekusi blok kode terlebih dahulu,
    kemudian memeriksa kondisi di akhir setiap iterasi. Artinya, blok kode dalam do-while setidaknya 
    akan dijalankan sekali, tidak peduli apakah kondisi benar atau salah pada iterasi pertama.
    */
    
    
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println("Angka: " + i);
            i++;
        } while (i <= 5);
    }
}
