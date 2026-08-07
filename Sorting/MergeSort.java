import java.util.Arrays;

public class MergeSort {

    // Function to perform Merge Sort
    public static void mergeSort(int[] arr, int low, int high) {

        // Base case: Array with one element is already sorted
        if (low >= high) {
            return;
        }

        // Find the middle index
        int mid = low + (high - low) / 2;

        // Recursively sort the left half
        mergeSort(arr, low, mid);

        // Recursively sort the right half
        mergeSort(arr, mid + 1, high);

        // Merge the two sorted halves
        merge(arr, low, mid, high);
    }

    // Function to merge two sorted halves
    public static void merge(int[] arr, int low, int mid, int high) {

        // Temporary array to store merged elements
        int[] temp = new int[high - low + 1];

        int left = low;      // Pointer for left half
        int right = mid + 1; // Pointer for right half
        int index = 0;       // Pointer for temporary array

        // Compare elements from both halves and store the smaller one
        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }

        // Copy remaining elements from the left half (if any)
        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        // Copy remaining elements from the right half (if any)
        while (right <= high) {
            temp[index++] = arr[right++];
        }

        // Copy merged elements back into the original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    public static void main(String[] args) {

        // Input array
        int[] arr = {6, 3, 9, 5, 2, 8};

        // Sort the array
        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
