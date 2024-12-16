package LOOP;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();


        int count = 0;
        int sum = 0;
        while (n!=0){
            int ld = n%10;
            sum += ld;
            n/=10;
            count++;
        }
        System.out.println(sum);
    }
}
