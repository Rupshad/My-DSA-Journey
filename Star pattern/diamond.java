import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the number of rows for the upper half
        int n = sc.nextInt();

        // Print the upper half of the diamond
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Print the lower half of the diamond
        // Start from n-1 to avoid printing the middle row twice
        for (int i = n - 1; i >= 1; i--) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
