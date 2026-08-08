import java.util.*;
public class evenodd{
    public static boolean EvenOdd(int a) {
        return a%2==0;
        
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int a= sc.nextInt();
        System.out.println(EvenOdd(a));
        sc.close();


    }
}
    

