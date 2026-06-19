import java.util.Arrays;

public class ShellSort {
    public static int[] Shell(int[] arr){
        for(int gap=arr.length/2;gap>0;gap=gap/2){
        for(int i=gap;i<arr.length;i++){
            int j=i;
            
            
                while(j>=gap && arr[j]<arr[j-gap]){
                    int temp=arr[j];
                    arr[j]=arr[j-gap];
                    arr[j-gap]=temp;
                    j=j-gap;
                }
            
        }
    }

        
        return arr;
    }
    public static void main(String[] args){
        int arr[]={5,4,3,2,1};
        int arr1[]=Shell(arr);
        System.out.println("the sorted array is :"+ Arrays.toString(arr1));


    }
}
