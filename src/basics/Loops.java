package basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
        for loop (counter declaration - define new variable, to count how many times we executed the loop, for example, i=0;
         condition - final condition, usualy uses < or > signs, for example, i<=10;
         modification of the counter - how we do modifications, for example, i++ )
         */
        //print out Hello world 10 times
        for (int i = 0; i<3; i++) {
            System.out.println("Hello world!");
        }

        //parasti nevar izmantot to pašu i, bet iepriekš i bija local variable - šis cikls to neredz
        for (int i=0; i <= 10; i = i+2){
            System.out.print(i + " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter whole number from 1 to 50");
        Integer i = scanner.nextInt();
        //int i=1;
        while (i <= 50) {
            System.out.print(i + " ");
            i += 3;
        }

    }
}
