package BasicsJava;
import java.util.Scanner;
public class InputSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println(n*n);
    }
}
