package array;

public class PartOfArrayReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        // Part of Array Reverse
        int i = 1, j = 5;  ///  ************* CHANGE THAT **********///
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


// Output
// 10 20 30 40 50 60 70
// 10 60 50 40 30 20 70
//only change index 1 to index 5