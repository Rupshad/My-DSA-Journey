import java.util.*;

public class SubarrayofSumKexists {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Enter the sum:");
        int k = sc.nextInt();

        Set<Integer> prefixSet = new HashSet<>();

        // Important: 0 represents the prefix before the array starts
        prefixSet.add(0);

        int prefixSum = 0;
        boolean found = false;

        for (int num : arr) {

            prefixSum += num;

            // If prefixSum - k existed earlier,
            // the elements between those two positions
            // have sum k.
            if (prefixSet.contains(prefixSum - k)) {
                found = true;
                break;
            }

            prefixSet.add(prefixSum);
        }

        if (found) {
            System.out.println("Subarray with sum " + k + " exists.");
        } else {
            System.out.println("Subarray with sum " + k + " does not exist.");
        }

        sc.close();
    }
}
