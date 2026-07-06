public class EvenNumbersDoWhile {
    public static void main(String[] args) {
        int i = 20;

        System.out.println("Even numbers from 20 to 40:");

        do {
            System.out.print(i + "\n");
            i += 2;
        } while (i <= 40);
    }
}