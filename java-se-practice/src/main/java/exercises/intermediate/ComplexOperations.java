package exercises.intermediate;

public class ComplexOperations {
    private double real;
    private double imaginary;
    public static void main(String[] args) {
        ComplexOperations one = new ComplexOperations(1.0, 1.0);
        ComplexOperations number = new ComplexOperations(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
    public ComplexOperations(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal(){
        return this.real;
    }
    public double getImaginary(){
        return this.imaginary;
    }
    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }
    public void add(ComplexOperations complexNumber){
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
    }
    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(ComplexOperations complexNumber){
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();
    }
}
