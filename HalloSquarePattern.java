import java.util.Scanner;

public class HalloSquarePattern {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        for(int i=1; i <= n; i++){
            for(int j=1; j <= n; j++){

                //(i==1 || i==n || j==1 || j==n) HalloSquarePattern
                // ( i==n || j==1 || j==n) HalloSquarePattern with no starting row
                // ( i==1 || j==1 || j==n) HalloSquarePattern with no ending row

                
                if( i==n || j==1 || j==n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}