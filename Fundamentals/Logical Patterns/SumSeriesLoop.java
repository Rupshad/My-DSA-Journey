import java.util.Scanner;

public class SumSeriesLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the value of n
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;

        // Add numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Display the sum
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
