package strings;

public class Operator {
    public static void main(String[] args) {
        // + Operator
        String s = "abc";
        String t = "pqr";
//        s = s + t;
        s += t; // s = abcpqr
        System.out.println(s);
        System.out.println("Hi i am " + 10);

        System.out.println("abc"+10+20);  // abc1020
        // "abc"+10+20
        // "abc10"+20
        // "abc1020"
        System.out.println(10+20+"abc");  // 30abc
        // 10+20+"abc"
        // 30+"abc"
        // 30abc
    }
}
