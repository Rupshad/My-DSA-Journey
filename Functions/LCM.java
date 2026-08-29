import java.util.*;

public class LCM {

    // Method to find the GCD using the Euclidean Algorithm
    public static long gcd(long a, long b) {
        while (b != 0) {
            long remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    // Method to calculate the LCM using the GCD
    public static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take two numbers as input
        System.out.println("Enter the first number: ");
        long a = sc.nextLong();

        System.out.println("Enter the second number: ");
        long b = sc.nextLong();

        // Calculate and display the LCM
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a, b));

        sc.close();
    }
}
