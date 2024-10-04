package array;

import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " " + list.size());
        list.add(60);  // 0
        System.out.println(list + " " + list.size());
        list.add(20);  // 1
        System.out.println(list + " " + list.size());
        list.add(50);  // 2
        System.out.println(list + " " + list.size());
        list.add(40);  // 3
        System.out.println(list + " " + list.size());
        list.add(-80);  // 4
        System.out.println(list + " " + list.size());

        list.remove(3);
        System.out.println(list + " " + list.size());
    }
}
