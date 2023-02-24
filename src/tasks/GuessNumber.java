package tasks;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in) ;
        System.out.println("Please enter max random number:");
        int max = reader.nextInt();

        //Generate random number from 0 to max
        //Random rand = new Random();
        //int rand1 = rand.nextInt(max);
       //System.out.println("Random number is " + rand1);

        int rand = (int) (Math.random()*(max+1));

        //System.out.println("Random number is " +  rand);

        System.out.println("We have a random number between 0 and " + max);

        int guess;
        do {
            System.out.println("Guess the random number");
            guess = reader.nextInt();
            if (guess < rand) {
                System.out.println("Try bigger number :)");
            }else if (guess > rand ){
                //else if tāpēc, ka ja uzmin ar pirmo, šis arī tiks izpildīts
                System.out.println("Try smaller number :)");
            }

        }while (guess != rand);


        System.out.println("Congratulations, you won!");

    }
}
