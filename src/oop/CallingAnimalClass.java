package oop;

public class CallingAnimalClass {
    public static void main(String[] args) {

        //creating new animal class object
        Animal dog = new Animal("German Shepherd", 12, 35d);
        dog.printAnimalInfo();
        System.out.println();
        Animal cat = new Animal("Persian", 19, 6.2d);
        cat.printAnimalInfo();
        Animal golgfish = new Animal("Goldfish", 3);
        golgfish.printAnimalInfo();
        Animal dog2 = new Animal();
        dog2.printAnimalInfo();



    }
}
