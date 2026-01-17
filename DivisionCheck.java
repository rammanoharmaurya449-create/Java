import java.util.Scanner;
public class DivisionCheck {
    public static void main(String args[] ) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        if(b==0){
            System.out.println("Division by zero is not allowed");
        } else {
            int division = a / b;
            System.out.println("The result of division is : " + division);
        }
    }

}