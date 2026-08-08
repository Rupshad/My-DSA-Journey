import java.util.*;
public class Palindrome {
    public static String palindrome(int temp){
        int rev=0;
        int original = temp;
        while(temp>0){
        int pop =temp%10;
        rev=rev*10+pop;
        temp=temp/10;
        }
        if(original==rev){
            return "palindrome";
        }
        else{
            return "not palindrome";
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("the number is "+ palindrome(num));
        sc.close();
    }


    

    
}
