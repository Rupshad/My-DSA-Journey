import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the number of rows
        int n = sc.nextInt();

        // Traverse each row
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print the current row number i, repeated i times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            // Move to the next row
            System.out.println();
        }

        sc.close();
    }
}
