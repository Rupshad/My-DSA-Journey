public class MooresVotingAlgorithm {

    // Function to find the majority element
    public static int majorityElement(int[] arr) {

        int candidate = 0;
        int count = 0;

        // Step 1: Find the potential majority element
        for (int num : arr) {

            // If count becomes 0, choose a new candidate
            if (count == 0) {
                candidate = num;
            }

            // Increase count if the current element matches the candidate
            if (num == candidate) {
                count++;
            }
            // Otherwise, decrease the count
            else {
                count--;
            }
        }

        // Step 2: Verify that the candidate is actually the majority element
        count = 0;

        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        // Return the candidate if it appears more than n/2 times
        if (count > arr.length / 2) {
            return candidate;
        }

        // Return -1 if no majority element exists
        return -1;
    }

    public static void main(String[] args) {

        // Input array
        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        // Find the majority element
        int result = majorityElement(arr);

        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No Majority Element Found");
        }
    }
}
