import java.util.*;

public class GCD {

    // Method to find the GCD using the Euclidean Algorithm
    public static int gcd(int a, int b) {

        // Continue until the remainder becomes 0
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take two numbers as input
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        // Calculate and display the GCD
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));

        sc.close();
    }
}
