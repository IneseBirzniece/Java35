package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        /* Average grade in array:
            Use the same functionality from previous task (change array type to float) and create array.
            Sum all elements in the array and calculate average grade.
            Ask for user to enter a positive number that will be the arrays size
            Create an empty array that will contain Float data type values in size of entered value
            Using for loop ask user to enter array elements one by one
            Calculate and print out all value average
            Print out count of grades: */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of grades will be: ");
        float numberOfGrades = scanner.nextFloat();

        float[] grades = new float[(int) numberOfGrades];

        float averageGrade = 0;
        float sumOfGrades = 0;


        for (int i = 0; i < numberOfGrades; i++) {
            System.out.println("Grade no. " + (i+1) + " is " );
            if (scanner.hasNextInt()) {
                grades[i] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.toString(grades));

        for (int i = 0; i < grades.length; i++) {
            averageGrade = (sumOfGrades += grades[i])/(i+1);
        }

        System.out.format("%.2f", averageGrade);

    }
}