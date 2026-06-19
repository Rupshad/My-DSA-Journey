import java.util.Arrays;
public class NextPermutation {
    public static void nextPermutation(int[] arr){
        int n=arr.length;
        int i=n-2;

        //step1:find pivot
        while(i>=0 && arr[i]>arr[i+1]){
            i--;
        }
        if(i>=0){
            //step2:find successor
            int j=n-1;
            while(arr[j]>arr[i]){
                j--;
            }
            //step3:swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //step4:reverse suffix
        reverse(arr,i+1,n-1);
    }
    private static void reverse(int[]arr, int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[]arr={1,4,5,3,2};
        nextPermutation(arr);
        System.out.println("Next Permutation:"+ Arrays.toString(arr));
    }

    
}
