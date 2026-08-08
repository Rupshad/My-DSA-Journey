import java.util.*;
public class exponent {
    public static int Exponent(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter base");
            int base = sc.nextInt();
            System.out.println("Enter exponent");
            int exponent = sc.nextInt();
            System.out.println("The value is :"+ Exponent(base,exponent));
        sc.close();
        }
    

    
}
