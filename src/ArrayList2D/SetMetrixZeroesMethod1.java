package ArrayList2D;

import java.util.Arrays;
import java.util.Scanner;

public class SetMetrixZeroesMethod1 {
    public static void input(int[][] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for a " + arr.length + "x" + arr[0].length + " array:");
        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j<arr[i].length;j++){
                System.out.print("Enter value for element [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[][] arr = new int[A][B];
        input(arr);
        int m = arr.length, n = arr[0].length;
        int[][] helper;
        helper = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                helper[i][j] = arr[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(helper[i][j]==0) {
                    // set the row and jth col to 0 in arr
                    for (int b = 0; b < n; b++) {
                        arr[i][b] = 0;
                    }
                    for (int a = 0; a < m; a++) {
                        arr[a][j] = 0;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(helper));
        System.out.println();
        System.out.println(Arrays.deepToString(arr));
    }
}
