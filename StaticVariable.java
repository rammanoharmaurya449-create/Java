class Student{
    static String collegeName = "Symbiosis internation unversite";
    String name;
    int prn ;
    int age;
    Student(String name,int prn,int age){
        this.name=name;
        this.prn=prn;
        this.age=age;
    }
    void display(){
        System.out.println("Name is :"+name);
        System.out.println("PRN is :"+prn);
        System.out.println("Age is :"+age);
    }
}
public class StaticVariable{
    public static void main(String agrs[]){
        System.out.println("Students Details");
        Student s1=new Student("Rahul", 151,21);
        Student s2=new Student("Anita",155,20);
        s1.display();
        s2.display();
        System.out.println();
    }
}