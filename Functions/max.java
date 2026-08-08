import java.util.*;
public class max {
    public static int maxi(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        System.out.println("The maximum number is " + maxi(a, b));
        sc.close();


    }
}
    

