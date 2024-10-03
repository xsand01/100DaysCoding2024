package Coding100Day;

public class Day_32 {

    public static void main(String[] args) {
        //Mengkonversi tipe data primitf ke tipe data String

        //Metode konversi 1 (Cara paling umum dan aman)
        int angka = 100;
        String konversi = String.valueOf(angka);
        System.out.println("Metode 1 = " + angka);
        
        //Metode konversi 2 (metode serupa untuk tipe lain)
        int angka1 = 101;
        String koversi1 = Integer.toString(angka1);
        System.out.println("Metode 2 = " + angka1);
        
        //Metode konversi 3 
        int angka2 = 102;
        String konversi3 = angka2 + "";
        System.out.println("Metode 3 = " + konversi3);
        
        //Metode konversi 4
        int angka3 = 103;
        String konversi4 = String.format("%d", angka3);
        System.out.println("Metode 4 = " + konversi4);
        
        //Metode konversi 5 (lebih umum di gunakan ketika ingin menggabungkan beberapa String atau tipe data
        int angka4 = 104;
        StringBuilder konversi5 = new StringBuilder();
        konversi5.append(angka4);
        System.out.println("Metode 5 = " + konversi5);

    }
}
