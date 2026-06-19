public class righthalfpyramid {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++) {
            // print spaces first
            for(int space = 1; space <= n - i; space++) {
                System.out.print("  ");  // double space for clean look
            }
            // then print stars
            for(int star = 1; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();  // move to next row
        }
    }
}
