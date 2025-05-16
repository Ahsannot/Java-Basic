import java.util.Scanner;

public class StudentAdvanced {
    // Data members
    String name;
    int rollNumber;
    int[] marks = new int[3]; // Assume 3 subjects
    int total;
    float percentage;
    char grade;

    // Default constructor
    public StudentAdvanced() {
        name = "Unknown";
        rollNumber = 0;
    }

    // Parameterized constructor
    public StudentAdvanced(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method to input marks
    public void inputMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 3 subjects:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        sc.close();
    }

    // Method to calculate total, percentage and grade
    public void calculateResult() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        percentage = (float) total / 3;

        if (percentage >= 90) grade = 'A';
        else if (percentage >= 75) grade = 'B';
        else if (percentage >= 60) grade = 'C';
        else if (percentage >= 40) grade = 'D';
        else grade = 'F';
    }

    // Method to display student info and result
    public void displayResult() {
        System.out.println("----- Student Report -----");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }

    // Main method to test
    public static void main(String[] args) {
        // Using default constructor
        StudentAdvanced s1 = new StudentAdvanced();
        s1.inputMarks();
        s1.calculateResult();
        s1.displayResult();

        System.out.println();

        // Using parameterized constructor
        StudentAdvanced s2 = new StudentAdvanced("Sneha", 105);
        s2.inputMarks();
        s2.calculateResult();
        s2.displayResult();
    }
}
