import java.util.*;
public class sumofsquares {
    public static int sumUpTo(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum=sum+(i*i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("The sum of squares upto n:"+sumUpTo(n));
        sc.close();
    }
}
