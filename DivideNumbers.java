import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the dividend: ");
            double dividend = scanner.nextDouble();

            System.out.print("Enter the divisor: ");
            double divisor = scanner.nextDouble();

            if (divisor == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            double result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close();
        }
    }
}
`