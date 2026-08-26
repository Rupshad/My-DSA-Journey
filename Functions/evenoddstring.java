import java.util.Scanner;

public class evenoddstring {

    // Method to check whether a number is even or odd
    public static String EvenOddString(int a) {

        // If remainder is 0, the number is even
        if (a % 2 == 0) {
            return "Even";
        }
        else {
            return "Odd";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take a number as input
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        // Call the method and display the result
        System.out.println(EvenOddString(a));

        sc.close();
    }
}
