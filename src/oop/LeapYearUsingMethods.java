package oop;

import java.util.Scanner;

public class LeapYearUsingMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year:");

        int year = scanner.nextInt();

        //we dont have to put in any return type because all is written in our void method
        
        determineLeapYear(year);
    }
    public static void determineLeapYear(int year) {
        if (year < 0) {
            System.out.println("Invalid input");

        } else if (year > 2100) {
            System.out.println("You are looking too far in the future, live for today");

        } else {

            if (year % 400 == 0) {
                System.out.println("Leap year");
            } else if ((year % 4 == 0) && (year % 100 > 0)) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }
        }
    }

}
