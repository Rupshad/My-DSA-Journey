import java.util.Scanner;

public class SumOfSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the value of n
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Variable to store the sum of squares
        int sum = 0;

        // Calculate the sum of squares from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        // Display the final sum
        System.out.println("Sum = " + sum);

        // Close the Scanner object
        sc.close();
    }
}
