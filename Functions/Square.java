import java.util.*;
public class Square {
    public static int Sqrt(int n){
        return n*n;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("The square is "+Sqrt(num));
        sc.close();
    }
}
