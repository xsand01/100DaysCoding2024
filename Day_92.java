package Coding100Day;

public class Day_92 {

    public static void main(String[] args) {
        //Asterisk Pattern : Pola V
        
        int a = 5;
        for (int i = 0; i < a; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            System.out.print("*");
            for (int j = 0; j < 2 * (a - i - 1) - 1; j++) {
                System.out.print(" ");

            }
            if (i != a - 1) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
