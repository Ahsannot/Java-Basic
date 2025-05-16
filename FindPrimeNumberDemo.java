public class FindPrimeNumberDemo {
    public static void main(String[] args) {
        int number = 9;
        int count = 0;
        if (number > 1) {
            for (int i = 2; i <= number-1; i++) {  // 2, 3, 4 
                if (number % i == 0)  {  // 9 % 2 = 1, 9 % 3 = 0
                    System.out.println("i: " + i);
                     count++;    // 1, 0
                }
            }
            System.out.println("count: " + count);
            if (count == 0) { 
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}