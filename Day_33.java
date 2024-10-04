package Coding100Day;

public class Day_33 {

    public static void main(String[] args) {
        // explicit casting (narrowing)
        double angka1 = 20.11;
        int angka2 = (int) angka1;//konversi manual
        System.out.println("Nilai sebelum di casting = " + angka1);
        System.out.println("Nilai sesudah di casting = " + angka2);

        // implicit casting (widening)
        int angka4 = 1270; //konversi otomatis
        double angka5 = (double) angka4;
        System.out.println("Nilai sebelum di casting = " + angka4);
        System.out.println("Nilai sesudah di casting = " + angka5);

    }
}
