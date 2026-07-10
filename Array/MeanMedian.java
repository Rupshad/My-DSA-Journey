import java.util.*;

public class MeanMedian {

    // Function to calculate the mean of the array
    static int mean(int[] arr) {

        int sum = 0;

        // Calculate the sum of all elements
        for (int num : arr) {
            sum += num;
        }

        // Return the average value
        return sum / arr.length;
    }

    // Function to calculate the median of the array
    static int median(int[] arr) {

        // Sort the array
        Arrays.sort(arr);

        int n = arr.length;
        double median;

        // If the array has an even number of elements,
        // median is the average of the two middle elements
        if (n % 2 == 0) {
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }

        // If the array has an odd number of elements,
        // median is the middle element
        else {
            median = arr[n / 2];
        }

        // Return the floor value of the median
        return (int) Math.floor(median);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate mean and median
        int mean = mean(arr);
        int median = median(arr);

        // Display the results
        System.out.println("Mean   : " + mean);
        System.out.println("Median : " + median);

        sc.close();
    }
}
