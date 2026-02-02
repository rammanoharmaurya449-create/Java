class Parent {
    final void show() {
        System.out.println("This is a final method in Parent class");
    }
}
class  Child extends Parent {
    
}
public class FinalMethod {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}