package collections;

import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {

        //declaring array list object
        ArrayList<String> car = new ArrayList<String>();

        //add elements
        car.add("Volvo");
        car.add("BMW");
        car.add("Audi");
        car.add("Jeep");
        car.add("Porsche");

        //print out all elements
        System.out.println(car);

        //get element by index
        System.out.println(car.get(0));

        //add element at specific index
        car.add(0, "Toyota");
        System.out.println(car.get(0) + " " + car.get(4));
        System.out.println(car.get(1));
        System.out.println(car);

        //change element value
        car.set(3, "Ferrari");
        System.out.println(car);

        //remove elements
        car.remove(1);
        System.out.println(car);

        car.add("BMW");
        System.out.println(car);

        car.remove("BMW");
        System.out.println(car);

        //size
        car.size();
        System.out.println(car.size());

        //deleting all elements
        car.clear();
        System.out.println(car);

    }
}
