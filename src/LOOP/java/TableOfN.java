package LOOP.java;

import java.util.Scanner;

public class TableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n;i<=n*10;i+=n){
            if (i%n==0){
                System.out.println(i);
            }
        }
    }
}
