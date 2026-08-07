import java.util.Arrays;

public class InsertionSort {

    // Function to sort the array using Insertion Sort
    public static int[] Insertion(int[] arr) {

        // Start from the second element since the first element
        // is considered sorted
        for (int i = 1; i < arr.length; i++) {

            // j points to the current element to be inserted
            int j = i;

            // Move the current element to its correct position
            // by swapping it with larger elements on its left
            while (j > 0 && arr[j] < arr[j - 1]) {

                // Swap adjacent elements
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                // Move one position to the left
                j--;
            }
        }

        // Return the sorted array
        return arr;
    }

    public static void main(String[] args) {

        // Input array
        int[] arr = {5, 4, 3, 2, 1};

        // Sort the array
        int[] arr1 = Insertion(arr);

        // Print the sorted array
        System.out.println("The sorted array is: " + Arrays.toString(arr1));
    }
}
