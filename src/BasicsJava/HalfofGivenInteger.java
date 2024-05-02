package BasicsJava;

import java.util.Scanner;

public class HalfofGivenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int -->> double
        int x = sc.nextInt();
        double y = (double) x;
        System.out.println(x/2);
        System.out.println(y/2);
        // double -->> int
        double a = sc.nextDouble();
        int b = (int) a;
        System.out.println(y);

    }
}
