/* 
import java.util.Scanner;
public class function{
    static void printMyName(String name){
        System.out.println(name);
        return;

    }
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        String name =sc.nextLine();
        printMyName(name);
        sc.close();
    }

}
*/

import java.util.Scanner;
public class function{
    static int Casum(int a,int b){
        int sum = a+b;
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum two number is: "+Casum(a,b));
    }
}
