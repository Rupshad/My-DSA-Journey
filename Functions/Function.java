import java.util.*;
public class Function {
    public static void PrintMyName(String name){
        System.out.println(name);
        return;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = sc.next();

    PrintMyName(name);
    sc.close();
}

}


    

