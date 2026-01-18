class Parent {
    int a = 10;

    void displayParent() {
        System.out.println("This is Parent class");
        System.out.println("Value of a = " + a);
    }
}

class Child extends Parent {
    int b = 20;

    void displayChild() {
        System.out.println("This is Child class");
        System.out.println("Value of b = " + b);
    }
}

public class childClass {
    public static void main(String[] args) {

        Child obj = new Child();

        obj.displayParent();
        obj.displayChild();

        System.out.println("Access parent variable a from child: " + obj.a);
    }
}
