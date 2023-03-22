package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {


        // nested loops
        // write in next lines
        // each level consists of certain amount of spaces some amount of stars and some amount of spaces;
        //spaces at the end  - we don't need those
        /*
        Write an application, that will draw Christmas tree according to examples below. The
height of the tree should be read from user (positive integer). Use scanner to ask
user for tree size.
*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Christmas tree size will be: ");
        int ChristmasTreeSize = scanner.nextInt();

        for (int k = 0; k <= ChristmasTreeSize; k++) {
            for (int i = 0; i <= ChristmasTreeSize - k; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= (2 * k) - 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <= ChristmasTreeSize - 1; i++) {
                System.out.print(" ");
            }
            System.out.println("#");

    }
}
