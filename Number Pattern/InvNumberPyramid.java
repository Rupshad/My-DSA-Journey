import java.util.Scanner;
public class InvNumberPyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=n;i>=1;i--){  //Row count
            for(int j=1;j<=n-i;j++){  //Column count
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();

        }
        sc.close();
    
}
}
