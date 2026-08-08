import java.util.*;
public class posnegzero {
    public static void countNumbers(int num, int[] counts) {
        //counts[0] = countPos;
        //counts[1] = countNeg;
        //counts[2] = countZero;
        if (num > 0) {
            counts[0]++;
        } else if (num<0){
            counts[1]++;
        } else{
            counts[2]++;
        }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] counts = new int[3];
            while(true){
                System.out.println("Enter a number (or press Enter to stop):");
                String input= sc.nextLine();
                if (input.isEmpty()) {
                    break;
            }
            int num = Integer.parseInt(input);
            countNumbers(num, counts);
        }
        System.out.println("Positive numbers: " + counts[0]);
System.out.println("Negative numbers: " + counts[1]);
System.out.println("Zeros: " + counts[2]);
sc.close();



        

        

        
    } 
    
}
