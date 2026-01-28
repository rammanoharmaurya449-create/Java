 
 /*defult
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
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.display();
    }
}
    class Student {parameterised
    String name;
    int age;
    int prn;

    // Parameterized constructor
    Student(String name, int prn, int age) {
        this.name = name;
        this.prn = prn;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("PRN: " + prn);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ram Manohar Maurya", 151, 20);
        student1.display();
    }
}
class couneter{
    static int count =0;
    couneter(){
        
        count++;
        System.out.println("Number of objects created: " + count);

    }
}
public class Main {
    public static void main(String[] args) {
        couneter obj1 = new couneter();
        couneter obj2 = new couneter();
        couneter obj3 = new couneter();
    }
}


class Student {
    int id ;
    String name;
    int prn;
    static String college = "ABC College";
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Ram Manohar Maurya";
        s1.prn = 151;  
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("PRN: " + s1.prn);
        System.out.println("College: " + Student.college);
        Student s2 = new Student();
        s2.id = 102;
        s2.name = "Dinesh Yadav";
        s2.prn = 152;  
        System.out.println("ID: " + s2.id);
        System.out.println("Name: " + s2.name);
        System.out.println("PRN: " + s2.prn);
        System.out.println("College: " + Student.college);
    }

}
    */
class Persons{
    String name;
    void display(){
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        Persons p1 = new Persons();
        p1.name = "Ram Manohar Maurya";
        p1.display();
    }

}

