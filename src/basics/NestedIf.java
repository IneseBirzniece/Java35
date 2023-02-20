package basics;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your score (1 - 100) ");
        float score = scanner.nextFloat();
        //less than 40 %
        // 40 % - 80%
        // 81 % - 100%

        if (score > 100) {
            System.out.println("Invalid number");
        } else if (score <= 40.0f) {
            System.out.println("Score is <= 40%");
            } else if (score <= 80.0f) {
                System.out.println("Score is <= 80%");
                //nested if part - for specific comments

                if (score <= 60.0f){
                    System.out.println("<= 60%");
                }else {
                    System.out.println("> 60%");
                }

            }else {
            System.out.println("Score is <= 100%");
        }

    }
}
