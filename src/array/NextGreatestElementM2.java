package array;

public class NextGreatestElementM2 {
    public static void main(String[] args) {
        int[] arr = {12,8,60,37,2,49,16,28,21};
        int n = arr.length;
        int[] c = new int[n];
        c[n-1] = -1;
        int nge = arr[n-1];
//        Method 2 :
        for(int i=n-2; i>=0; i--) {
            c[i] = nge;
            nge = Math.max(nge,arr[i]);
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
