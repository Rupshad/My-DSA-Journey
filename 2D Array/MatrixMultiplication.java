import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns for matrix A:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Enter rows and columns for matrix B:");
        int p=sc.nextInt();
        int q=sc.nextInt();
        if(n==p){
            System.out.println("Both the matrices are applicable for multiplication.");
        }
        int[][]A=new int[m][n];
        int[][]B=new int[p][q];
        int[][]C=new int[m][q];
        System.out.println("Enter elements for Matrix A:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements for Matrix B:");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                B[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
                for(int k=0;k<n;k++){
                    C[i][j]+=A[i][j]*B[i][j];
                }
            }
        }
        System.out.println("Matrix A:");
        System.out.println(Arrays.deepToString(A));

        System.out.println("Matrix B:");
        System.out.println(Arrays.deepToString(B));

        System.out.println("Resulting Matrix C:");
        System.out.println(Arrays.deepToString(C));

        sc.close();

        
    }
    

    
}
