import java.util.Arrays;

public class ReverseArray {

    // Function to reverse the array
    static void reverse(int[] arr) {

        // Initialize two pointers
        int left = 0;
        int right = arr.length - 1;

        // Swap elements until the pointers meet
        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        // Input array
        int[] arr = {1, 2, 3};

        // Reverse the array
        reverse(arr);

        // Display the reversed array
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
