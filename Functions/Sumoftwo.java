import java.util.*;
public class Sumoftwo {
    public static int SumofTwoint(int a, int b) {
        int sum= a+b;
        return sum;
        
        
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a= sc.nextInt();
        System.out.println("Enter second number");
        int b= sc.nextInt();
        int sum= SumofTwoint(a,b);
        System.out.println("Sum of two numbers is "+sum);
        sc.close();
    }
}
    

