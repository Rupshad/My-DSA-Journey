import java.util.Arrays;

public class InsertionSort {
    public static int[] Insertion(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            
            
                while(j>0 && arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
                }
            
        }

        
        return arr;
    }
    public static void main(String[] args){
        int arr[]={5,4,3,2,1};
        int arr1[]=Insertion(arr);
        System.out.println("the sorted array is :"+ Arrays.toString(arr1));


    }
}
