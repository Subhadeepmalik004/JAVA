package array;

//  Method 2 : Dutch Flag Algorithm

public class SortColoursM2 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,1,2,1,2,1,0};
        int n = arr.length;
        int mid = 0, hi = n-1, lo = 0;
        while (mid <= hi) {
            if(arr[mid] == 0){
//                swap(arr, mid, lo);
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++; mid++;
            }
            else if (arr[mid] == 1) mid++;
            else{ // arr[mid] == 2
//                swap(arr, mid, hi);
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
