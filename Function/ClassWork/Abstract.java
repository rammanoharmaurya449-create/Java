abstract  class shape {
    abstract void draw();
    void message() {
        System.out.println("This is an abstract class");
    }
}
class Circle extends shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
public class Abstract {
    public static void main(String[] args) {
        shape s= new Circle();
    s.draw();
        s.message();
    }
}
