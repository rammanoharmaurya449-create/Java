package mypack;


public class Myclass{
    public void display(){
        System.out.println("This is Myclass in mypackage");

    }
}
import mypack.Myclass;
public class PackageExample {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.display();
    }
}