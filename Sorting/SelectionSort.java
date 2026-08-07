import java.util.Arrays;

public class SelectionSort {

    // Function to sort the array using Selection Sort
    public static int[] selectionSort(int[] arr) {

        // Traverse the entire array
        for (int i = 0; i < arr.length - 1; i++) {

            // Assume the current index has the minimum element
            int minIndex = i;

            // Find the index of the smallest element
            // in the remaining unsorted part of the array
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest element with the current element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Return the sorted array
        return arr;
    }

    public static void main(String[] args) {

        // Input array
        int[] arr = {64, 25, 12, 22, 11};

        // Sort the array
        int[] sortedArray = selectionSort(arr);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}
