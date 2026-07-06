import java.util.Arrays;

public class QuickSort {

    // Function to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {

        // Base case: Stop when the subarray has one or no elements
        if (low >= high) {
            return;
        }

        // Find the correct position of the pivot
        int pivotIndex = partition(arr, low, high);

        // Recursively sort the left subarray
        quickSort(arr, low, pivotIndex - 1);

        // Recursively sort the right subarray
        quickSort(arr, pivotIndex + 1, high);
    }

    // Function to place the pivot at its correct position
    public static int partition(int[] arr, int low, int high) {

        // Choose the last element as the pivot
        int pivot = arr[high];

        // Pointer for the smaller element
        int i = low - 1;

        // Rearrange elements based on the pivot
        for (int j = low; j < high; j++) {

            // If current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {

                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot in its correct sorted position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the pivot index
        return i + 1;
    }

    public static void main(String[] args) {

        // Input array
        int[] arr = {10, 7, 8, 9, 1, 5};

        // Sort the array
        quickSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
