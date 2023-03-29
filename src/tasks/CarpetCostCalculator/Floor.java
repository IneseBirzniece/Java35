package tasks.CarpetCostCalculator;

public class Floor {
    private double width;
    private double length;

    public Floor(double length, double width){
        //validating length
        if (length < 0 ){
            this.length = 0;
        }else{
            this.length = length;
        }
        //validating width
        if (width < 0 ){
            this.width = 0;
        }else{
            this.width = width;
        }

    }

    public double getArea(){
        return length * width;
    }

}
