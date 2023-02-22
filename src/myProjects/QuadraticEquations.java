package myProjects;

import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        System.out.println("We will solve equation ax^2+bx+c=0");
        float a, b, c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("a=");
        a = scanner.nextFloat() ;
        System.out.print("b=");
        b=scanner.nextFloat();
        System.out.print("c=");
        c=scanner.nextFloat();
        System.out.println( a + "x^2+" + b + "x+" + c + "=0" );

        if(a==0) {
            if (b == 0) {
                if (c==0){
                System.out.println("identity 0=0");
                } else {
                    System.out.println("false identity");
                }
            }else{
                    System.out.println("We have to solve bx+c=0");
                    float x;
                    x = -c / b;
                    System.out.print("x=");
                    System.out.println(x);
                }

                }else {
            float D;
            D=b*b-4*a*c;
            System.out.println("D = " + D);
            float x1, x2;
            x1 = (-b + D)/ (2 * a);
            x2 = (-b - D)/ (2 * a);
            System.out.print("x1=");
            System.out.println(x1);
            System.out.print("x2=");
            System.out.println(x2);
        }
    }

}
