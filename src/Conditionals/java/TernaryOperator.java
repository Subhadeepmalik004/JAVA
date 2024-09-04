package Conditionals.java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        // condition ? if True : if False
        System.out.println((n%2==0) ? "Even" : "Odd"); // find Even and Odd?
    }
}
