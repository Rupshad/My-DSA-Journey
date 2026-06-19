import java.util.*; // needed for Arrays.toString()

public class Basics {
    public static void main(String[] args) {
        String[] fruits = new String[3]; // declare an array
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";

        System.out.println(Arrays.toString(fruits));
        System.out.println(fruits[1]); // access an element by its index

        int marks[] = {10,20,30,40,50}; // Declare and initialization in one line
        System.out.println(Arrays.toString(marks));

        fruits[0] = "Cherry";  //Update elements by index
        System.out.println(Arrays.toString(fruits));
        System.out.println(marks.length); // find array length

        
        Scanner sc = new Scanner(System.in); // take array input
        int[] arr = new int[5];
        for(int i=0;i<5;i++){  // print array elements using a loop
            System.out.println("Enter value for index "+i);
            arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            sc.close();
        }


    }

