public class StudentConstructor {

    int id;
    String name ;
    int rollno;

    StudentConstructor() {
        System.out.println("Default constructor");
    }

    StudentConstructor(int sid, String sname, int sroll) {
        id = sid;
        name = sname;
        rollno = sroll;
    }
    StudentConstructor(int sid, String sname) {
        id = sid;
        name = sname;
    }
    StudentConstructor(int sid, int sroll) {
        id = sid;
        rollno = sroll;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + id);
        System.out.println("Roll Number: " + rollno);
    }

    public static void main(String[] args) {
        
        StudentConstructor std = new StudentConstructor(15, "Ahsan", 7);
        StudentConstructor std1 = new StudentConstructor();
        StudentConstructor std2= new StudentConstructor(23, 55);
        StudentConstructor std3 = new StudentConstructor(12, "Mudassar");

        std.display();
        std1.display();
        std2.display();
        std3.display();

    }
}