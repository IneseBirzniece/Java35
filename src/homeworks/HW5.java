package homeworks;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        /*      Alex is an owner of grocery store. Among many products he sells,
        he's mostly famous for his hand-made jam, that is being
        sold in jars of 1kg or 7kg. Alex sells only full jars
        (i.e. it's only possible to buy the whole jar of 1kg, or 7kg).

        Will is asked by his wife Jane to buy some amount of Alex's jam.
        Will forgot to take his bag, thus he can take home no more than six jars of jam
        (three jars in each of his two hands). Jane is very serious about the
        shopping list - if she asked for specific amount of jam, she expects exactly this
        amount, no more, no less.

        Write an application that will check if Will is able to take home the
        amount of jam specified by Jane. Amount of jam should be read from user
        (positive int value). You can assume that there's always enough jam in Alex's shop.
        Your application should print true or false.*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter amount of jam you need:");
        int jam = scanner.nextInt();
        int a, b, c;
        // a = amount of jam in 7 kg jars
        // b = amount of jam in 1 kg jars
        // c = amount of jars

        // a = (int) (Math.floor(jam/7));
        a = jam / 7; //because we ar using int type we don't need to round down
        b = jam % 7;
        c = a + b;

        //We could also write 32-34 in one line: c = ((jam / 7) + (jam % 7))

        //chek if its even possilbe
        if (jam <= 42) {
            if (c <= 6){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }else {
            System.out.println("Sorry, I can't buy this amount of jam.");
        }


    }
}
