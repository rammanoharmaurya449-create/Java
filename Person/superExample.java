class parent {
    void display() {
        System.out.println("This is the parent class");
    }
}
class child extends parent {
    void display() {
        super.display();
        System.out.println("This is the child class");

    }
}
public class superExample {
    public static void main(String args[]){
        child c = new child();
        c.display();
    
    }
}