package LOOP;

import java.util.Scanner;

public class CompositeNumberAsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x=0; // 0 means prime
        for (int i=2;i<=n-1;i++){
            if (n%i==0){
                System.out.println("Composite Number");
                x = 1;
                break;
            }
        }
        if (n==1) System.out.println("Neither Prime nor Composite Number");
        else if (x==0) System.out.println("Prime Number");
    }
}
