import java.util.Scanner;

public class maxof3num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take three numbers as input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Find the maximum number
        if (a > b && a > c) {
            System.out.println("Maximum number is " + a);
        }
        else if (b > a && b > c) {
            System.out.println("Maximum number is " + b);
        }
        else {
            System.out.println("Maximum number is " + c);
        }

        sc.close();
    }
}
