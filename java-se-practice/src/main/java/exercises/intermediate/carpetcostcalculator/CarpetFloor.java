package exercises.intermediate.carpetcostcalculator;

public class CarpetFloor {
    private double width;
    private double length;

    public CarpetFloor(double width, double length) {
        setWidth(width);
        setLength(length);
    }
    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return this.length;
    }
    public void setWidth(double width) {
        if(width < 0) {
            this.width = 0;
        }
        else {
            this.width = width;
        }
    }
    public void setLength(double length) {
        if(length < 0) {
            this.length = 0;
        }
        else {
            this.length = length;
        }
    }
}
