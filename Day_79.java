package Coding100Day;

public class Day_79 {

    String nama;   //untuk nama mobil
    String warna;  // untuk warna mobil

    public Day_79(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    // Override metode toString
    @Override
    public String toString() {
        return "Mobil[ nama = " + nama + ", warna = " + warna + " ]";
    }

    public static void main(String[] args) {
        // Membuat objek mobil
        Day_79 mobil1 = new Day_79(" Toyota ", " Merah ");
        Day_79 mobil2 = new Day_79(" Honda ", " Biru ");

        // Mencetak objek mobil
        System.out.println(mobil1);
        System.out.println(mobil2);
    }
}
