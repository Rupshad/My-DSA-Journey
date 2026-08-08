import java.util.*;
public class evenoddstring{
    public static String EvenOddString(int a) {
        if(a%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
        
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int a= sc.nextInt();
        System.out.println(EvenOddString(a));
        sc.close();


    }
}
    

