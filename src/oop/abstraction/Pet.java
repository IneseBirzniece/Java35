package oop.abstraction;

public abstract class Pet {

    protected String color;
    protected String eat;
    protected String place;
    protected int averageAge;

    //custom constructor - wont inherit into different class
    public Pet(String color, String eat, String place, int averageAge){
        this.color = color;
        this.eat = eat;
        this.place = place;
        this.averageAge = averageAge;

    }

    public abstract void printPetInfo();

}
