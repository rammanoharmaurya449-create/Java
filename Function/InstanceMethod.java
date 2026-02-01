class Student{
    String name;
    int prn;
    int rollNo;
    Student(String name,int prn,int rollNo){
        this.name=name;
        this.prn=prn;
        this.rollNo=rollNo;

    }
    void display(){
        System.out.println("Name is :"+name);
        System.out.println("PRN is :"+prn);
        System.out.println("RollNo is :"+rollNo);

    }
}
public class InstanceMethod{
    public static void main(String args[]){
        System.out.println("Student Details");
        Student s1 =new Student("Ramesh",152,12453);
        Student s2=new Student("Suresh",158,12454);
        s1.display();
        s2.display();
        System.out.println();
    }
}