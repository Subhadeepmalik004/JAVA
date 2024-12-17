package Strings_Stringbuilders;

import java.util.Scanner;

public class ToggleChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        for(int i=0; i<n;i++) {
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 65 && ascii <= 90) {  // Capital
                ascii += 32;
            }
            else if(ascii >= 97 && ascii <= 122) {  // small
                ascii -= 32;
            }
            ch = (char)ascii;
            sb.setCharAt(i, ch);
        }
        System.out.println(sb);
    }
}
