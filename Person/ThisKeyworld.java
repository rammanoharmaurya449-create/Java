class Student{
    String name;
    int prn;
    Student(String name, int prn){
        this.name=name;
        this.prn=prn;
    }
    void display(){
        System.out.println("Name is :"+name);
        System.out.println("PRN is :"+prn);
        
    }
}
public class ThisKeyworld{
    public static void main(String args[]){
        System.out.println("Student Details");
        Student s1 =new Student("Ramesh",157);
        Student s2=new Student("Suresh",158);
       
        s1.display();
        s2.display();
        
    }
}