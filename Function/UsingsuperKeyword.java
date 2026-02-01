class Parent {
    int x = 100;

    Parent() {
        System.out.println("Parent class constructor executed");
    }

    void display() {
        System.out.println("Parent class method executed");
        System.out.println("Value of x = " + x);
    }
}

class Child extends Parent {

    Child() {
        super(); 
        System.out.println("Child class constructor executed");
    }

    void show() {
        super.display();
        System.out.println("Accessing parent variable using super: " + super.x);
    }
}

public class UsingsuperKeyword{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
