package Pattern_Printing.Special_Patterns;

import java.util.Scanner;

public class StarTriangleFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (n alows odd) : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j > n) {
                    System.out.print("*" + " ");
                } else
                    System.out.print(" " + " ");
            }
            System.out.println();
        }

    }
}
