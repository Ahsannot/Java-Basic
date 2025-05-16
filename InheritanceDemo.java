class SingleParent {
    int x = 5;
    void display() {
        System.out.println("Parent Class ...");
    }
}

class SingleChild extends SingleParent {
    void show() {
        //super.display();
        System.out.println(super.x);
        System.out.println("Child Class ...");
    }

    void display() {
        System.out.println("Parent Class in SingleChild");
    }
}

class GrandChild extends SingleChild {
    void info() {
        System.out.println("Grand Child Class starts here ...");
        //super.show();
        System.out.println(super.x);
        System.out.println("Grand Child Class ...");
    }

    void display() {
        System.out.println("Parent Class in GrandChild");
    }
}

class Animals extends SingleParent{
    void Animdisplay() {
        System.out.println("Animals Class ...");
        //super.display();
    }

    void display() {
        System.out.println("Parent Class in Animals");
    }
}

class Cats extends Animals  {
    void Catdisplay() {
        System.out.println("Cats Class ...");
        //super.display();
    }

    void display() {
        System.out.println("Parent Class in Cats");
    }
}


public class InheritanceDemo {
    public static void main(String[] args) {
       // GrandChild gc = new GrandChild(); 
       // gc.info();
        Cats ct = new Cats();
        Animals an = new Animals();
        ct.Catdisplay();
        ct.display();
        an.Animdisplay();
        an.display();


    }
}
