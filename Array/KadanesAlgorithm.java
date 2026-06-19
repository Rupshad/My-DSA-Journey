public class KadanesAlgorithm{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 5};

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int newSum = Math.max(arr[i], currentSum + arr[i]);

            if (newSum != currentSum) {
                System.out.println("CurrentSum for index " + i + ": " + newSum);
            }

            currentSum = newSum;

            if (currentSum > maxSum) {
                maxSum = currentSum;
                System.out.println("MaxSum for index " + i + ": " + maxSum);
            }
        }

        System.out.println("Final Maximum Subarray Sum: " + maxSum);
    }
}
