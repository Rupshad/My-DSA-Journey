import java.util.*;
public class productoftwo {
    public static int productOfTwo(int a, int b) {
        int product = a*b;
        return product;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        int product= productOfTwo(a,b);
        System.out.println("The product of the two numbers is "+product);
        sc.close();
    }
}
    

