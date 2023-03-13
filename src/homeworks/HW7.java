package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        /* Sum all elements in array:
            Use the same functionality from previous task and create array.
            Sum all elements in the array.
            Ask for user to enter a positive number that will be the arrays size
            Create an empty array that will contain int data type values in size of entered value
            Using for loop ask user to enter array elements one by one
            Print out sum of all elements in the array */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Array size will be: ");
        int arraySize = scanner.nextInt();

        int[] arrayForSum = new int[arraySize];

        int sum = 0;


        for (int i = 0; i < arraySize; i++) {
            System.out.println("Array element no. " + (i+1) + " is " );
            if (scanner.hasNextInt()) {
                arrayForSum[i] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.toString(arrayForSum));

        for (int i = 0; i < arrayForSum.length; i++) {
                sum += arrayForSum[i];
            }
        System.out.println(sum);
    }
}
