import java.util.Scanner;

public class factorial { // Class name updated to follow Java naming conventions
    public static void Factorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        
        int factorial = 1;
        
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        
        System.out.println("The factorial of " + n + " is " + factorial); // Clear output
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: "); // Prompting the user for input
        int n = sc.nextInt();
        
        Factorial(n);
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
