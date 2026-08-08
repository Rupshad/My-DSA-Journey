import java.util.*;
public class GCD {
    public static int gcd(int a, int b) {
        while(b!=0){
            int remainder = a%b;
            a=b;
            b=remainder;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
        sc.close();
    }
}
            

        
    


