interface parent1 {
    int a = 5;
    void display();
}

interface parent2 {
    int x = 5;
    void show();
}

class Animal {
    void Animdisplay() {
        System.out.println("Animals Class ...");
        //super.display();
    }
}

// Class implementing the interface
public class InterfaceDemo extends Animal implements parent1,parent2{
    // Implementing the interface method
     public void display() {
        System.out.println("Implementing the Multiple Inheritance via INTERFACES");
        System.out.println("Value of a = " + a);
    }

    public void show() {
        System.out.println("Implementing the interface");
        System.out.println("Value of x = " + x);
    }

    public void Animdisplay() {
        System.out.println("Implementing the Hybrid inheritance using Interface");
        
    }

    public static void main(String[] args) {
        InterfaceDemo ID = new InterfaceDemo();
        ID.display();
        ID.show();
        ID.Animdisplay();
    }
}
