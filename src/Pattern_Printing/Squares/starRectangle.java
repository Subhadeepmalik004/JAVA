package Pattern_Printing.Squares;

import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows & Coloms : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i <=m; i++){ // control the number of rows
            for (int j = 1; j<=n; j++){ // control the number of colomns
                System.out.print("* ");
            }
            System.out.println(); // next line
        }
    }
}
