package Conditionals;

import java.util.Scanner;

public class OperatorOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if(n%5 == 0 || n%3 == 0) System.out.println("Divisible by 5 or 3");
        else System.out.println("Not Divisible by 5 or 3");
    }
}


// c1 || c2  -->> Ans.
// T     T   -->> T
// T     F   -->> T
// F     T   -->> T
// F     F   -->> F
