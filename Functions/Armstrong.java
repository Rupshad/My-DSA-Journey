import java.util.*;

public class Armstrong {

    // Method to check whether a number is an Armstrong number
    public static String isArmstrong(int num) {

        int original = num;
        int count = 0;
        int temp = num;

        // Count the number of digits
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        int sum = 0;
        temp = num;

        // Calculate the sum of each digit raised to the number of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, count);
            temp = temp / 10;
        }

        // Compare the calculated sum with the original number
        if (sum == original) {
            return "Armstrong";
        }
        else {
            return "Not Armstrong";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take a number as input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check and display the result
        System.out.println(isArmstrong(num));

        sc.close();
    }
}
