import java.util.*;
public class Cube {
    public static int cube(int n){
        return n*n*n;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("The cube is "+cube(num));
        sc.close();
    }
}

