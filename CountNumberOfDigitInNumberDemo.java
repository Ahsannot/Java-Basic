import java.util.Scanner;

public class CountNumberOfDigitInNumberDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt(); // 12345
        int count = 0;
        while (number > 0) {
            number = number / 10; // 12345, 1234, 123, 12, 1, 0
            count++; 
        }
        System.out.println("Number of digits in the given number is: " + count);
        sc.close();
    }
}