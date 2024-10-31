package Array2D;

public class FlippingMatrix {
    public static void main(String[] args) {
        int[][] arr = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int m = arr.length, n = arr[0].length;
        // put 1 at the 0th position of every row
        for (int i = 0; i < m; i++) {
            if(arr[i][0] == 0){ // flip that row
                for (int j = 0; j < n; j++) {
                    if (arr[i][j]==0) arr[i][j] = 1;
                    else  arr[i][j] = 0;
                }
            }
        }
        // flip those column where (no of 0s > no of 1s)
        for(int j=1;j<n;j++){
            int noOfZeroes = 0, noOfOnes = 0;
            for(int i=0;i<m;i++){
                if(arr[i][j] == 0) noOfZeroes++;
                else noOfOnes++;
            }
            // flip
            if(noOfZeroes>noOfOnes){ // flip that column
                for(int i=0;i<m;i++){
                    if (arr[i][j]==0) arr[i][j] = 1;
                    else  arr[i][j] = 0;
                }
            }
        }
        // sum calculat
        int score = 0;
        int x=1;
        for(int j=n-1;j>=0;j--){
            for(int i=0; i<m;i++){
                score += (arr[i][j]*x);
            }
            x *= 2;
        }
        System.out.print(score+" ");
    }
}
