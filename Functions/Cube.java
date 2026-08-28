import java.util.Scanner;

public class Cube {

    // Method to calculate the cube of a number
    public static int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take a number as input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Calculate and display the cube
        System.out.println("The cube is " + cube(num));

        sc.close();
    }
}
