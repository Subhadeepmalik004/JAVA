package strings;

import java.util.Scanner;

public class IndexOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        int n = s.length();
        System.out.print("Find the index : ");
        String a = sc.nextLine();
        System.out.println(s.indexOf(a));
        System.out.print("Find the Last index : ");
        String b = sc.nextLine();
        System.out.println(s.lastIndexOf(b));
        System.out.println(s.indexOf("@")); // if any char not the string
    }
}
