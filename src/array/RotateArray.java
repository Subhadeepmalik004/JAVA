package array;

// after 2 rotation
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        int k = 2;  // 2 rotation
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        // Reverse
        for(int i=n-k;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int j=0;j<n-k;j++){
            System.out.print(arr[j]+" ");
        }
    }
}

// Using