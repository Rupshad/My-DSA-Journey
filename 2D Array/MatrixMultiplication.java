import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        // Initialize a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for the dimensions of the first matrix (Matrix A)
        System.out.println("Enter rows and columns for matrix A:");
        int m = sc.nextInt(); // Number of rows in A
        int n = sc.nextInt(); // Number of columns in A
        
        // Prompt the user for the dimensions of the second matrix (Matrix B)
        System.out.println("Enter rows and columns for matrix B:");
        int p = sc.nextInt(); // Number of rows in B
        int q = sc.nextInt(); // Number of columns in B
        
        // Check if matrix multiplication is mathematically possible.
        // The number of columns in A (n) must equal the number of rows in B (p).
        if (n == p) {
            System.out.println("Both the matrices are applicable for multiplication.");
        } else {
            // If they are not equal, display an error and exit the program
            System.out.println("Matrices cannot be multiplied. Columns of A must equal rows of B.");
            sc.close();
            return; 
        }
        
        // Declare and initialize the 2D arrays for the matrices
        int[][] A = new int[m][n]; // Matrix A of size m x n
        int[][] B = new int[p][q]; // Matrix B of size p x q
        int[][] C = new int[m][q]; // Resulting Matrix C of size m x q
        
        // Read elements for Matrix A from the user
        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < m; i++) { // Loop through rows
            for (int j = 0; j < n; j++) { // Loop through columns
                A[i][j] = sc.nextInt();
            }
        }
        
        // Read elements for Matrix B from the user
        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < p; i++) { // Loop through rows
            for (int j = 0; j < q; j++) { // Loop through columns
                B[i][j] = sc.nextInt();
            }
        }
        
        // Core logic for Matrix Multiplication
        // Iterate through each row of Matrix A
        for (int i = 0; i < m; i++) {
            // Iterate through each column of Matrix B
            for (int j = 0; j < q; j++) {
                // Iterate to calculate the dot product of the i-th row of A and j-th column of B
                for (int k = 0; k < n; k++) {
                    // Multiply matching elements and accumulate the sum in C[i][j]
                    C[i][j] += A[i][k] * B[k][j]; 
                }
            }
        }
        
        // Print the original Matrix A
        System.out.println("Matrix A:");
        // Arrays.deepToString is a handy method to print multi-dimensional arrays quickly
        System.out.println(Arrays.deepToString(A));

        // Print the original Matrix B
        System.out.println("Matrix B:");
        System.out.println(Arrays.deepToString(B));

        // Print the final multiplied Matrix C
        System.out.println("Resulting Matrix C:");
        System.out.println(Arrays.deepToString(C));

        // Close the scanner to prevent memory leaks
        sc.close();
    }
}
