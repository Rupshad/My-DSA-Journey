import java.util.*;

class GfG {

    // Function to reverse elements of the array in groups of size k
    static void reverseInGroups(int[] arr, int k) {
        int n = arr.length; 

        // Loop through the array in steps of size k
        for (int i = 0; i < n; i += k) {
            
            int left = i;                         // start index of the current group
            int right = Math.min(i + k - 1, n - 1); // end index of the group
                                                    // (use Math.min to handle last group safely)

            // Reverse the current group of size k
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array input
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Take group size input
        System.out.println("Enter group size (k):");
        int k = sc.nextInt();

        // Function call
        reverseInGroups(arr, k);

        // Print the modified array
        System.out.println("Array after reversing in groups of " + k + ":");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
