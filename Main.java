public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) { // check if the number is odd
                System.out.print(i + " ");
            }
        }

        System.out.println("\nEven numbers:"); // print even numbers
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) { // check if the number is even
                System.out.print(i + " ");
            }
        }

    }
}
