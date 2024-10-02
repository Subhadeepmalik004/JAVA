package Pattern_Printing.CompositePattern;

import java.util.Scanner;

public class NumberSpiRalrevers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=2*n-1; j++){
                int a=i, b=j;
                if(i>n) a = 2*n-i;
                if(j>n) b = 2*n-j;
                System.out.print(n+1-Math.min(a,b) + " ");
            }

            System.out.println();
        }
    }
}

//Output

//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4