import java.util.Scanner;

public class FibonacciSeries {

    // Recursive method to find Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative method to find Fibonacci series
    public static void fibonacciIterative(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series (Iterative): ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int terms = scanner.nextInt();

        // Generate Fibonacci series using iterative method
        fibonacciIterative(terms);

        // Generate Fibonacci series using recursive method
        System.out.print("Fibonacci Series (Recursive): ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();

        scanner.close();
    }
}
