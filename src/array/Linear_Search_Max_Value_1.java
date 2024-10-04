package array;

public class Linear_Search_Max_Value_1 {
    public static void main(String[] args) {
        int[] arr = {10, 8, 43, 12, 5, 56, 3};
        int n = arr.length;
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] > max) max = arr[i];
        }
        System.out.println(max);
    }
}
