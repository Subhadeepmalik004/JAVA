package strings;

import java.util.Scanner;

public class EndsWithStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        System.out.print("Enter the finding string : ");
        String a = sc.nextLine();
        System.out.println(s.endsWith(a));
    }
}
