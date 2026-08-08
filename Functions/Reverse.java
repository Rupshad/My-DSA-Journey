import java.util.*;
public class Reverse {
    public static int reverse(int x) {
        int rev=0;
        while(x>0){
            int pop=x%10;
            rev=rev*10+pop;
            x=x/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("The reversed number is:"+ reverse(n));
        sc.close();
    }
}


    

