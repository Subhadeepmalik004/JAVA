package array;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
//        int[] nums = arr;  // Shallow Copy
////        for(int ele : nums){
////            System.out.print(ele + " ");
////        }
//        nums[0] = 70;
//        for(int ele : nums) {
//            System.out.print(ele + " ");
//        }
//        System.out.println();
        // Deep Copy
        int[] brr = Arrays.copyOf(arr, arr.length);
        for(int ele : brr){
            System.out.print(ele + " ");
        }
        System.out.println();

        // Re-initialize of Deep Copy array
        int[] crr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            crr[i] = arr[i];
        }
        crr[0] = 100;
        System.out.println(arr[0]);
    }
}
