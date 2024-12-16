package Strings_Stringbuilders;

public class Equals {
    public static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz";
        String b = new String(s);
        String c = "abc";
        c = c + "xyz";

        System.out.println(s==a);  // true
        System.out.println(s==b);  // false
        System.out.println(s==c);  // false
        System.out.println();
        System.out.println(s.equals(a));  // true
        System.out.println(s.equals(b));  // true
        System.out.println(s.equals(c));  // true
    }
}
