public class SwitchCharDemo {
    public static void main(String[] args) {
        char grade = 'F';
        String message = " ";
        switch (grade) {
            case 'A':
                message = "Excellent!";
                break;
            case 'B':
                message = "Brilliant!";
                break;
            case 'C':
                message = "Well done";
                break;
            case 'D':
                message = "You passed";
            case 'F':
                message =  "Better try again";
                break;
            default:
                message =  "Invalid grade";
        }
        System.out.println("Your grade is " + message);
    }

}