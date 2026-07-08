public class RectanglePattern {

    public static void main(String[] args) {

        int rows = 4;
        int cols = 5;

        // Traverse each row
        for (int i = 1; i <= rows; i++) {

            // Print stars in each column
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }

            // Move to the next row
            System.out.println();
        }
    }
}
