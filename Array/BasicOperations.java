import java.util.*;
public class BasicOperations {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter the value of array at index "+i);
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int sum=0;
        for(int i=0;i<arr.length;i++){ // sum of elements
            sum=sum+arr[i];
        }
        System.out.println("Sum:"+ sum);
        
        double average= sum/arr.length; // average of elements
        System.out.println("Average:"+ average);

        int max= arr[0];  //min and max elements
        int min= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max:"+ max);
        System.out.println("Min:"+ min);

        int neg=0;  //count +ve, -ve, zero elements
        int pos=0;
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos++;
            }
            else if(arr[i]<0){
                neg++;
            }
            else{
                zero++;
            }
        }
            System.out.println("The number of positive numbers is "+pos);
            System.out.println("The number of negative numbers is "+neg);
            System.out.println("The number of zero is "+zero);

            int odd=0;  //count odd , even numbers
            int even=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            System.out.println("No of even numbers:"+ even);
            System.out.println("No of Odd numbers:"+ odd);
            
        
        sc.close();
    }

    

}