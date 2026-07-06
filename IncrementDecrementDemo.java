public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;

        // Pre-increment
        System.out.println("Pre-increment (++a): " + (++a));

        // Post-increment
        System.out.println("Post-increment (b++): " + (b++));
        System.out.println("Value of b after b++: " + b);

        // Pre-decrement
        System.out.println("Pre-decrement (--c): " + (--c));

        // Post-decrement
        System.out.println("Post-decrement (d--): " + (d--));
        System.out.println("Value of d after d--: " + d);
    }
}