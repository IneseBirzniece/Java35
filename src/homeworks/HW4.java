package homeworks;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        /*     Write an application, that will read two numbers from user
        (of type int) and will print true, if both numbers are the
        same sign (both are positive, or both are negative), or false
        otherwise.

        If at least one of given numbers is equal to 0, your application
        should print false.*/

        int a, b;
        Scanner reader=new Scanner(System.in) ;
        System.out.println("Enter first number:");
        a = reader.nextInt();
        System.out.println("Enter second number:");
        b = reader.nextInt();


        if (a > 0 && b > 0){
            System.out.println("True");
        }else if (a < 0 && b < 0) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }


        //also this works Laura Ozolina's solutions
        System.out.println( a * b > 0);

    }
}
