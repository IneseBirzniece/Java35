package basics;

import java.util.Scanner;

public class MyProject1 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in) ;
        System.out.println("Enter the number:");
        int number1 = reader.nextInt();
        System.out.println("You entered: " + number1);

        System.out.println("Addition of two numbers:");
        System.out.println("Enter first number:");
        int number2 = reader.nextInt();
        System.out.println("Enter second number:");
        int number3 = reader.nextInt();
        int sum = number2+number3;
        System.out.println(number2 + "+" + number3 + "=" + sum);

    }
}
