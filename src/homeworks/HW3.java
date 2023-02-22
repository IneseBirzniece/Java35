package homeworks;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        /*      Write an application, that will read one number from user (of type int)
        and check, if given number is "near" 100. A number is "near" 100 when
        difference between it and 100 is no bigger than 10.

        Your application should read one number (int) and print false or true on the screen,
        according to instructions above.*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter one number:");
        Integer num = scanner.nextInt();
        int diff;
        diff = Math.abs(100 - num);

        if (diff <= 10){
            System.out.println("True, your number is near 100");
        } else {
            System.out.println("False, your number isn't near 100");
        }
    }
}
