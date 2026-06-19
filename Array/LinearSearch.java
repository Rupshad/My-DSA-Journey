import java.util.*;
public class LinearSearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of index of the array:"); //taking input of array size
        int size=sc.nextInt();

        int[] arr=new int[size];

        for(int i=0;i<size;i++){   //taking input for array
            System.out.println("Enter the value for index"+ i);
            arr[i]=sc.nextInt();
        }
        System.out.println("The following array is:"+ Arrays.toString(arr));

        System.out.println("Enter target element:");  //take target element
        int target=sc.nextInt();

        int index=-1;  //linear search logic
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }

        if(index==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("Element found on index "+index);
        }





        sc.close();




        
    }
}