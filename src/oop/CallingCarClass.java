package oop;

import java.util.Scanner;

public class CallingCarClass {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter car's brand: ");
            String carBrand = scanner.nextLine();
            System.out.println("Please enter car's color: ");
            String carColor = scanner.nextLine();
            System.out.println("Please enter car's max spēed: ");
            int carMaxSpeed = scanner.nextInt();

            //create new class object
            Car car1 = new Car();

            //set field values with data from user
            //this approach wont work with private fields and seeter methods
/*            car1.brand = carBrand;
            car1.color = carColor;
            car1.maxSpeed = carMaxSpeed;*/

            car1.setBrand(carBrand);
            car1.setColor(carColor);
            car1.setMaxSpeed(carMaxSpeed);

            car1.printCarInfo();

            //to get only max speed in a printout
            System.out.println(car1.getMaxSpeed());

            if (car1.getMaxSpeed() >= 300 ){
                System.out.println("Sports car");
            }else {
                System.out.println("Regular car");
            }

        }

}
