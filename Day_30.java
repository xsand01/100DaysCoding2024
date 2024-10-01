package Coding100Day;

import java.math.BigDecimal;

public class Day_30 {

    public static void main(String[] args) {
        //Tipe data reverensi BigDecimal
        /*Tipe data BigDecimal pada Java digunakan untuk merepresentasikan angka desimal 
        dengan tingkat presisi yang sangat tinggi, seperti yang sering dibutuhkan dalam aplikasi
        keuangan atau ilmiah di mana presisi floating-point standar (seperti float atau double) tidak cukup.*/
        
        BigDecimal a = new BigDecimal("20.5");
        BigDecimal b = new BigDecimal("30.4");
        BigDecimal penjumlahan = a.add(b);
        BigDecimal pengurangan = a.subtract(b);
        BigDecimal perkalian = a.multiply(b);
        System.out.println("Hasil Penjumlahan = " + penjumlahan);
        System.out.println("Hasil Pengurangan = " + pengurangan);
        System.out.println("Hasil Perkalian   = " + perkalian);

    }
}
