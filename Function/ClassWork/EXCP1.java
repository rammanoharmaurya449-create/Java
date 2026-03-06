// Checking Method Arguments
import java.io.*;

class EXCP1 {
    public static void main(String[] args) {

        
        String s = "";

        try {
            System.out.println(getLength(s));
        }
        catch (IllegalArgumentException e) {
            System.out.println(
                "IllegalArgumentException caught");
        }

        
        s = "GeeksforGeeks";

        try {
            System.out.println(getLength(s));
        }
        catch (IllegalArgumentException e) {
            System.out.println(
                "IllegalArgumentException caught");
        }

        
        s = null;

        try {
            System.out.println(getLength(s));
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
        s = null;
}


    public static int getLength(String s)
    {
        if (s == null)
            throw new IllegalArgumentException(
                "The argument cannot be null");

        return s.length();
    }
}