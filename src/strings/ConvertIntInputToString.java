package strings;

import java.util.Scanner;

public class ConvertIntInputToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        String s = "" + n;
//        s += n;
        System.out.println(s);
    }
}
