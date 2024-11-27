package Coding100Day;

public class Day_87 {

    public static void main(String[] args) {
        //Mengubah Nilai Array satu dimensi pada index Tertentu 
        System.out.println("sebelum di ubah indexnya = ");
        int[] a = {10, 20, 30, 40, 50};
        for (int i = 0; i < a.length; i++) {

            System.out.println( a[i]);
        }
        
        
        System.out.println("==================================================");
        System.out.println("Sesudah di ubah index nya = ");
        a[1] = 200;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }

}
