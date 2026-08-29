import java.util.*;

public class Function {

    // Method to print the given name
    public static void PrintMyName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take the name as input
        System.out.println("Enter your name:");
        String name = sc.next();

        // Call the method and pass the name
        PrintMyName(name);

        sc.close();
    }
}
