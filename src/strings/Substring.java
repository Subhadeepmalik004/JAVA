package strings;

public class Substring {
    public static void main(String[] args) {
        String s = "abcde";
        // string length is 5
        System.out.println(s.length());
        // print current index and after string length
        System.out.println(s.substring(3)); // de
        // print current index to (length - 1)
        System.out.println(s.substring(1,4)); // bcd
        System.out.println(s.substring(2,2)); // empty
        System.out.println(s.substring(2,3)); // c
        System.out.println(s.substring(0,5)); // abcde

    }
}
