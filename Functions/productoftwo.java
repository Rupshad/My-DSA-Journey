import java.util.Scanner;

public class productoftwo {

    // Method to calculate the product of two numbers
    public static int productOfTwo(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take the first number as input
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        // Take the second number as input
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Calculate and display the product
        int product = productOfTwo(a, b);
        System.out.println("The product of the two numbers is " + product);

        sc.close();
    }
}
