public class PracticeEncapsulation {
    
    private int age;
    private String name;

    PracticeEncapsulation(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if( age > 0 ){
            this.age = age;
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
       
    public void display(){
        System.out.println("StudentEncapsulation Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
    public static void main(String[] args) {
        PracticeEncapsulation pe = new PracticeEncapsulation(35, "Ahsan");
        pe.display();

        // Update age and name using setter
        pe.setAge(19);
        pe.setName("Rashid");
        System.out.println("\nAfter updating age and name:");
        pe.display();



    }
}
