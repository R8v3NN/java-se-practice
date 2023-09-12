package exercises.intermediate.carpetcostcalculator;

public class CarpetCostCalculator {
    private final CarpetFloor floor;
    private final Carpet carpet;

    public CarpetCostCalculator(CarpetFloor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost() {
        return floor.getLength() * floor.getWidth() * carpet.getCost();
    }
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        CarpetFloor floor = new CarpetFloor(2.75, 4.0);
        CarpetCostCalculator calculator = new CarpetCostCalculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new CarpetFloor(5.4, 4.5);
        calculator = new CarpetCostCalculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}
