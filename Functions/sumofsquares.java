import java.util.Scanner;

public class sumofsquares {

    // Method to calculate the sum of squares from 1 to n
    public static int sumUpTo(int n) {
        int sum = 0;

        // Add the square of each number to the sum
        for (int i = 1; i <= n; i++) {
            sum = sum + (i * i);
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take the value of n as input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Calculate and display the sum of squares
        System.out.println("The sum of squares up to n: " + sumUpTo(n));

        sc.close();
    }
}
