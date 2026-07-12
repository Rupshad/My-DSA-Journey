import java.util.*;

public class MinAndSecondMin {

    // Function to find the minimum and second minimum elements
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();

        // If the array has less than two elements,
        // a second minimum cannot exist
        if (arr.length < 2) {
            result.add(-1);
            return result;
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        // Traverse the array
        for (int num : arr) {

            // Update both minimum and second minimum
            if (num < min) {
                secondMin = min;
                min = num;
            }

            // Update only the second minimum
            else if (num > min && num < secondMin) {
                secondMin = num;
            }
        }

        // If second minimum was never updated
        if (secondMin == Integer.MAX_VALUE) {
            result.add(-1);
        } else {
            result.add(min);
            result.add(secondMin);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MinAndSecondMin obj = new MinAndSecondMin();

        // Read array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find minimum and second minimum
        ArrayList<Integer> ans = obj.minAnd2ndMin(arr);

        if (ans.size() == 1 && ans.get(0) == -1) {
            System.out.println("Second minimum element does not exist.");
        } else {
            System.out.println("Minimum Element       : " + ans.get(0));
            System.out.println("Second Minimum Element: " + ans.get(1));
        }

        sc.close();
    }
}
