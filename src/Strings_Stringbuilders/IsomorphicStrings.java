package Strings_Stringbuilders;

import java.util.Scanner;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(isomorphic(s,t));
    }

    private static boolean isomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] a = new char[128]; // '\0' -> null char
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int)ch;
            if (a[idx] == '\0') a[idx] = dh;
            else {
                if(a[idx] != dh) return false;
            }
        }

        for(int i=0; i<128; i++) {
            a[i] = '\0';
        }
        for (int i=0; i<t.length(); i++) {
            char ch = t.charAt(i);
            char dh = s.charAt(i);
            int idx = (int)ch;
            if (a[idx] == '\0') a[idx] = dh;
            else {
                if(a[idx] != dh) return false;
            }
        }

//        char[] b = new char[128]; // '\0' -> null char
//        for (int i=0; i<t.length(); i++) {
//            char ch = t.charAt(i);
//            char dh = s.charAt(i);
//            int idx = (int)ch;
//            if (b[idx] == '\0') b[idx] = dh;
//            else {
//                if(b[idx] != dh) return false;
//            }
//        }

        return true;
    }
}
