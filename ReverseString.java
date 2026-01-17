public class ReverseString {
    public static void main(String[] args) {
        String str = "ram manohar";
        char[] arr = str.toCharArray();
        int start = 0, end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(new String(arr));
    }
}
