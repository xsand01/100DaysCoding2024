package Coding100Day;

import java.util.Scanner;

public class Day_90 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== DAFTAR MERK HP BESERTA HARGA ===");
        System.out.println("====================================");
        System.out.println("1.SAMSUNG = Rp.3000000 ");
        System.out.println("2.REDMI = Rp.2500000");
        System.out.println("3.REALME = Rp.3500000 ");
        System.out.print("Pilih HP yang ingin anda beli 1/3 = ");
        int pil = in.nextInt();
        in.nextLine();
        int HargaAwal = 0;
        if (pil == 1) {
            HargaAwal = 3000000;
        } else if (pil == 2) {
            HargaAwal = 2500000;
        } else if (pil == 3) {
            HargaAwal = 3500000;
        } else {
            System.out.println("Input tidak valid");
            return;
        }
        System.out.println("Harga awal = " + HargaAwal);
        System.out.println("==============================================");
        String kode = "12345";
        System.out.println("Apakah anda memiliki kode promo?");
        System.out.println("ya/no");
        System.out.print("Masukan pilihan = ");
        String jawaban = in.nextLine();

        if (jawaban.equalsIgnoreCase("ya")) {
            System.out.print("Masukan kode promo anda = ");
            String kodprom = in.nextLine();
            if (kodprom.equalsIgnoreCase(kode)) {
                int diskon = HargaAwal * 5 / 100;
                int hasil = HargaAwal - diskon;
                System.out.println("Selamat kode anda benar,anda mendapatkan diskon 5%");
                System.out.println("Harga awal = " + HargaAwal + " Harga yang anda bayar setelah diskon = " + hasil);
            } else {
                System.out.println("kode promo yang anda masukan salah,harga yang harus anda bayar = " + HargaAwal);
            }
        } else if (jawaban.equalsIgnoreCase("no")) {
            System.out.println("Anda tidak memiliki kode promo,harga yang harus anda bayar = " + HargaAwal);
        } else {
            System.out.println("input tidak valid,harga yang harus anda bayar = " + HargaAwal);
        }
    }
}
