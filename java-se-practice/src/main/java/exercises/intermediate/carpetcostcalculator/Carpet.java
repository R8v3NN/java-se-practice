package exercises.intermediate.carpetcostcalculator;

public class Carpet {
    private double cost;
    public Carpet(double cost) {
        setCost(cost);
    }
    public double getCost() {
        return this.cost;
    }
    private void setCost(double cost) {
        if(cost < 0) {
            this.cost = 0;
        }
        else {
            this.cost = cost;
        }
    }
}
