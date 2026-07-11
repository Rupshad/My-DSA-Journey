import java.util.*;

class Solution {

    // Function to reverse the array in groups of size k
    public void reverseInGroups(int[] arr, int k) {

        int n = arr.length;

        // Traverse the array in steps of k
        for (int i = 0; i < n; i += k) {

            // Starting index of the current group
            int left = i;

            // Ending index of the current group
            // Handles the last group if its size is less than k
            int right = Math.min(i + k - 1, n - 1);

            // Reverse the current group
            while (left < right) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
}

public class ReversingInGroups {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read the array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read the group size
        System.out.print("Enter group size (k): ");
        int k = sc.nextInt();

        // Reverse the array in groups
        Solution obj = new Solution();
        obj.reverseInGroups(arr, k);

        // Display the modified array
        System.out.println("Array after reversing in groups:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
