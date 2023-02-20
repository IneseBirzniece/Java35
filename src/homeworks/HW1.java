package homeworks;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        // Using scanner ask user to enter name and year of birth
        // Input:
        //      John, 2000
        // Print out:
        //      "Your name is John and you are 22 years old"

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your year of birth:");
        Integer year = scanner.nextInt();
        System.out.println("Please enter your birth month:");
        scanner.nextLine();
        String month = scanner.nextLine();

         int y, age, age1;
        y = 2023;

        if ( (month.equals("January") || month.equals("january") ) || (month.equals("February")|| month.equals("february"))) {
            age = y - year;
            System.out.println("Your name is " + name + " and you are " + age + " years old");
        }else{
            age1 = y - 1 - year;
            System.out.println("Your name is " + name + " and you are " + age1 + " years old");
        }

    }
}
