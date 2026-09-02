import java.util.*;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of first n natural numbers
    public static int sumUpTo(int n) {
        int sum = 0;

        // Add each number from 1 to n
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a number");
        int n = sc.nextInt();

        // Display the calculated sum
        System.out.println(
            "Sum of first " + n + " natural numbers is " + sumUpTo(n)
        );

        sc.close();
    }
}
