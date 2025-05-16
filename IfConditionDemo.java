public class IfConditionDemo {

    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        }

        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negtive.");
        }

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negtive.");
        } else {
            System.out.println("The number is zero.");
        }
        System.out.println("Statement after if block");
    }
}