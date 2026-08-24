import java.util.Scanner;

public class factorial {

    // Method to calculate the factorial of a number
    public static int fact(int n) {

        // Factorial is not defined for negative numbers
        if (n < 0) {
            System.out.println("Invalid number");
            return -1;
        }

        // Factorial of 0 and 1 is 1
        else if (n == 0 || n == 1) {
            return 1;
        }

        int fact = 1;

        // Calculate factorial using a loop
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take a number as input
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // Calculate and display the factorial
        System.out.println("The factorial is: " + fact(num));

        sc.close();
    }
}
