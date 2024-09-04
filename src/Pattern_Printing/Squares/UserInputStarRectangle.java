package Pattern_Printing.Squares;

import java.util.Scanner;

public class UserInputStarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= n; j++){
                System.out.print(j+" "); // when * is geven then write thid "* "
            }
            System.out.println();
        }

    }
}


// if we will pute j++ the output is -->>
//        1 2 3 4
//        1 2 3 4
//        1 2 3 4
//        1 2 3 4

// Or we will pute i++ the output is -->>
//        1 1 1 1
//        2 2 2 2
//        3 3 3 3
//        4 4 4 4