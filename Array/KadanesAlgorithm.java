public class KadanesAlgorithm {

    public static void main(String[] args) {

        // Input array
        int[] arr = {1, 2, 3, -2, 5};

        // Initialize current and maximum sum with the first element
        int currentSum = arr[0];
        int maxSum = arr[0];

        // Traverse the array starting from the second element
        for (int i = 1; i < arr.length; i++) {

            // Decide whether to start a new subarray
            // or extend the existing one
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update the maximum sum if a larger sum is found
            maxSum = Math.max(maxSum, currentSum);

            // Display the running values
            System.out.println(
                "Index: " + i +
                " | Current Sum: " + currentSum +
                " | Maximum Sum: " + maxSum
            );
        }

        // Print the final answer
        System.out.println("\nMaximum Subarray Sum = " + maxSum);
    }
}
