package array;

public class Linear_Search_Max_Value_2 {
    public static void main(String[] args) {
        int[] arr = {-10, -8, -430, 12, -5234, -56};
        int n = arr.length;
        int max = Integer.MIN_VALUE;  // -2147483648
        for(int i=0; i<n; i++){
            // if(arr[i]>max) max = arr[i];
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }
}
