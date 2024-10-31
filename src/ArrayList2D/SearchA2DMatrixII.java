package ArrayList2D;

import java.util.Scanner;

public class SearchA2DMatrixII {
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
        int t = sc.nextInt();

        int m = arr.length, n = arr[0].length;
        int i = 0, j = n-1;
        while (i < m && j >= 0){
            if(arr[i][j] == t) {
                System.out.print(true);
            } else if (arr[i][j]>t) {
                // go left
                j--;
            }
            else {
                i++;
            }
            break;
        }
        System.out.print(false);
    }
}
