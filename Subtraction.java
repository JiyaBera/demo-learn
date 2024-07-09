import java.util.Scanner;

public class Subtraction {
    // Method to subtract two integers
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calling the subtract method and storing the result
        int result = subtract(num1, num2);

        // Printing the result
        System.out.println("The result of subtraction is: " + result);

        // Close the scanner
        scanner.close();
    }
}
