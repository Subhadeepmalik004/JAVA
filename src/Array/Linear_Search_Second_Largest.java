package Array;

public class Linear_Search_Second_Largest {
    public static void main(String[] args) {
        int[] arr = {-10, -8, -430, 12, -5234, -56};
        int n = arr.length;
        int max = Integer.MIN_VALUE;  // -2147483648
        for(int i=0; i<n; i++){
            // if(arr[i]>max) max = arr[i];
            max = Math.max(max, arr[i]);
        }

        int smax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            // if(arr[i]>smax && arr[i]!=max) smax = arr[i];
            if(arr[i] != max){
                smax = Math.max(smax, arr[i]);
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
