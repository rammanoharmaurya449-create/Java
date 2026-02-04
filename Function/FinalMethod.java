final class vehicle {
    final int speedlimt =90;
    final void displaySpeed() {
        System.out.println("The speed limit is : " +speedlimt +  "km/h");
    }    
}
public class FinalMethod {
    public static void main(String args[]){
        vehicle v=new vehicle();
        v.displaySpeed();
    }
}