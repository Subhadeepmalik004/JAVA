package LOOP;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        for (int i=1;i<=n;i++){
            System.out.println(a);
           a *= 2; // a * 2 = a;
            //a *= 4;
        }

    }
}