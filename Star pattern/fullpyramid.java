import java.util.Scanner;

public class FullPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the number of rows
        int n = sc.nextInt();

        // Loop through each row
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        sc.close();
    }
}
