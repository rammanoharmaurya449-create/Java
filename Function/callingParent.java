class Parent{
    Parent(){
        System.out.println("This is parent class constructor");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("This is child class constructor");
    }
}
public class callingParent{
    public static void main(String args[]){
        new Child();
    }
}