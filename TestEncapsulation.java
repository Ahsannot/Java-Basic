public class TestEncapsulation{

    private String username;
    private String pass;

    TestEncapsulation (){
        this.username = "";
        this.pass = "";
    }

    public String getName(){
        return username;
    }
    public void setName(String username){
        this.username = username;
    }

    public String getPass(){
        return pass;
    }
    public void setPass(String pass){
        this.pass = pass;
    }

    public void display(){
        System.out.println("UserName is : " + getName());
        System.out.println("Password is  : " + getPass());
    }

    public static void main(String[] args) {
        TestEncapsulation tc = new TestEncapsulation();

        tc.setName("Ahsan");
        tc.setPass("ahsakd457888");
        tc.display();
    }
}

    // public class Student {
    //     private String name;  // private variable
    
    //     public static void main(String[] args) {
    //         Student s = new Student();
    //         s.name = "Ali";  // ✅ allowed because it's within the same class
    //         System.out.println("Name: " + s.name);
    //     }
    // }





    

    // public class Student {
    //     private String name;
    
    //     // Public setter
    //     public void setName(String name) {
    //         this.name = name;
    //     }
    
    //     // Public getter
    //     public String getName() {
    //         return name;
    //     }
    // }
    
    // // Separate class with main method
    // public class Main {
    //     public static void main(String[] args) {
    //         Student s = new Student();
    //         s.setName("Aisha");  // ✅ use setter
    //         System.out.println("Name: " + s.getName());  // ✅ use getter
    //     }
    // }
    
