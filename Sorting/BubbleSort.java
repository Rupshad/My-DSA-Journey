import java.util.Arrays;

public class BubbleSort {

    // Function to sort the array using Bubble Sort
    public static int[] Bubble(int[] arr) {

        // Outer loop controls the number of passes
        for (int i = 0; i < arr.length - 1; i++) {

            // Compare adjacent elements in each pass
            for (int j = 0; j < arr.length -i- 1; j++) {

                // Swap if elements are in the wrong order
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Return the sorted array
        return arr;
    }

    public static void main(String[] args) {

        // Input array
        int arr[] = {5, 4, 3, 2, 1};

        // Sort the array
        int arr1[] = Bubble(arr);

        // Print the sorted array
        System.out.println("The sorted array is: " + Arrays.toString(arr1));
    }
}
