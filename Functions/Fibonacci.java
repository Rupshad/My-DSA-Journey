import java.util.Scanner;

public class Fibonacci {

    // Method to print the first n Fibonacci terms
    public static void fibonacci(int n) {

        int a = 0, b = 1;

        // Generate Fibonacci sequence
        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take the number of terms as input
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        fibonacci(n);

        sc.close();
    }
}
