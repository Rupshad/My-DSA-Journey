public class Butterfly{
    public static void main(String[] args) {
        int n=4;
        //upper half
        for(int i=1;i<=n;i++){
            //left stars      
            for(int j=1;j<=i;j++){
                System.out.print("*");
                }
            //space
            for(int j=1;j<=2*(4-i);j++){
                System.out.print(" ");
            }
            //right stars
            for(int j=1;j<=i;j++){
                System.out.print("*");

        }
        System.out.println();
    }
        //lower half
        for(int i=n;i>=1;i--){
            //left stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
        }
        //space
        for(int j=1;j<=2*(4-i);j++){
            System.out.print(" ");
        }
        //right stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    
}
}