package Array2D;

public class SumAllElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,5,6},{2,-9,30},{5,10,3}};
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum all the element in 2D Array : "+sum);
    }
}
