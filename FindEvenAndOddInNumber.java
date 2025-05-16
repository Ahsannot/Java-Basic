public class FindEvenAndOddInNumber {
    public static void main(String[] args) {
        int number = 123456;
        int even = 0;
        int odd = 0;
        while (number > 0) {
            int digit = number % 10; // get last digit of number by dividing it by 10 and taking remainder as digit value 
            if (digit % 2 == 0) { // check if digit is even or odd by dividing it by 2 and checking remainder 
                even++; // increment even count if digit is even 
            } else {
                odd++; // increment odd count if digit is odd 
            }
            number = number / 10; // remove last digit from number 
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}