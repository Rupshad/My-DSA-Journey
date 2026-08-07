import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Read array elements from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {

            // Compare adjacent elements in the unsorted part
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if the elements are in the wrong order
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        sc.close();
    }
}
