import java.util.Scanner;

public class OperationsWithNumbers {
    public static void main(String[] args) {
        int a, b, c, d, e;
        float g;
        Scanner reader=new Scanner(System.in) ;
        System.out.println("Enter two numbers:");
        a = reader.nextInt();
        b = reader.nextInt();

        c = a + b;
        d = a - b;
        e = a * b;
        g = (float) a / b;

        System.out.println("Sum c = " + c);
        System.out.println("Difference d = " + d);
        System.out.println("Multiplication e = " + e);
        System.out.println("Division g = " + g);

    }
}
