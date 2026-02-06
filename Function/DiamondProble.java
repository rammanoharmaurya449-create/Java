interface A{
    default void show(){
        System.out.println("Show From Interface A");
    }
}
interface B {
    default void show(){
        System.out.println("Show From Interface B");
    }
}
class C implements A,B{
    public void show(){
        A.super.show();
        B.super.show();


    }
}
public class DiamondProble{
    public static void main(String[] args){
        C obj =new C();
        obj.show();
    }
}