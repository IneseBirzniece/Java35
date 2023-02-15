package basics;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a grade");
        int grade = scanner.nextInt();
        //If grade >6 then print out "good job"
        /* if (grade > 6) {
            System.out.println("Good job!");
        }
        if (grade <= 4){
            System.out.println("You can do better ;)");
       }

        if (grade >= 4) {
            System.out.println("You have past the test!");
        } else {
            System.out.println("You have failed the test");
        } */

        //Print comments about grades:
        if (grade >= 1 && grade <= 3){
            System.out.println("Very bad");
        } else if (grade == 4 || grade == 5){
            System.out.println("Okey");
        } else if (grade == 6){
            System.out.println("Nice");
            //next line means grade >=7 and <=10
        } else if (grade > 6 && grade < 11){
            System.out.println("Very good");
        } else {
            System.out.println("Invalid input");
        }
    }


}
