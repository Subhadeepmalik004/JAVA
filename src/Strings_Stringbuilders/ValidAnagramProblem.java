package Strings_Stringbuilders;

import java.util.Arrays;

public class ValidAnagramProblem {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        // ans -> true

        // another example ->
//        String s = "rat";
//        String t = "car";
        // ans -> false

        System.out.println(anagram(s,t));
    }
    public static boolean anagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i<a.length; i++) {
            if(a[i] != b[i]) return false;
        }
        return true;
    }
}
