package array;

import static java.util.Collections.reverse;

public class RotateArrayNotUseExtraArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        int k = 9;
        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

// ***** Leedcode -> 189  ********/////

//class Solution {
//    public void reverse(int[] nums, int i, int j) {
//        while(i<=j) {
//            int temp = nums[i];
//            nums[i] = nums[j];
//            nums[j] = temp;
//            i++;
//            j--;
//        }
//    }
//    public void rotate(int[] nums, int k) {
//        int n = nums.length;
//        k = k%n;
//        reverse(nums, 0, n-k-1);
//        reverse(nums, n-k, n-1);
//        reverse(nums, 0, n-1);
//    }
//}