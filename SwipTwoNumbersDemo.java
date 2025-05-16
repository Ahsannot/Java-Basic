public class SwipTwoNumbersDemo {

    public static void main(String[] args) {
        // Swapping two numbers using three variables
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + " and b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + " and b = " + b);

        // Swapping two numbers without using third variable
        int c = 30;
        int d = 40;
        System.out.println("Before swapping: c = " + c + " and d = " + d);
        c = c + d; // c = 70 (30 + 40) = 70
        d = c - d; // d = 30 (70 - 40) = 30  
        c = c - d; // c = 40 (70 - 30) = 40
        System.out.println("After swapping: c = " + c + " and d = " + d);

        // Swapping two numbers using * and / operator

        int e = 50;
        int f = 60;
        System.out.println("Before swapping: e = " + e + " and f = " + f);
        e = e * f; // e = 3000 (50 * 60) = 3000
        f = e / f; // f = 50 (3000 / 60) = 50
        e = e / f; // e = 60 (3000 / 50) = 60
        System.out.println("After swapping: e = " + e + " and f = " + f);
        
    }
}