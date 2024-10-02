package Array;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 23, 97, 3, 6, 78, 23, 90};
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
