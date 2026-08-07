import java.util.Arrays;

public class NextPermutation {

    // Function to find the next lexicographical permutation
    public static void nextPermutation(int[] arr) {

        int n = arr.length;

        // Step 1: Find the pivot (first element smaller than its next element)
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // If a pivot exists
        if (i >= 0) {

            // Step 2: Find the successor (smallest element greater than pivot)
            int j = n - 1;

            while (arr[j] <= arr[i]) {
                j--;
            }

            // Step 3: Swap pivot and successor
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Step 4: Reverse the suffix
        reverse(arr, i + 1, n - 1);
    }

    // Function to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 3, 2};

        nextPermutation(arr);

        System.out.println("Next Permutation: " + Arrays.toString(arr));
    }
}
