import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of rows for the pyramid
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {

            // Print spaces to create the pyramid structure
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();
        }

        scanner.close();
    }
}
