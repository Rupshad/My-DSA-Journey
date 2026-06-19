import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element "+(i)+": ");
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
    }
        System.out.println("The Sorted Array is:" +Arrays.toString(arr));
        sc.close();
    
}
        

    
}
