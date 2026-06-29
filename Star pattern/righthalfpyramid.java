public class righthalfpyramid {
    public static void main(String[] args) {
        int n = 4;  // Number of rows

        // Loop through each row
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");  // Double space for proper alignment
            }

            // Print stars for the current row
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
