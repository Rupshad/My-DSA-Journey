import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take year as input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check whether the year is a leap year
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }

        sc.close();
    }
}
