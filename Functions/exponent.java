import java.util.Scanner;

public class exponent {

    // Method to calculate base raised to the power of exponent
    public static int Exponent(int base, int exponent) {
        int result = 1;

        // Multiply the base by itself exponent times
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take the base as input
        System.out.print("Enter base: ");
        int base = sc.nextInt();

        // Take the exponent as input
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        // Calculate and display the result
        System.out.println("The value is: " + Exponent(base, exponent));

        sc.close();
    }
}
