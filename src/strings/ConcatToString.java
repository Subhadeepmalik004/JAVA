package strings;

import java.util.Scanner;

public class ConcatToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st String : ");
        String s = sc.nextLine();
        System.out.print("Enter the next string to added : ");
        String s1 = sc.nextLine();
        System.out.println(s.concat(" "+s1));
    }
}
