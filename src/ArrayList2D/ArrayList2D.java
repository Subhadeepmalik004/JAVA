package ArrayList2D;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2D {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a); l.add(b); l.add(c); l.add(d);

         // only print array a
//        for(int i=0;i<a.size();i++){
//            System.out.print(a.get(i)+" ");
//        }

        // print array list l
//        for(int i=0;i<l.size();i++){
//            System.out.println(l.get(i));
//        }

        // only print array l in index (1,1)
//        System.out.println(l.get(1).get(1));

        // using extra variable (loop under loop)
//        for(int i=0;i<l.size();i++){
//            List<Integer> x = l.get(i);
//            for (int j = 0; j<x.size(); j++){
//                System.out.print(x.get(j)+" ");
//            }
//            System.out.println();
//        }

        // without extra variable (loop under loop)
        for(int i=0;i<l.size();i++){
            for (int j = 0; j<l.get(i).size(); j++){
                System.out.print(l.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}

/* add() --> add at back
*  remove() --> remove at back
* get()  -->> all list are present
* size()  -->> size of 2D array
* clear()  -->> clear the array
* isEmpty()  -->> Empty array
* Contains()  -->> particular array contains in array
* indexOf()  -->> array index
* toArray() -->> 1D or 2D Array to normal Array
* */