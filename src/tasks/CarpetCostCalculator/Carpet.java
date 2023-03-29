package tasks.CarpetCostCalculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        //validating length
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }
    public double getCost() {
        return cost;
    }
}


