package Strings_Stringbuilders;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String s = "Subha";
        char[] ch = s.toCharArray();
        for(char ele : ch) {
            System.out.print(ele);  // Subha
        }
        System.out.println();
        Arrays.sort(ch);
        for(char ele : ch) {
            System.out.print(ele);  // Sabhu
        }
        System.out.println();

        // String Builder
        StringBuilder sb = new StringBuilder("malik");
        char[] arr = sb.toString().toCharArray();
        for(char ele : arr) {
            System.out.print(ele);  // malik
        }
        System.out.println();
        Arrays.sort(arr);
        for(char ele : arr) {
            System.out.print(ele);  // aiklm
        }
        System.out.println();
    }
}
