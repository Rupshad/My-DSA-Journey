import java.util.Scanner;

public class chartype {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);  // Read the first character

        // Check if the character is an alphabet
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            // Check if the alphabet is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                System.out.println("It is a vowel.");

            } else {
                System.out.println("It is a consonant.");
            }

        // Check if the character is a digit
        } else if (ch >= '0' && ch <= '9') {

            System.out.println("It is a digit.");

        // If it is neither alphabet nor digit
        } else {

            System.out.println("It is a special character.");
        }

        sc.close();
    }
}
