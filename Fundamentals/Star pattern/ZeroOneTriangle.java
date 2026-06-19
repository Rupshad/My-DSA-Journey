public class ZeroOneTriangle {
    public static void main(String[] args) {
        int n = 4;  // number of rows

        for(int i = 1; i <= n; i++) {         // outer loop: rows
            for(int j = 1; j <= i; j++) {     // inner loop: columns
                if((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();             // move to next line
        }
    }
}
 
