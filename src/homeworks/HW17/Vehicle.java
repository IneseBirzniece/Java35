package homeworks.HW17;

import java.util.Scanner;

public class Vehicle {
    private float fuel;
    //if we create subclass then we should use protected
    private float fuelUsage;
    private int passengers;

    public Vehicle(float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public void maxDistance(float fuel, float fuelUsage, int passengers){
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
        double distance = 100 * (fuel/(fuelUsage + 0.05f * passengers * fuelUsage));
        System.out.printf("Your vehicle can drive maximum of %.2f kilometers \n", distance);
    }

    public float maxDistance2(){
        return 100 * (fuel/(fuelUsage + 0.05f * passengers * fuelUsage));
    }

/*    public void Fuel(double fuel){
        this.fuel = fuel;
    }
    public double getFuel() {
        return fuel;
    }

    public void FuelUsage(double fuelUsage){
        this.fuelUsage = fuelUsage;
    }
    public double getFuelUsage() {
        return fuelUsage;
    }
    public void Passengers(int passengers){
        this.passengers = passengers;
    }
    public int getPassengers() {
        return passengers;
    }


    public maxDistance1(){
        double distance = 100 * (Fuel()/(FuelUsage() + 0.05 * Passengers() * FuelUsage()));
        float distance1 = (float) distance;
        System.out.printf("Your vehicle can drive maximum of %.2f kilometers \n", distance1);
    }*/

}
