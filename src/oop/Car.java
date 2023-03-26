package oop;

public class Car {
    //Fields

    // if we write like this
/*    String color;
    String brand;
    int maxSpeed;*/
    //we can access those fields in a calling file by "car1.brand = carBrand;"

    //labais stils - izmantot setter-getter methods
    //private nozīmē, ka ir pieejams tikai šajā failā
    private String color;
    private String brand;
    private int maxSpeed;

    //setter methods - for setting value
    public void setColor(String color){
        this.color = color;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed >= 30){
            this.maxSpeed = maxSpeed;
        }else{
            System.out.println("Invalid input");
        }
    }


    //getter methods - for getting value
    public String getColor(){
        return color;
    }
    public String getBrand() {
        return brand;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    //method

    //ja pēc public liek static, tad var komandu ureiz izpildīt Calling failā;
    // nav static, tas nozīmē, ka Calling failā ir jāievada info par mašīnu un tikai tad var izpildīt printInfo
    public void printCarInfo(){
        System.out.println("Car info: ");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Max speed: " + maxSpeed);
    }






}
