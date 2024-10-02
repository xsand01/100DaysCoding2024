package Coding100Day;
public class Day_31 {
    public static void main(String[] args) {
        String in = "100";
        String db = "100.99";
        String bool = "true";
        
        // Konversi String ke int
        int a = Integer.parseInt(in);
        // Konversi String ke double
        double b = Double.parseDouble(db);
        // Konversi String ke boolean
        boolean c = Boolean.parseBoolean(bool);

        // Output
        System.out.println("int = " + a);
        System.out.println("double = " + b);
        System.out.println("boolean = " +c);
        
    }
    
}
