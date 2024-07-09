
    import java.util.Scanner;

    public class add {
        // Function to add two numbers
        public static int add(int a, int b) {
            return a + b;
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Prompt the user for the first number
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
    
            // Prompt the user for the second number
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
    
            // Calculate the sum
            int result = add(num1, num2);
    
            // Display the result
            System.out.println("The sum is: " + result);
    
            // Close the scanner
            scanner.close();
        }
    }
    
    

