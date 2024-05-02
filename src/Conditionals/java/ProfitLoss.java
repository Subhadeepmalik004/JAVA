package Conditionals.java;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price : ");
        int cp = sc.nextInt();
        System.out.println("Enter selling price : ");
        int sp = sc.nextInt();

        if(sp > cp) System.out.println("Profit is "+(sp-cp));
        if(cp > sp) System.out.println("Loss is "+(cp-sp));
        else System.out.println("No Profit No Loos");
    }
}
