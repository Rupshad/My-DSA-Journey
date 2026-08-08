import java.util.*;
public class Armstrong {
    public static String isArmstrong(int num){
        int original = num;
        int count=0;
        int temp = num;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        int sum=0;
        temp = num;
        while(temp>0){
            int digit = temp%10;
            sum = sum + (int)Math.pow(digit, count);
            temp = temp/10;
        }
        if (sum == original) {
            return "Armstrong";
        
        } else {
            return "Not Armstrong";}
        }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
             System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));
        sc.close();
        
        

    }


}    

