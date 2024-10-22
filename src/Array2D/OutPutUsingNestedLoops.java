package Array2D;

import java.util.Scanner;

public class OutPutUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];
        // Input of 2D Array
        for(int i=0; i<2; i++) { // row
            for(int j=0; j<3; j++) { // column
                arr[i][j] = sc.nextInt();
            }
        }

        // Output of 2D Array
        for(int i=0; i<2; i++) { // row
            for(int j=0; j<3; j++) { // column
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
