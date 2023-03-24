package oop.abstraction;

//Abstract class
abstract class Animal{
    protected String name;
    //Regular method
    public void sleep(){
        System.out.println("Zzzz..");
    }
    //abstract method
    public abstract void animalSound();

}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("oink, oink");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {

        //from abstract classes cannot create an object directly as shown in the next line
        //Animal animal1 = new Animal();

        Pig pig = new Pig();
        pig.sleep();
        pig.animalSound();


    }
}
