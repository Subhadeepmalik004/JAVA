package strings;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("using .next()");
//        System.out.print("Enter your name : ");
//        String str = sc.next();
//        System.out.print("Hi ");
//        System.out.println(str);

        // .nextLine()
        System.out.println("using .nextLine()");
        System.out.print("Enter your name : ");
        String str1 = sc.nextLine();
        System.out.print("Hi ");
        System.out.println(str1);
    }
}

// .next() -->> only print "Subha" not print "Subha Malik"
// .nextLine()  -->> print all sentence