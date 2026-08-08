import java.util.*;
public class LCM {
    public static long gcd(long a, long b) {
        while(b!=0){
            long remainder = a%b;
            a=b;
            b=remainder;
        }
        return a;
    }
    public static long lcm(long a, long b){
        long LcM=(a/gcd(a,b))*b;
        return LcM;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        long a = sc.nextInt();
        System.out.println("Enter the second number: ");
        long b = sc.nextInt();
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a, b));
        sc.close();
    }
}
            

        
    

