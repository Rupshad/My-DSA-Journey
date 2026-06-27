import java.util.*;

public class RotateClockwise {
    public static void main(String[] args){
        // Initialize a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the dimension of the square matrix
        System.out.println("Enter size of square matrix:");
        int n = sc.nextInt(); // 'n' represents both the number of rows and columns

        // Initialize an n x n 2D array to hold the matrix elements
        int[][] matrix = new int[n][n];
        
        System.out.println("Enter elements of matrix:");
        // Nested loops to read matrix elements row by row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        /* * Step 1: Transpose the matrix.
         * Transposing means converting rows to columns and columns to rows.
         * We do this by swapping matrix[i][j] with matrix[j][i].
         */
        for (int i = 0; i < n; i++) {
            // Notice j starts at 'i + 1'. This ensures we only swap the top-right 
            // triangle of the matrix with the bottom-left. 
            // If we started at 0, we would swap elements twice, undoing the transpose.
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        /* * Step 2: Reverse each row of the transposed matrix.
         * Transposing followed by horizontal reflection (reversing rows) 
         * perfectly simulates a 90-degree clockwise rotation.
         */
        for (int i = 0; i < n; i++) {
            // Use a two-pointer approach to reverse the current row in-place
            int left = 0; 
            int right = n - 1;
            
            // Swap elements moving inwards until the pointers meet in the middle
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                
                left++;  // Move the left pointer to the right
                right--; // Move the right pointer to the left
            }
        }

        // Print the final rotated matrix
        System.out.println("Rotated Matrix (90° Clockwise):");
        // Using an enhanced for-loop (for-each) to iterate through the rows
        for (int[] row : matrix) {
            // Iterate through each value in the current row
            for (int val : row) {
                System.out.print(val + " ");
            }
            // Move to the next line after printing all elements of a
