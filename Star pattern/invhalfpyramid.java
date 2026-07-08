public class InvertedHalfPyramid {

    public static void main(String[] args) {

        int n = 4;

        // Traverse each row from top to bottom
        for (int i = n; i >= 1; i--) {

            // Print stars in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
