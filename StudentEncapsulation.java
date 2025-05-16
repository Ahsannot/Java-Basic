public class StudentEncapsulation {
    // Private data members (encapsulation)
    private String name;
    private int age;
    private int rollNumber;

    // Constructor
    public StudentEncapsulation(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Getter and Setter for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Display method
    public void display() {
        System.out.println("StudentEncapsulation Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Roll Number: " + getRollNumber());
    }

    // Main method
    public static void main(String[] args) {
        StudentEncapsulation s = new StudentEncapsulation("Priya", 18, 101);
        s.display();

        // Update age using setter
        s.setAge(19);
        System.out.println("\nAfter updating age:");
        s.display();
    }
}
