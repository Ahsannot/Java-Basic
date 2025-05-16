public class FindSumOfDigitsInNumber {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;
        while (number > 0) {
            int remainder = number % 10; // 5, 4, 3, 2, 1 get last number 
            sum = sum + remainder; // 5, 9, 12, 14, 15 add last number to sum
            number = number / 10; // 1234, 123, 12, 1, 0 remove last number
        }
        System.out.println("Sum of digits in the given number is: " + sum); // 15
    }
}