import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {

            // Assume the current element is the minimum
            int minIndex = i;

            // Find the index of the smallest element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest element with the current element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            // Display the array after each pass
            System.out.println("After Pass " + (i + 1) + ": " + Arrays.toString(arr));
        }

        // Display the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Close the Scanner object
        sc.close();
    }
}
