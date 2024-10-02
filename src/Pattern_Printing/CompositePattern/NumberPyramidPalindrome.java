package Pattern_Printing.CompositePattern;

import java.util.Scanner;

public class NumberPyramidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j = 1; j <= n-i; j++){  // spaces
                System.out.print(" " + " ");
            }
            for (int k=1;k<=i;k++){  // Stars
                System.out.print(k + " ");
            }
            for (int k=1;k<=i-1;k++){  // Stars
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
