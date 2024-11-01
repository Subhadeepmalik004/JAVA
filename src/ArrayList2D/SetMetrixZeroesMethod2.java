package ArrayList2D;

import java.util.Arrays;
import java.util.Scanner;

public class SetMetrixZeroesMethod2 {
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
        System.out.println("enter the row : ");
        int A = sc.nextInt();
        System.out.println("Enter the column : ");
        int B = sc.nextInt();
        int[][] arr = new int[A][B];
        input(arr);
        int m = arr.length, n = arr[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        // marking the particular row and col
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        // set the 'true' rows to 0
        for (int i = 0; i < m; i++) {
            if(row[i]==true){  // set ith row to 0
                for(int j=0;j<n;j++){
                    arr[i][j] = 0;
                }
            }
        }
        // set the 'true' cols to 0
        for (int j = 0; j < n; j++) {
            if(col[j]==true){  // set jth cols to 0
                for(int i=0;i<m;i++){
                    arr[i][j] = 0;
                }
            }
        }
//        System.out.println(Arrays.deepToString(helper));
//        System.out.println();
        System.out.println(Arrays.deepToString(arr));
    }
}
