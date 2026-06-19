import java.util.*;
public class arrayrotation {
    static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n=sc.nextInt();

        int[] arr= new int[n];
        System.out.println("Start entering the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter no of rotations:");
        int k=sc.nextInt();
        k=k%n;  //handle cases whwre k>n

        //Step 1: reverse n-k elements
        reverse(arr,0,n-k-1);

        //Step 2: reverse k elements
        reverse(arr,n-k,n-1);

        //Step 3: reverse the whole array
        reverse(arr,0,n-1);

        System.out.println("After rotation, the array is:");
        for(int x : arr){  // similar to for (int i = 0; i < arr.length; i++) {
                           //System.out.print(arr[i] + " ");}

            System.out.print(x+" ");
        }
        sc.close();
        

        }
        



    }

