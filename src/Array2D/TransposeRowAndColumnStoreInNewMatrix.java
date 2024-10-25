package Array2D;

public class TransposeRowAndColumnStoreInNewMatrix {
    public static void main(String[] args) {
        // 1 2
        // 3 4
        // 5 6
        int[][] arr = {{1,2},{3,4},{5,6}};
        int m = arr.length;
        int n = arr[0].length;
        // Storing
        int[][] transpose = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
