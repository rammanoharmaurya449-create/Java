public class StringExample {
    public static  void main(String args[]){
        String str1 = "Hello"; 
        String str2 = "World"; 
        String result = str1 + " " + str2; System.out.println("Concatenated String: " + result); int length = result.length(); System.out.println("Length of the string: " + length); String upperCaseResult = result.toUpperCase(); System.out.println("Uppercase String: " + upperCaseResult); boolean containsHello = result.contains("Hello"); System.out.println("Contains 'Hello': " + containsHello);
    }
}
