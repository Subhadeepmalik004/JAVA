package Conditionals;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side : ");
        int a = sc.nextInt();
        System.out.println("Enter 1st side : ");
        int b = sc.nextInt();
        System.out.println("Enter 1st side : ");
        int c = sc.nextInt();

        if((a+b)>c && (b+c)>a && (c+a)>b) System.out.println("Valid Triangle");
        else System.out.println("Invalid Triangle");
    }
}
