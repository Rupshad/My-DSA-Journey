import java.util.*;
public class SelectionSort {
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
            int minIndex=i;
        
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[minIndex]){
                minIndex=j;
            }
        }
    
        int temp=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;

        System.out.println(Arrays.toString(arr));
        
    }
    sc.close();
}
}

