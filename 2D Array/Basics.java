import java.util.*;

public class Basics {
    public static void main(String[] args) {
        // 1. Declaration and initialization
        int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] arr2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };

        System.out.println("Array using deepToString:");
        System.out.println(Arrays.deepToString(arr));

        // 2. Print using loops
        System.out.println("\nArray using loops:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // 3. Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter no. of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter no. of columns:");
        int columns = sc.nextInt();

        int[][] arr1 = new int[rows][columns];

        System.out.println("Enter elements for the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array entered:");
        System.out.println(Arrays.deepToString(arr1));

        // 4. Table format printing
        System.out.println("Array in table format:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%-5d", arr1[i][j]);
            }
            System.out.println();
        }

        // 5. Changing value
        arr[1][2] = 99;
        System.out.println("\nChanged value: " + arr[1][2]);
        System.out.println(Arrays.deepToString(arr));

        // 6. Accessing a specific element
        System.out.println("Accessed element: " + arr[1][1]);

        // 7. Sum of all elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);

        // 8. Sum of each row
        System.out.println("\nRow sums:");
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        // 9. Sum of each column
        System.out.println("\nColumn sums:");
        for (int j = 0; j < arr[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < arr.length; i++) {
                colSum += arr[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }

        // 10. Find min and max
        int max = arr[0][0];
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) max = arr[i][j];
                if (arr[i][j] < min) min = arr[i][j];
            }
        }
        System.out.println("\nMaximum element: " + max);
        System.out.println("Minimum element: " + min);

        // 11. Transpose of matrix
        int n = arr.length;
        int[][] trans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                trans[j][i] = arr[i][j];
            }
        }
        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[i].length; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }

        // 12. Addition & subtraction of matrices
        int r = arr.length;
        int c = arr[0].length;
        int[][] sumMat = new int[r][c];
        int[][] diff = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sumMat[i][j] = arr[i][j] + arr2[i][j];
                diff[i][j] = arr[i][j] - arr2[i][j];
            }
        }

        System.out.println("\nSum of two matrices:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sumMat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nDifference of two matrices:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(diff[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
