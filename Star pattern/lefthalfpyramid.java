public class lefthalfpyramid {
    public static void main(String[] args) {

        // Loop through each row
        for (int i = 1; i <= 4; i++) {

            // Print stars for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
