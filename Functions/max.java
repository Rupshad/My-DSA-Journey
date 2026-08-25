import java.util.Scanner;

public class max {

    // Method to find the maximum of two numbers
    public static int maxi(int a, int b) {
        if (a > b) {
            return a;
        }

        return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take the first number as input
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        // Take the second number as input
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Call the method and display the maximum
        System.out.println("The maximum number is " + maxi(a, b));

        sc.close();
    }
}
