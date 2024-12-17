package Strings_Stringbuilders;

public class Append {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Abc");
        System.out.println(s);  // Abc
        s.append(35);
        System.out.println(s);  // Abc35
        s.append("*");
        System.out.println(s);  // Abc35*
        s.append("xyz");
        System.out.println(s);  // Abc35*xyz

        char[] ch = {'s','u','b'};
        s.append(ch);
        System.out.println(s);  // Abc35*xyzsub

        StringBuilder t = new StringBuilder("pqr");
        s.append(t);
        System.out.println(s);  // Abc35*xyzsubpqr

        int[] arr ={1,2,3};
        s.append(arr);  // does not work, address is appended
        System.out.println(s);  // Abc35*xyzsubpqr[I@7b23ec81

        // s += "newn";  // not possible
    }
}
