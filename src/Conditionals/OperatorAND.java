package Conditionals;

import java.util.Scanner;

public class OperatorAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if(99<n && n<1000) System.out.println("3 Digit Number");
        else System.out.println("Not a 3 Digit Number");
    }
}


// c1 && c2  -->> Ans.
// T     T   -->> T
// T     F   -->> F
// F     T   -->> F
// F     F   -->> F