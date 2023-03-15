package oop;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //main method - šis jau ir piemērs metodei
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String userName = scanner.nextLine();
        System.out.println("Please enter your name:");
        String name2 = scanner.nextLine();
        System.out.println("Please enter your age:");
        int usersAge = scanner.nextInt();



        //to call our method to be executed
        //java finds method, in this case printName
        // printName(userName);
        printNameAndAge(userName, usersAge);
        printNameAndAge(name2, usersAge);

        //pēc metodes atgriežas šajā programmas daļā un turpina veikt darbībaas

        System.out.println("Good job!");

        //var izmantot atkārtoti; šeit printName ir parametrs
        // printName("Bob");
        // printName("Lisa");

        System.out.println(sum(4, 5, 6));

    }

    //mūsu jauna metode - kaut ko print out
    //metodes nosaukums - printName
    public static void printName(String name){
        //šajā daļā printName ir arguments
        System.out.println("Hello, your name is " + name);

    }

    public static void printNameAndAge(String name, int age){
        //šajā daļā printName ir arguments
        System.out.println("Hello, your name is " + name);
        System.out.println("You are " + age + " years old");

    }

    public static int sum (int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

}
