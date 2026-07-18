import java.util.Scanner;

public class SumOfCube {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the value of n
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;

        // Calculate the sum of cubes from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i * i * i;
        }

        // Display the result
        System.out.println("Sum of cubes = " + sum);

        sc.close();
    }
}
