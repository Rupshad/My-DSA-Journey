import java.util.*;

public class SumOfTwo {

    // Method to calculate the sum of two integers
    public static int sumOfTwoInt(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take two numbers as input
        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        // Calculate the sum
        int sum = sumOfTwoInt(a, b);

        // Display the result
        System.out.println("Sum of two numbers is " + sum);

        sc.close();
    }
}
