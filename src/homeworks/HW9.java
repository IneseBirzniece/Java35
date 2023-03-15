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

        String[] ChristmasTree = new String[(int) ChristmasTreeSize];

        String space = " ";
        String star = "*";

        for (int i = 0; i <= ChristmasTreeSize; i++) {
            if (i < (ChristmasTreeSize-1)) {
                ChristmasTree[i] = space;
            }else{
                ChristmasTree[i] = star;
            }
        }


        for (int i = 0; i < ChristmasTree.length; i++) {
            System.out.println(ChristmasTree[i]);

        }
    }
}
