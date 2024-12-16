package Conditionals;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (n%2 == 0) System.out.println("Even");
        if (n%2 == 1) System.out.println("Odd");
        // or, if (n%2 != 0) System.out.println("Odd"); -->> code is right
        // or, else System.out.println("Odd"); -->> code is right
    }
}
