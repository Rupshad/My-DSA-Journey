import java.util.*;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Read the array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value for index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Display the entered array
        System.out.println("The array is: " + Arrays.toString(arr));

        // Read the target element to search
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        // Assume the target is not found initially
        int index = -1;

        // Traverse the array to find the target
        for (int i = 0; i < arr.length; i++) {

            // If the target is found, store its index
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        // Display the result
        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + index);
        }

        // Close the Scanner object
        sc.close();
    }
}
