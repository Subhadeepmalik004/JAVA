package Pattern_Printing.CompositePattern;

import java.util.Scanner;

public class NumberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int l=1;l<=(2*n)-1;l++){
            System.out.print(l + " ");
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            for (int j = 1; j <= n+1-i; j++){  // number
                System.out.print(j + " ");
            }
            for (int k=1;k<=2*i-1;k++){  // Stars
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= n; j++){  // reverse number
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
