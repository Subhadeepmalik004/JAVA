package Conditionals.java;

import java.util.Scanner;

public class LeastOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number : ");
        int c = sc.nextInt();

        if(a<=b && a<=c) System.out.println(a+" is lowest");
        else if(b<=a && b<=c) System.out.println(b+" is lowest");
        else System.out.println(c+" is lowest");
    }
}
