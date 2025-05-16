import java.util.Scanner;


// Concepts Covered:
// Class structure in Java
// Constructors (default & parameterized)
// Method usage for input/output


public class Student {
    // Data members
    String name;
    int age;
    int rollNumber;

    // Default constructor
    public Student() {
        name = "Not Set";
        age = 0;
        rollNumber = 0;
    }

    // Parameterized constructor
    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Method to take input from user
    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter roll number: ");
        rollNumber = sc.nextInt();
        sc.close();
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }

    // Main method to test
    public static void main(String[] args) {
        // Using default constructor + method to input
        Student student1 = new Student();
        student1.inputDetails();
        student1.displayDetails();

        System.out.println();

        // Using parameterized constructor
        Student student2 = new Student("Ahsan", 34, 102);
        student2.displayDetails();
    }
}
