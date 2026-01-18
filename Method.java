public class Method{
    static int add(int a,int b){
        return a+b;

    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]) {
        int sum1=add(5,20);
        int sum2=add(5,5,15);
        System.out.println("Sum of two number : "+sum1);
        System.out.println("Sum of  three number : "+sum2);
    
    }
}