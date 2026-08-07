import java.util.Arrays;

public class ShellSort {

    // Function to sort the array using Shell Sort
    public static void shellSort(int[] arr) {

        int n = arr.length;

        // Start with a large gap and reduce it after each pass
        for (int gap = n / 2; gap > 0; gap /= 2) {

            // Perform a gapped insertion sort
            for (int i = gap; i < n; i++) {

                // Store the current element
                int temp = arr[i];

                int j = i;

                // Shift elements that are greater than temp
                // to create the correct position
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                // Place the current element at its correct position
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {

        // Input array
        int[] arr = {12, 34, 54, 2, 3};

        // Sort the array
        shellSort(arr);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
