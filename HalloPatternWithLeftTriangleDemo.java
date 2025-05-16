import java.util.Scanner;

public class HalloPatternWithLeftTriangleDemo {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();

        for(int i=1; i <= n; i++){
            for(int j=1 ; j <= i; j++){
                if(i==j || j==1 || i==n){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            }
            sc.close();
        }
    }

