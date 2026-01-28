import java.util.Scanner;
class  Student {
    String name;
    int rollNo;
    int prn;
    Student(String name,int rollNo,int prn){
        this.name=name;
        this.rollNo=rollNo;
        this.prn=prn;


    }
    void display (){
        System.out.println("name is :"+name);
        System.out.println("Roll Number is :"+ rollNo);
        System.out.println("PRN is :"+ prn);
    }

}
public  class Parameterize {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the name:");
        String name=sc.nextLine();
        System.out.print("Enter the Roll Number:");
        int rollNo=sc.nextInt();
        System.out.print("Enter the PRN:");
        int prn=sc.nextInt();
        Student s = new Student (name,rollNo,prn);
        System.out.println("\nStudent Details");
        s.display(); 
        
    }
} 
