import java.util.Scanner;

public class Table {

    // Method to print the multiplication table
    public static void printTable(int num) {

        // Loop from 1 to 20
        for (int i = 1; i <= 20; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take a number as input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Call the method to print the table
        printTable(number);

        sc.close();
    }
}
