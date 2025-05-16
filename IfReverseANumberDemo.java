public class IfReverseANumberDemo {
 
    public static void main (String[] args) {
        int number = 1234;
        int reversedNumber = 0;
        int temp = 0;
        while (number > 0) {
            temp = number % 10; //1234 % 10 = 4
            reversedNumber = reversedNumber * 10 + temp; // 0 * 10 + 4 = 4
            number = number / 10; // 1234 / 10 = 123
        }
        System.out.println("Reversed Number is: " + reversedNumber);
    }
}