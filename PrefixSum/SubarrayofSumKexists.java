import java.util.*;
public class SubarrayofSumKexists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        int[] prefix= new int[arr.length];
        System.out.println("Enter the sum:");
        int k=sc.nextInt();
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        if()

    }
    
}
