import java.util.*;

public class Square {

    // Method to calculate the square of a number
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take a number as input
        System.out.println("Enter a number");
        int num = sc.nextInt();

        // Calculate and display the square
        System.out.println("The square is " + square(num));

        sc.close();
    }
}
