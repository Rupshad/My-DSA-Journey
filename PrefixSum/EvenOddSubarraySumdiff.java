

public class EvenOddSubarraySumdiff {
    public static void main(String[] args){
        int[] arr= {5,2,9,1,7,3}; 
        int n=arr.length;
        int[] evenPrefix= new int[n];
        int[] oddPrefix= new int[n];
        
        for(int i=0;i<n;i++){
            if(i==0){
                evenPrefix[i]=(i%2==0)? arr[i]:0;
                oddPrefix[i]=(i%2!=0)? arr[i]:0;
            }
            else{
                evenPrefix[i]=evenPrefix[i-1]+ ((i%2==0)? arr[i]:0);
                oddPrefix[i]=oddPrefix[i-1]+((i%2!=0)? arr[i]:0);
            }
        }
        int L=1,R=4;
        int evensum=evenPrefix[R]-evenPrefix[L-1];
        int oddsum=oddPrefix[R]-oddPrefix[L-1];
        int difference= evensum-oddsum;

        System.out.println("The difference:"+ difference);


        
    
}
}
