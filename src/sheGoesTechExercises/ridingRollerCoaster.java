package sheGoesTechExercises;

import java.util.Scanner;

public class ridingRollerCoaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your height (in cm):");
        int height = scanner.nextInt();
        System.out.println();
        System.out.println("Please enter your weight (in kg):");
        float weight = scanner.nextFloat();

        if(height > 150 && weight < 180){
            System.out.println("Fasten your seatbelt!");
        }else{
            System.out.println("I'm sorry you can't go!");
        }

    }
}
