import java.util.*;

/*
 * Program: Spiral Matrix Traversal
 *
 * Approach:
 * - Maintain four boundaries: top, bottom, left, and right.
 * - Traverse the matrix layer by layer.
 * - After completing each direction, update the corresponding boundary.
 * - Continue until all elements are visited.
 *
 * Time Complexity: O(rows × cols)
 * Space Complexity: O(1)
 */

public class SpiralTraversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral order:");
        spiralPrint(matrix, rows, cols);

        // Close the scanner to free system resources
        sc.close();
    }

    static void spiralPrint(int[][] matrix, int rows, int cols) {

        // Initialize the four boundaries of the current layer
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        // Continue until all layers are traversed
        while (top <= bottom && left <= right) {

            // Traverse from left to right across the top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Traverse from right to left across the bottom row
            // Execute only if there is a remaining row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Traverse from bottom to top along the left column
            // Execute only if there is a remaining column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
