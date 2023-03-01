package basics;

import java.awt.datatransfer.StringSelection;
import java.util.Arrays;

public class ArrayExamples {
    //cannot name Arrays because it is already the class of java

    public static void main(String[] args) {
        //declaring array that will store 3 elements of type String
        String[] names = new String[3];

        //access value no. 1 from array
        System.out.println(names[0]);

        //set element values using each element's index
        names[0] = "Ben";
        names[1] = "Tom";
        names[2] = "Bob";

        //access value no. 1 from array
        System.out.println(names[0]);

        //access all values at once
        //Task: print out all array's values
       /* System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]); */

        //length from java
        System.out.println(names.length);


        //access all values at once - using loops - for-each loop
        for (String i : names)
            System.out.println(i + " ");

        //access all values at once - using Arrays.asList method
        System.out.println(Arrays.asList(names));


        //declare and initialize array at the same time
        String[] dreamCars = new String[] {"Audi", "BMW", "Jeep", "Porsche"};

        System.out.println(dreamCars.length);

        //iterate through all elements in array with for loop
        for (int i = 0; i < dreamCars.length; i++) {
            System.out.print(dreamCars[i] + " ");
        }

        System.out.println();

        //to give list a numbers:
        for (int i = 0; i < dreamCars.length; i++) {
            System.out.println((i+1) + ". " +dreamCars[i]);
        }

        // for each loop - loop for data structures
        //to print out all list values
        for (String car : dreamCars){
            System.out.println(car);
        }

        System.out.println(Arrays.toString(dreamCars));



        //We have an array of some amount int values
        //We need to give a comment for every element in the array if the value is odd or even

        int listOfNumbers[] = {256, 859, 65, 3363, 54, 19, 21, 8};

        for (Integer number : listOfNumbers){
            if (number % 2 == 0){
                System.out.println(number + " even");
            }else{
                System.out.println(number + " odd");
            }
        }



    }
}
