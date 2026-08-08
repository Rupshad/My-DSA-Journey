import java.util.*;
public class AbsoluteValue {
    public static int absoluteValue(int number) {
        if (number < 0) {
            return -number;
        }
        else{
            return number;
        }
        
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int number= sc.nextInt();
        System.out.println("The absolute value of the number is "+absoluteValue(number));
        sc.close();
    }
}
    

