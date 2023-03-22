package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
                /* Write a Java program to reverse an array of integer values.
 Create an array (int type) put some random values in array and print out all
elements.
 Use for loop to iterate through array and switch places with first and last
element and then second from beginning and second from end etc. with rest
of the elements
 Print out array elements using Arrays.toString() method

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array size will be: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];
        int[] reverseArray = new int[arraySize];

        int sum = 0;


        for (int i = 0; i < arraySize; i++) {
            System.out.println("Array element no. " + (i+1) + " is " );
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.toString(array));
/*
        for (int i = 0; i < array.length; i++) {
            sum += arrayForSum[i];
        }
        System.out.println(sum);*/

    }
}
