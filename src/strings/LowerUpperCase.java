package strings;

import java.util.Scanner;

public class LowerUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.println(s.toLowerCase());  // lower case
        System.out.println(s.toUpperCase());
    }
}

// do not write
// s.toLowerCase() or s.toUpperCase() -->> nothing will happen

// write
// s = s.toUpperCase(); => then print