import java.util.Scanner;
public class SumandAverage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int positive=0, negative=0, zero=0;
        System.out.println("Enter 10 numbers:");
        for(int i=1; i<=10; i++){
            System.out.println("Enter no"+i+": ");
            int num= input.nextInt();

            if(num>0){
            positive++;
            }
            else if(num<0){
                negative++;
            }
            else{
                zero++;
            }
        }
            System.out.println("The no of positive numbers are:"+ positive);
            System.out.println("The no of negative numbers are:"+ negative);
            System.out.println("The number of zeroes are"+ zero);
            
    
    input.close();
}
}