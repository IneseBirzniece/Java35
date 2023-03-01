package basics;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //declaring 2D array with two rows and 5 columns
        //1.row My dream cars; 2.row Friend's dream cars
        String[][] dreamCars = new String[2][5];

        dreamCars[0][0] = "Audi";
        dreamCars[0][1] = "BMW";
        dreamCars[0][2] = "Jeep";
        dreamCars [0][3] = "Porsche";
        dreamCars [0][4] = "Hummer";

        dreamCars [1][0] = "Hummer";
        dreamCars [1][1] = "BMW";
        dreamCars [1][2] = "Audi";
        dreamCars [1][3] = "Ferrari";
        dreamCars [1][4] = "Porsche";

        //length of an array

        System.out.println(dreamCars.length); //gives count of rows
        System.out.println(dreamCars[0].length); // count of elements in first row
        System.out.println(dreamCars[1].length);

        // i for rows and j for columns
        for (int i = 0; i < dreamCars.length; i++){
            for (int j = 0; j < dreamCars[i].length; j++){
                System.out.print(dreamCars[i][j] + " ");
            }
            System.out.println(); //to get each row in different line
        }

    }
}
