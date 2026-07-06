public class BitwiseAndShiftOperators {
    public static void main(String[] args) {
        int a = 12; // Binary: 1100
        int b = 5;  // Binary: 0101

        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);

        // Bitwise Operators
        System.out.println("\n--- Bitwise Operators ---");
        System.out.println("a & b  (AND)        = " + (a & b));
        System.out.println("a | b  (OR)         = " + (a | b));
        System.out.println("a ^ b  (XOR)        = " + (a ^ b));
        System.out.println("~a    (NOT)         = " + (~a));

        // Shift Operators
        System.out.println("\n--- Shift Operators ---");
        System.out.println("a << 2 (Left Shift) = " + (a << 2));
        System.out.println("a >> 2 (Right Shift)= " + (a >> 2));
        System.out.println("a >>> 2 (Unsigned Right Shift) = " + (a >>> 2));
    }
}