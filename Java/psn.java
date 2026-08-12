import java.util.Scanner;

public class psn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        // Check whether the number is positive, negative, or zero
        if (n > 0) {
            System.out.println("The number is positive");
        } 
        else if (n < 0) {
            System.out.println("The number is negative");
        } 
        else {
            System.out.println("The number is zero");
        }

        sc.close();
    }
}
