import java.util.Scanner;

public class evenodd {

    // Method to check whether a number is even
    public static boolean evenOdd(int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take a number as input
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        // Call the method and display the result
        System.out.println(evenOdd(a));

        sc.close();
    }
}
