import java.util.*;
public class MeanMedian{
    static int mean(int[] arr) {
        // code here
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        return (int) sum/arr.length;
        
    }

    static int median(int[] arr) {
        
        
        Arrays.sort(arr);
        int n=arr.length;
        double median;
        if(n%2==0){
            median=(arr[n/2 - 1]+arr[n/2])/2.0;
        }
        else{
            median=arr[n/2];
        }
        return(int) Math.floor(median);
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        double Mean=mean(arr);
        double Median=median(arr);
        
        System.out.println("Mean:"+ Mean);
        System.out.println("Median:"+ Median);
        
        sc.close();
    }
}