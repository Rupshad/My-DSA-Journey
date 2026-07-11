import java.util.*;

public class ArrayRotation {

    // Function to reverse a portion of the array
    static void reverse(int[] arr, int start, int end) {

        while (start < end) {

            // Swap the elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read the array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read the number of rotations
        System.out.print("Enter the number of rotations: ");
        int k = sc.nextInt();

        // Handle cases where k is greater than the array size
        k = k % n;

        // Step 1: Reverse the first (n-k) elements
        reverse(arr, 0, n - k - 1);

        // Step 2: Reverse the last k elements
        reverse(arr, n - k, n - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Display the rotated array
        System.out.println("Array after rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
