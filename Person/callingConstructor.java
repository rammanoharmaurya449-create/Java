class Demo {
    Demo() {
        this("Defult constructor");
    }
    Demo(String message){
        System.out.println(message);
    }
    
}
public class callingConstructor{
    public static void main(String args[]){
    new Demo();

    }
}   