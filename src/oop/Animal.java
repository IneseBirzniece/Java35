package oop;

public class Animal {

    //3 fields
    private String type;
    private int avgLifespan;
    private double weight;


    //constructor - custom made
    public Animal(String type, int avgLifespan, double weight){
        this.type = type;
        this.avgLifespan = avgLifespan;
        this.weight = weight;

    }

    public Animal(String type, int avgLifespan){
        this.type = type;
        this.avgLifespan = avgLifespan;

    }
    public Animal(){

    }

    public void printAnimalInfo(){
        System.out.println("Type: " + type);
        System.out.println("Average lifespan: " + avgLifespan);
        System.out.println("Weight: " + weight);
    }


}
