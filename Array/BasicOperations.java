import java.util.*;

public class BasicOperations {

    public static void main(String[] args) {

        // Take array input from the user
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the value of array at index " + i);
            arr[i] = sc.nextInt();
        }

        // Display the entered array
        System.out.println(Arrays.toString(arr));

        // Calculate the sum of all elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);

        // Calculate the average of array elements
        double average = (double) sum / arr.length;
        System.out.println("Average: " + average);

        // Find the maximum and minimum elements
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        // Count positive, negative and zero elements
        int neg = 0;
        int pos = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            } else {
                zero++;
            }
        }

        System.out.println("The number of positive numbers is " + pos);
        System.out.println("The number of negative numbers is " + neg);
        System.out.println("The number of zero is " + zero);

        // Count even and odd elements
        int odd = 0;
        int even = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("No of even numbers: " + even);
        System.out.println("No of odd numbers: " + odd);

        // Close the scanner
        sc.close();
    }
}
