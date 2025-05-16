public class ExpressionsInJavaDemo {

    public static void main(String[] args) {
        
        // Expressions
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Sum of a and b is: " + c);

        int d = a - b;
        System.out.println("Difference of a and b is: " + d);

        int e = a * b;
        System.out.println("Product of a and b is: " + e);

        int f = a / b;
        System.out.println("Division of a and b is: " + f);

        int g = a % b;
        System.out.println("Modulus of a and b is: " + g);

        // Increment and Decrement operators
        int h = 10;
        h++;
        System.out.println("Increment of h is: " + h);

        int i = 20;
        i--;
        System.out.println("Decrement of i is: " + i);

        // Relational operators
        int j = 10;
        int k = 20;
        System.out.println("Is j less than k? " + (j < k));
        System.out.println("Is j greater than k? " + (j > k));
        System.out.println("Is j less than or equal to k? " + (j <= k));
        System.out.println("Is j greater than or equal to k? " + (j >= k));
        System.out.println("Is j equal to k? " + (j == k));
        System.out.println("Is j not equal to k? " + (j != k));

        // Logical operators
        boolean l = true;
        boolean m = false;
        System.out.println("Logical AND of l and m is: " + (l && m));
        System.out.println("Logical OR of l and m is: " + (l || m));
        System.out.println("Logical NOT of l is: " + (!l));

        // Increment and Decrement operators
        int n = 10;
        // n++;
        System.out.println("Increment of n is: " + n);
        int result = n++; // Post increment
        System.out.println("Result of n++ is: " + result);
        System.out.println("Value of n after post increment is: " + n);
        ++n; // Pre increment
        System.out.println("Value of n after pre increment is: " + n);

        // Assignment operators
        int o = 10;
        o += 5; // o = o + 5
        System.out.println("Value of o after += is: " + o);
        o -= 5; // o = o - 5
        System.out.println("Value of o after -= is: " + o);
        o *= 5; // o = o * 5
        System.out.println("Value of o after *= is: " + o);
        o /= 5; // o = o / 5
        System.out.println("Value of o after /= is: " + o);
        o %= 5; // o = o % 5
        System.out.println("Value of o after %= is: " + o);
        
    }
}
