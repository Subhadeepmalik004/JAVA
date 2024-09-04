package Pattern_Printing.Squares;

import java.util.Scanner;

public class UserInputAndPrintABCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= n; j++){
                System.out.print((char) (j+64) +" "); // when * is geven then write thid "* "
            }
            System.out.println();
        }
    }
}

//when Input is (char) (i+64) then Output is --->>
//    A A A A
//    B B B B
//    C C C C
//    D D D D


// when Input is (char) (j+64) then Output is -->>
//    A B C D
//    A B C D
//    A B C D
//    A B C D


// ASCII value  A -->> 65
//              a -->> 97