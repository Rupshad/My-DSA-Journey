import java.util.*;
public class Prime {
    public static String isPrime(int n) {
        if (n <= 1) {
            return "notprime";
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return "notprime";
        }
    }
    return "prime";
}
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n= sc.nextInt();
    System.out.println("the number is "+isPrime(n));
    sc.close();
}
}
        

    

