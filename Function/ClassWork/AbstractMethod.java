abstract class Animal {
    abstract void sound();
    void eat() {
        System.out.println("This animal eats food");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class AbstractMethod {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.eat();
    }
}