package Conditionals.java;

import java.util.Scanner;

public class GreatestOfThreeNumberUsingElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter a 2st number : ");
        int b = sc.nextInt();
        System.out.print("Enter a 3st number : ");
        int c = sc.nextInt();
        if(a>=b && a>=c) System.out.println(a+" is greatest");
        else if(b>=a && b>=c) System.out.println(b+" is greatest");
        else System.out.println(c+" is greatest");
    }
}
