import java.util.*;

public class Palindrome {

    // Method to check whether a number is a palindrome
    public static String palindrome(int temp) {
        int rev = 0;
        int original = temp;

        // Reverse the number
        while (temp > 0) {
            int pop = temp % 10;
            rev = rev * 10 + pop;
            temp = temp / 10;
        }

        // Compare the reversed number with the original
        if (original == rev) {
            return "Palindrome";
        } else {
            return "Not Palindrome";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take a number as input
        System.out.println("Enter a number");
        int num = sc.nextInt();

        // Check and display whether the number is a palindrome
        System.out.println("The number is " + palindrome(num));

        sc.close();
    }
}
