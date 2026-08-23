import java.util.*;

public class AbsoluteValue {

    // Method to find the absolute value of a number
    public static int absoluteValue(int number) {

        // If the number is negative, change its sign
        if (number < 0) {
            return -number;
        }
        else {
            return number;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take a number as input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Call the method and display the absolute value
        System.out.println("The absolute value of the number is "
                + absoluteValue(number));

        sc.close();
    }
}
