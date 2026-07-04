public class PascalsTriangle {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 0; i < rows; i++) {
            // Print more spaces to shift triangle to center
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");  // triple space instead of double
            }

            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num+" ");  // wider width (6 spaces)
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
