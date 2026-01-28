class Student{
    String name;
    int age;
    int prn;
    Student(){
        name = "Ram Manohar  Maurya";
        prn=151;
        age = 20;

    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("PRN: " + prn);
        System.out.println("Age: " + age);
        
    }

} 
public class  {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.display();
    }
}