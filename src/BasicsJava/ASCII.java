package BasicsJava;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
//        System.out.println((int)ch);// this code is Right but another way code write down
        int x = (int)ch;
        System.out.println(x);
    }
}
