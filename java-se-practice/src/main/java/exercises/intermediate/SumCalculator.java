package exercises.intermediate;

public class SumCalculator {
    private double FirstNumber;
    private double SecondNumber;

    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator ();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
    public double getFirstNumber() {
        return this.FirstNumber;
    }
    public double getSecondNumber() {
        return this.SecondNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.FirstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.SecondNumber = secondNumber;
    }
    public double getAdditionResult(){
        return this.FirstNumber + this.SecondNumber;
    }
    public double getSubtractionResult(){
        return this.FirstNumber - this.SecondNumber;
    }
    public double getMultiplicationResult(){
        return this.FirstNumber * this.SecondNumber;
    }
    public double getDivisionResult() {
        if(this.SecondNumber != 0) {
            return this.FirstNumber / this.SecondNumber;
        } else {
            return 0;
        }
    }
}
