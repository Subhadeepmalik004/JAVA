package LOOP;

import java.util.Scanner;

public class TableOf19 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        for (int i=19;i<=190;i+=19){
            if (i%19==0){
                System.out.print(i+" ");
            }
        }
    }
}
