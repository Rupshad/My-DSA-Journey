import java.util.*;
public class Sumofdigit {
    public static int sumUpTo(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Sum of first "+n+" natural numbers is "+sumUpTo(n));
        sc.close();
    }
}
