package Strings_Stringbuilders;

import java.util.Arrays;
import java.util.Scanner;

public class characterWithMaxNumberOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[26];
        // 0-a, 1-b, 2-c, .. 25-z
        for (int i=0; i<s.length();i++) {
            char ch = s.charAt(i);
            int idx = (int)ch - 97;
            freq[idx]++;
            // freq[(int)s.charAt(i) - 97]++;
        }
        int maxFreq = -1; // -1 or 0
        for(int i=0; i<freq.length;i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }
        for(int i=0; i<freq.length; i++) {
            if(freq[i] == maxFreq) {
                char ch = (char)(i+97);
                System.out.print(ch+" ");
            }
        }
    }
}
