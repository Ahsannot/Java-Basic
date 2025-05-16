import java.util.Scanner;

public class FineDuplicateElement{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println( arr[i]+ " is Duplicate element found at " + i + " and " + j + " position.");
                    flag = true;
                }
            }
        }
        if(flag == false){
            System.out.println("No duplicate element found in the array.");
        }
        sc.close();
    }
}