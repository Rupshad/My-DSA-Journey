import java.util.*;

public class Reverse {

    // Method to reverse a number
    public static int reverse(int x) {
        int rev = 0;

        // Extract digits from right to left and build the reversed number
        while (x > 0) {
            int pop = x % 10;
            rev = rev * 10 + pop;
            x = x / 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take a number as input
        System.out.println("Enter a number");
        int n = sc.nextInt();

        // Reverse and display the number
        System.out.println("The reversed number is: " + reverse(n));

        sc.close();
    }
}
