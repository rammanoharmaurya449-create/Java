public class AddFloat {
    
    static float add(float a, float b){
        return a+b;
    }
    static float sub(float a, float b){
        return a-b;
    }
    static float mul(float a,float b){
        return a*b;
    }
    static float div(float a,float b){
        return a/b;
    }

    public static void main(String args[]){
        double a=15.5;
        double b=10.5;
        float addresult=add((float)a,(float)b);
        float subresult=sub((float)a,(float)b); 
        float mulresult=mul((float)a,(float)b);
        float divresult=div((float)a,(float)b);
        System.out.println("Addition of two float number is : "+addresult);
        System.out.println("Subtraction of two float number is : "+subresult);
        System.out.println("Multiplication of two float number is : "+mulresult);
        System.out.println("Division of two float number is : "+divresult);
    }

}
