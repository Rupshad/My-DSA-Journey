public class EvenOddSubarraySumdiff {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7, 3};
        int n = arr.length;

        // Prefix arrays to store sums of elements
        // at even and odd indices respectively
        int[] evenPrefix = new int[n];
        int[] oddPrefix = new int[n];

        // Build the prefix sum arrays
        for (int i = 0; i < n; i++) {

            if (i == 0) {

                // First element is at an even index
                evenPrefix[i] = (i % 2 == 0) ? arr[i] : 0;
                oddPrefix[i] = (i % 2 != 0) ? arr[i] : 0;

            } else {

                // Add current element to the appropriate prefix sum
                evenPrefix[i] = evenPrefix[i - 1]
                        + ((i % 2 == 0) ? arr[i] : 0);

                oddPrefix[i] = oddPrefix[i - 1]
                        + ((i % 2 != 0) ? arr[i] : 0);
            }
        }

        // Define the subarray range [L, R]
        int L = 1;
        int R = 4;

        // Calculate even-indexed sum in the range
        int evenSum = evenPrefix[R] - evenPrefix[L - 1];

        // Calculate odd-indexed sum in the range
        int oddSum = oddPrefix[R] - oddPrefix[L - 1];

        // Difference between even-indexed and odd-indexed sums
        int difference = evenSum - oddSum;

        System.out.println("The difference: " + difference);
    }
}
