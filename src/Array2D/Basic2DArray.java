package Array2D;

public class Basic2DArray {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        // 10 20 30
        // 40 50 60
        // 70 80 90
        grid[0][0] = 10;
        grid[0][1] = 20;
        grid[0][2] = 30;
        System.out.println(grid[0][1]); // 20
        // empty 2D Array store value is 0
        System.out.println(grid[2][1]); // 0
    }
}
