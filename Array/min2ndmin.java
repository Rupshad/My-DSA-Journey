import java.util.*;
public class min2ndmin{
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        
        if(arr.length<2){
            result.add(-1);
            
            return result;
        }
        
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        
        for(int num:arr){
            if(num<min){
                secondMin=min;
                min=num;
            }
            else if(num>min && num<secondMin){
                secondMin=num;
            }
        }
        
        if(secondMin==Integer.MAX_VALUE){
            result.add(-1);
        
        }
        else{
            result.add(min);
            result.add(secondMin);
        }
        return result;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        
        System.out.print("Enter size or array:");
        int n=sc.nextInt();
        
        int[]arr=new int[n];
        System.out.println("Enter elements for array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        ArrayList<Integer> ans= s.min2ndMin(arr);
        
        if(ans.size()== 1 && ans.get(0)== -1){
            System.out.println("No second element found.");
        }else{
            System.out.println("Minimum:"+ ans.get(0));
            System.out.println("Second Minimum:"+ ans.get(1));
        
    }
    sc.close();
    }
}
        
        
    
        
    

