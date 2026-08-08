import java.util.*;
public class factorial {
    public static int fact(int n){
        if(n < 0){
            System.out.println("Invalid number");
            return -1;
                }
                else if(n == 0 || n == 1){
                    return 1;
                }
                else{
                    int fact=1;
                    for(int i=n;i>=1;i--){
                        fact = fact * i;
                    }
                    return fact;}
                }
                public static void main(String[] args){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the number");
                    int num = sc.nextInt();
                    System.out.println("The factorial is:"+ (fact(num)));

                    sc.close();

                }

    

    

    
}

