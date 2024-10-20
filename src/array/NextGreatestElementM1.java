package array;

public class NextGreatestElementM1 {
    public static void main(String[] args) {
        int[] arr = {12,8,41,37,2,49,16,28,21};
        int n = arr.length;
        int[] c = new int[n];
        c[n-1] = -1;
//        Method 1 : Brute Force
        for(int i=0; i<n-1; i++) {
            int mx = Integer.MIN_VALUE;
            for(int j=i+1; j<n; j++) {
                mx = Math.max(mx,arr[j]);
            }
            c[i] = mx;
        }
        for (int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for (int ele: c){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}


// this code is time-consuming