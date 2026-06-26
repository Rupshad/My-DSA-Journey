public class FloydsTriangle {
    public static void main(String[] args) {
        int n = 4;    // number of rows
        int num = 1;  // number counter

        for(int i = 1; i <= n; i++) {         // rows
            for(int j = 1; j <= i; j++) {     // numbers in each row
                System.out.print(num + " ");  // print current number
                num++;                        // increase number
            }
            System.out.println();             // go to next line
        }
    }
}
