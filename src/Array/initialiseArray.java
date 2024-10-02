package Array;

import java.util.Scanner;

public class initialiseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, -9, 34, 5, 8, 59, 100, 5, 6, 7, 94, 15, 22, 97, 36, 4};
        int n = arr.length;
        for(int i=0;i<7;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // array length
        System.out.println(n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
