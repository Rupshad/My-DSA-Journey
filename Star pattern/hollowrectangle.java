public class HollowRectangle {

    public static void main(String[] args) {

        int rows = 4;
        int cols = 5;

        // Traverse each row
        for (int i = 1; i <= rows; i++) {

            // Traverse each column
            for (int j = 1; j <= cols; j++) {

                // Print '*' on the boundary cells
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                }
                // Print spaces inside the rectangle
                else {
                    System.out.print("  ");
                }
            }

            // Move to the next row
            System.out.println();
        }
    }
}
