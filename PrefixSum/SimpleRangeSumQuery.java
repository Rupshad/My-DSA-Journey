import java.util.Arrays;

public class SimpleRangeSumQuery {
    public static void main(String[] args){
        int[] arr= {2,4,6,3,5};
        int[] prefix= new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(prefix));
        int L=1,R=3;
        System.out.println(prefix[R]-prefix[L-1]);
        System.out.println(prefix[4]);
    }
    
}
