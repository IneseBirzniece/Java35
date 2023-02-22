package myProjects;

import java.util.Scanner;

public class LinearEquations {
    public static void main(String[] args) {
        System.out.println("We will solve equation ax+b=0");
        float a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.print("a=");
        a = scanner.nextFloat() ;
        System.out.print("b=");
        b=scanner.nextFloat();
        if(a==0)
            if(b==0)
                System.out.println("identity 0=0");
            else
                System.out.println("false identity");
        else {
            float x;
            x = -b / a;
            System.out.print("x=");
            System.out.println(x);
        }
    }
}
