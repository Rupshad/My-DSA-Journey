public class PascalsTriangle {

    public static void main(String[] args) {

        int rows = 6;

        // Traverse each row
        for (int i = 0; i < rows; i++) {

            // Print leading spaces to center the triangle
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // First element of every row is always 1
            int num = 1;

            // Print all elements in the current row
            for (int j = 0; j <= i; j++) {

                System.out.print(num + " ");

                // Calculate the next element using the binomial coefficient formula
                num = num * (i - j) / (j + 1);
            }

            // Move to the next row
            System.out.println();
        }
    }
}
