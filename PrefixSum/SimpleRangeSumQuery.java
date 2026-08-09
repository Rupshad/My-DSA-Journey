import java.util.Arrays;

public class SimpleRangeSumQuery {

    public static void main(String[] args) {

        // Original array
        int[] arr = {2, 4, 6, 3, 5};

        // Create prefix sum array
        int[] prefix = new int[arr.length];

        // First prefix sum is the first element itself
        prefix[0] = arr[0];

        // Build the prefix sum array
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Display the prefix sum array
        System.out.println("Prefix Sum: " + Arrays.toString(prefix));

        // Define the range [L, R]
        int L = 1;
        int R = 3;

        // Calculate sum from index L to R
        int rangeSum = prefix[R] - prefix[L - 1];

        System.out.println("Sum from index " + L + " to " + R + ": " + rangeSum);

        // Sum of the complete array
        System.out.println("Sum of entire array: " + prefix[4]);
    }
}
