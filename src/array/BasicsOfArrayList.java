package array;

import java.util.ArrayList;

public class BasicsOfArrayList {
    public static void main(String[] args) {
//        int[] arr = new int[6];
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0, 10);  // arr[0] = 10;
        arr.add(1, 20);  // Initialize
        arr.add(2, 30);
        arr.add(3, 40);
        arr.add(4, 50);
        arr.add(5, 60);
        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i) + " ");  // are[i]
        }
        System.out.println();
        arr.set(2,300);  // Modify
        for(int i=0; i<arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr.add(90);  // Push Back
        System.out.println(arr.size());
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        // print array list
        System.out.println(arr);
    }
}

// arr.add(0,30); -->> in 0 index we are add(Initialize) this value
// arr.set(0,50); -->> in 0 index we are Update / modify the value
// arr.get(3);    -->> print 3 index menning Output
// arr.add(90);   -->> Push 90 to the end of the list / array
// Array size -->> arr.size();