package Pattern_Printing.Special_Patterns;

import java.util.Scanner;

public class OddNumberWithOutMathTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            int a = 1;
            for (int j = 1; j<=i;j++){
                System.out.print(a +" ");
                a += 2;
            }
            System.out.println();
        }
    }
}
