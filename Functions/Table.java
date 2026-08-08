import java.util.*;
public class Table {
    public static void printTable(int num){
        for(int i=1;i<=20;i++){
            System.out.println(num+"*"+i+"="+ num*i);
        }

    }


    

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    
    System.out.println("Enter a number: ");
    int number = sc.nextInt();
    printTable(number);
    sc.close();
}
}


