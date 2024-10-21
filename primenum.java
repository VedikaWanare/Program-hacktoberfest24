import java.util.Scanner;

public class PrimeNumbersUnderLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the limit
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        System.out.println("Prime numbers up to " + limit + " are: ");

        // Loop through all numbers from 2 to the limit
        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // 0 and 1 are not prime numbers
        if (num < 2) {
            return false;
        }

        // Check divisibility of the number from 2 to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // not prime if divisible by any number
            }
        }
        return true; // prime if no divisors were found
    }
}
