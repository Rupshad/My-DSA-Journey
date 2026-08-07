import java.util.Scanner;

public class SumSeriesLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the value of n
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Variable to store the sum
        int sum = 0;

        // Add all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Display the final sum
        System.out.println("Sum = " + sum);

        // Close the Scanner object
        sc.close();
    }
}
