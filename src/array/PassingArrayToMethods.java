package array;

public class PassingArrayToMethods {
    // Pass by Value     -->> int, flot, double etc.
    // Pass by Reference -->> Array

    // Pass by Value     -->> int, flot, double etc.
//    public static void main(String[] args) {
//        int x = 5;
//        System.out.println(x);
//        change(x);
//        System.out.println(x);
//    }
//    public static void change(int x) {
//        x = 10;
//    }
    // Output is - 5 and 5

    // Pass by Reference -->> Array
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] arr) {
        arr[0] = 90;
    }
    // Output is - 10 and 90

}