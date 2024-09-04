package LOOP.java;

import java.util.Scanner;

public class ApMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //  4 7 10 13 16 19 ...
        int a=4 , d=3; // d is defrence between number + or -
        for (int i=1;i<=n;i++) {
            System.out.println(a);
            a += d;
        }
    }
}
