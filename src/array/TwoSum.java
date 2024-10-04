package array;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,-1,8,5,4,9,2};
        int x = 9;
        int n = arr.length;
        // solution
        for(int i=0; i<n; i++){
            boolean flag = false;  // optimization
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j] == x){
                    System.out.println(arr[i] + " " + arr[j]);
                    arr[0] = i;
                    arr[1] = j;
                    System.out.println("Array index: " + i +" " +j);

                    flag = true;  // optimization
                    break;  // optimization
                }
            }
            if(flag == true) break;  // optimization
        }
    }
}
