
public class array {
    public static void main(String[] args) {

       String name="ram manohar";
    
       char[] arr=name.toCharArray(); 
       for(int i=arr.length-1;i>=0;i--){

          System.out.print(arr[i]);
         }

    }
}
/* 
import java.lang.StringBuffer;

public class ArrayExample {
    public static void main(String[] args) {

        String name = "ram manohar";

        StringBuffer sb = new StringBuffer(name);
        sb.reverse();

        System.out.println(sb);
    }
}
*/
