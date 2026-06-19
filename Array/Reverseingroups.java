import java.util.*;

class Solution {
    public void reverseInGroups(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

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

public class Reverseingroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter group size (k):");
        int k = sc.nextInt();

        Solution obj = new Solution();
        obj.reverseInGroups(arr, k);

        System.out.println("Array after reversing in groups:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();  // close the Scanner
    }
}
a