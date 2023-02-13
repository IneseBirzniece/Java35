import java.util.Scanner;

public class OperationsWithNumbers2 {public static void main(String[] args) {
    float a, b, c, d, e, g;
    Scanner reader=new Scanner(System.in) ;
    System.out.println("Enter 2 decimal numbers:");
    a = reader.nextFloat();
    b = reader.nextFloat();

    c = a + b;
    d = a - b;
    e = a * b;
    g = a / b;

    System.out.println("Sum c = " + c);
    System.out.println("Difference d = " + d);
    System.out.println("Multiplication e = " + e);
    System.out.println("Division g = " + g);

}
}

