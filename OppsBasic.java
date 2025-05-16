public class OppsBasic {

    String name;
    int age ;
    static String school = "Apna School";
    String saddress ;

    String teacher;
    String gender;
    String subject;

    public OppsBasic(){
        age = 0;
        name = "Unknown";
        saddress = "";
    }

    public OppsBasic(String name,int age){
        this.age = age;
        this.name = name;
    }

    public void info(){
        System.out.println("-----------Student Information -----------------");
    }

    public void info(String saddress){
        System.out.println("School name is :" + saddress);
    }
    public void display(){
        System.out.println("Name of the student is : " + name);
        System.out.println("Age of the student is : " + age);
        System.out.println("Address is :" + saddress);
        System.out.println("School name is :" + school);
    }

    public void teacherInfo( String teacher, String gender, String subject){
         this.teacher = teacher ;
         this.gender  = gender;
         this. subject = subject;
         info();
         display();
    }
    public void teacherInfodisplay(){
        System.out.println("Teacher name is : "+ teacher);
        System.out.println("and is : " + gender);
        System.out.println("and teaching : " + subject);
        System.out.println("and teaching : " + subject);
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        OppsBasic ob = new OppsBasic();
        OppsBasic ob1 = new OppsBasic("Ahsan Ali", 34);
        
        // OppsBasic ob2 = new OppsBasic();
        // ob.display();
        // ob.info();
        // ob2.info("53/2-L");
        // ob1.display();
        // ob2.display();

        OppsBasic tech = new OppsBasic();
        tech.teacherInfo("Mudassar","Male","Computer");
        tech.teacherInfodisplay();
    }
}
