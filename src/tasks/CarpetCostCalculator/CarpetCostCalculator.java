package tasks.CarpetCostCalculator;

import java.util.Scanner;

public class CarpetCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length: ");
        double length = scanner.nextDouble();
        System.out.println("Width: ");
        double width = scanner.nextDouble();
        //floor class object
        Floor floor = new Floor(length, width);
        System.out.println("Floor is " + floor.getArea() + " m^2");

        System.out.println("Carpet cost per m^2: ");
        double cost = scanner.nextDouble();

        //carpet class object
        Carpet carpet = new Carpet(cost);
        System.out.println("Carpet costs " + carpet.getCost() + "$ per m^2");

        Calculator calculator = new Calculator(floor, carpet);
        calculator.getTotalCost();
        System.out.println("In total carpet will cost " + calculator.getTotalCost() + " $");

    }
}
