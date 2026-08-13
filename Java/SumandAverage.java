import java.util.Scanner;

public class CountPositiveNegativeZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        // Take 10 numbers as input
        System.out.println("Enter 10 numbers:");

        for (int i = 1; i <= 10; i++) {

            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();

            // Check whether the number is positive, negative, or zero
            if (num > 0) {
                positive++;
            } 
            else if (num < 0) {
                negative++;
            } 
            else {
                zero++;
            }
        }

        // Display the counts
        System.out.println("Number of positive numbers: " + positive);
        System.out.println("Number of negative numbers: " + negative);
        System.out.println("Number of zeroes: " + zero);

        input.close();
    }
}
