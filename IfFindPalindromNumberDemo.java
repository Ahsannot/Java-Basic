public class IfFindPalindromNumberDemo {
    public static void main(String[] args) {
        int number = 12321;
        int reversedNumber = 0;
        int temp = 0;
        int originalNumber = number;
        while (number > 0) {
            temp = number % 10; // 12321 % 10 = 1
            reversedNumber = reversedNumber * 10 + temp; // 0 * 10 + 1 = 1
            number = number / 10; // 12321 / 10 = 1232
        }
        if (originalNumber == reversedNumber) {
            System.out.println("Number is Palindrom");
        } else {
            System.out.println("Number is not Palindrom");
        }
    }
}