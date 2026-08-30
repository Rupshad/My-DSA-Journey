import java.util.*;

public class Prime {

    // Method to check whether a number is prime
    public static String isPrime(int n) {

        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return "Not Prime";
        }

        // Check if the number is divisible by any number from 2 to n-1
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return "Not Prime";
            }
        }

        return "Prime";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take a number as input
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        // Check and display whether the number is prime
        System.out.println("The number is " + isPrime(n));

        sc.close();
    }
}
